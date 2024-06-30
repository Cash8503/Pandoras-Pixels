package net.cash.pandoraspixels.entity;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.custom.ViperwolfEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PandorasPixels.MOD_ID);

    public static final RegistryObject<EntityType<ViperwolfEntity>> VIPERWOLF =
            ENTITY_TYPES.register("viperwolf", () -> EntityType.Builder.of(ViperwolfEntity::new, MobCategory.CREATURE)
                    .sized(1f, 0.9f).build("viperwolf"));

    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
