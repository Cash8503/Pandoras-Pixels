package net.cash.pandoraspixels.entity.custom;

import net.cash.pandoraspixels.entity.ModEntities;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Random;


public class DirehorseEntity extends AbstractHorse {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT;
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private Level level;

    public DirehorseEntity(EntityType<? extends AbstractHorse> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);

    }

    private static final Random random = new Random();
    public static AttributeSupplier.Builder createAttributes() {
        double health = 10.0 + random.nextDouble() * 10.0;
        double movementSpeed = 0.25 + random.nextDouble() * 0.10;
        double jumpStrength = 0.7f + random.nextFloat() * 0.5f;

        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, health)
                .add(Attributes.MOVEMENT_SPEED, movementSpeed)
                .add(Attributes.JUMP_STRENGTH, jumpStrength)
                .add(Attributes.FOLLOW_RANGE, 24);
    }

    @Override
    public boolean isSaddled() {
        return this.isTamed();
    }

    @Override
    protected boolean canRide(Entity pVehicle) {
        return this.isTamed();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        DirehorseEntity child = ModEntities.DIREHORSE.get().create(serverLevel);

        double healthVariation = random.nextGaussian() * 2.0;  // Gaussian distribution for slight variation
        double movementSpeedVariation = random.nextGaussian() * 0.1;
        double jumpStrengthVariation = random.nextGaussian() * 0.1;

        child.getAttribute(Attributes.MAX_HEALTH).setBaseValue(Math.max(1.0, this.getAttributeValue(Attributes.MAX_HEALTH) + healthVariation));
        child.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(Math.max(0.05, this.getAttributeValue(Attributes.MOVEMENT_SPEED) + movementSpeedVariation));
        child.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(Math.max(0.1, this.getAttributeValue(Attributes.JUMP_STRENGTH) + jumpStrengthVariation));
        child.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue(24);

        return child;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
        this.goalSelector.addGoal(2, new RunAroundLikeCrazyGoal(this, 1.2));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0, DirehorseEntity.class));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.0));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.7));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        if (this.canPerformRearing()) {
            this.goalSelector.addGoal(9, new RandomStandGoal(this));
        }

        this.addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.25, Ingredient.of(new ItemLike[]{Items.ACACIA_BOAT}), false));
    }

    public boolean canMate(Animal pOtherAnimal) {
        if (pOtherAnimal == this) {
            return false;
        } else {
            return this.canParent();
        }
    }

    protected boolean handleEating(Player pPlayer, ItemStack pStack) {
        boolean flag = false;
        float f = 10.0F;

        if (!this.level().isClientSide && this.isTamed() && this.getAge() == 0 && !this.isInLove()) {
            flag = true;
            this.setInLove(pPlayer);
        }
        if (this.getHealth() < this.getMaxHealth()) {
            this.heal(f);
            flag = true;
        }

        if (this.isBaby()) {
            this.level().addParticle(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0), this.getRandomY() + 0.5, this.getRandomZ(1.0), 0.0, 0.0, 0.0);
            if (!this.level().isClientSide) {
                this.ageUp(240);
            }
            flag = true;

        }

        if (flag) {
            this.gameEvent(GameEvent.EAT);
        }

        return flag;
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (itemstack.is(Items.ACACIA_BOAT)) {
            boolean flag = this.handleEating(player, itemstack);
            return flag ? InteractionResult.SUCCESS : InteractionResult.PASS;

        } else {
            return super.mobInteract(player, hand);
        }
    }
    static {
        DATA_ID_TYPE_VARIANT = SynchedEntityData.defineId(DirehorseEntity.class, EntityDataSerializers.INT);
    }
}
