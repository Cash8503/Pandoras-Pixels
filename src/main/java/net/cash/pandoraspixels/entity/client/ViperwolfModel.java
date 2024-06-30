package net.cash.pandoraspixels.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.cash.pandoraspixels.entity.custom.ViperwolfEntity;
import net.cash.pandoraspixels.entity.animations.ModAnimationDefinitions;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

public class ViperwolfModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "viperwolf"), "main");
	private final ModelPart EVERYTHING;
	private final ModelPart head;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart tendrils;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone34;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart body;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart backlegs;
	private final ModelPart leg6;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart leg5;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart tail;
	private final ModelPart bone13;
	private final ModelPart bone33;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart frontlegleft;
	private final ModelPart leg3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart leg2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart frontlegright;
	private final ModelPart leg;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart leg4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;

	public ViperwolfModel(ModelPart root) {
		this.EVERYTHING = root.getChild("EVERYTHING");
		this.head = EVERYTHING.getChild("head");
		this.bone27 = head.getChild("bone27");
		this.bone28 = head.getChild("bone28");
		this.tendrils = head.getChild("tendrils");
		this.bone29 = tendrils.getChild("bone29");
		this.bone30 = tendrils.getChild("bone30");
		this.bone34 = tendrils.getChild("bone34");
		this.bone31 = bone34.getChild("bone31");
		this.bone32 = bone34.getChild("bone32");
		this.body = EVERYTHING.getChild("body");
		this.bone23 = body.getChild("bone23");
		this.bone24 = body.getChild("bone24");
		this.bone25 = body.getChild("bone25");
		this.bone26 = body.getChild("bone26");
		this.backlegs = EVERYTHING.getChild("backlegs");
		this.leg6 = backlegs.getChild("leg6");
		this.bone20 = leg6.getChild("bone20");
		this.bone21 = leg6.getChild("bone21");
		this.bone22 = leg6.getChild("bone22");
		this.leg5 = backlegs.getChild("leg5");
		this.bone17 = leg5.getChild("bone17");
		this.bone18 = leg5.getChild("bone18");
		this.bone19 = leg5.getChild("bone19");
		this.tail = EVERYTHING.getChild("tail");
		this.bone13 = tail.getChild("bone13");
		this.bone33 = tail.getChild("bone33");
		this.bone14 = bone33.getChild("bone14");
		this.bone15 = bone33.getChild("bone15");
		this.bone16 = bone33.getChild("bone16");
		this.frontlegleft = EVERYTHING.getChild("frontlegleft");
		this.leg3 = frontlegleft.getChild("leg3");
		this.bone4 = leg3.getChild("bone4");
		this.bone5 = leg3.getChild("bone5");
		this.bone6 = leg3.getChild("bone6");
		this.leg2 = frontlegleft.getChild("leg2");
		this.bone = leg2.getChild("bone");
		this.bone2 = leg2.getChild("bone2");
		this.bone3 = leg2.getChild("bone3");
		this.frontlegright = EVERYTHING.getChild("frontlegright");
		this.leg = frontlegright.getChild("leg");
		this.bone10 = leg.getChild("bone10");
		this.bone11 = leg.getChild("bone11");
		this.bone12 = leg.getChild("bone12");
		this.leg4 = frontlegright.getChild("leg4");
		this.bone7 = leg4.getChild("bone7");
		this.bone8 = leg4.getChild("bone8");
		this.bone9 = leg4.getChild("bone9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition EVERYTHING = partdefinition.addOrReplaceChild("EVERYTHING", CubeListBuilder.create(), PartPose.offset(0.5F, 24.0F, 4.5F));

		PartDefinition head = EVERYTHING.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -16.0F));

		PartDefinition bone27 = head.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(23, 26).addBox(-2.5F, -11.0F, -19.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 23).addBox(-2.0F, -10.0F, -22.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 16.0F));

		PartDefinition bone28 = head.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 16.0F));

		PartDefinition cube_r1 = bone28.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.25F, -17.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tendrils = head.addOrReplaceChild("tendrils", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.45F, 14.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone29 = tendrils.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone29.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 37).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -10.0F, -17.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone30 = tendrils.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone30.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 37).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -10.0F, -17.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone34 = tendrils.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone31 = bone34.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone31.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -12.4F, -13.2F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone32 = bone34.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone32.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 37).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -12.4F, -13.2F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = EVERYTHING.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone23 = body.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone23.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -5.0F, -10.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone24 = body.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -9.0F, -7.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone25 = body.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone25.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 15).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.0F, 1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone26 = body.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(17, 6).addBox(-2.0F, -10.25F, -16.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backlegs = EVERYTHING.addOrReplaceChild("backlegs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg6 = backlegs.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offset(2.0F, -5.0F, 4.0F));

		PartDefinition bone20 = leg6.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone20.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -1.7825F, -1.4133F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone21 = leg6.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(30, 11).addBox(-1.0F, 4.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone22 = leg6.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone22.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leg5 = backlegs.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offset(-3.0F, -5.0F, 4.0F));

		PartDefinition bone17 = leg5.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone17.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 3).addBox(-1.0F, -1.1737F, -0.6199F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.5F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone18 = leg5.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(30, 15).addBox(-1.0F, 4.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone19 = leg5.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone19.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = EVERYTHING.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition bone13 = tail.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone13.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.0F, 2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone33 = tail.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone14 = bone33.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(10, 29).addBox(-1.5F, -5.5F, 7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone15 = bone33.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(22, 23).addBox(-1.5F, -5.5F, 10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone16 = bone33.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(7, 28).addBox(-1.5F, -5.5F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontlegleft = EVERYTHING.addOrReplaceChild("frontlegleft", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition leg3 = frontlegleft.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-5.0F, -5.0F, -5.0F));

		PartDefinition bone4 = leg3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 32).addBox(-1.0F, -2.3912F, -1.2066F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone5 = leg3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(34, 26).addBox(-1.0F, 4.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone6 = leg3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 32).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leg2 = frontlegleft.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-4.0F, -5.0F, -9.0F));

		PartDefinition bone = leg2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 0).addBox(-5.0F, -3.6173F, -1.9239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = leg2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(37, 7).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -4.0F));

		PartDefinition bone3 = leg2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -2.4627F, -1.1566F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition frontlegright = EVERYTHING.addOrReplaceChild("frontlegright", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition leg = frontlegright.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(4.0F, -5.0F, -9.0F));

		PartDefinition bone10 = leg.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone10.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 21).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone11 = leg.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(37, 10).addBox(-1.0F, 4.0F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone12 = leg.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone12.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(14, 37).addBox(-1.0F, -3.0761F, -0.6173F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leg4 = frontlegright.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(5.0F, -5.0F, -5.0F));

		PartDefinition bone7 = leg4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 32).addBox(-1.0F, -2.3912F, -1.2066F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone8 = leg4.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, 4.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone9 = leg4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone9.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 34).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.Viperwolf_Run, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((ViperwolfEntity) entity).idleAnimationState, ModAnimationDefinitions.Viperwolf_Idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		EVERYTHING.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return EVERYTHING;
	}

}