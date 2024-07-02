package net.cash.pandoraspixels.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.animations.DirehorseAnims;
import net.cash.pandoraspixels.entity.animations.HexapedeAnims;
import net.cash.pandoraspixels.entity.custom.DirehorseEntity;
import net.cash.pandoraspixels.entity.custom.HexapedeEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class DirehorseModel<T extends DirehorseEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "1"), "main");
	private final ModelPart EVERYTHING;
	private final ModelPart headneck;
	private final ModelPart bone11;
	private final ModelPart bone10;
	private final ModelPart bone12;
	private final ModelPart bone25;
	private final ModelPart rightveryfront;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftveryfront;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart rightfront;
	private final ModelPart bone7;
	private final ModelPart bone9;
	private final ModelPart bone13;
	private final ModelPart leftfront;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart rightback;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart leftback;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart bone8;
	private final ModelPart bone23;
	private final ModelPart bone24;

	public DirehorseModel(ModelPart root) {
		this.EVERYTHING = root.getChild("EVERYTHING");
		this.headneck = EVERYTHING.getChild("headneck");
		this.bone11 = headneck.getChild("bone11");
		this.bone10 = headneck.getChild("bone10");
		this.bone12 = headneck.getChild("bone12");
		this.rightveryfront = EVERYTHING.getChild("rightveryfront");
		this.bone = rightveryfront.getChild("bone");
		this.bone2 = rightveryfront.getChild("bone2");
		this.bone3 = rightveryfront.getChild("bone3");
		this.leftveryfront = EVERYTHING.getChild("leftveryfront");
		this.bone4 = leftveryfront.getChild("bone4");
		this.bone5 = leftveryfront.getChild("bone5");
		this.bone6 = leftveryfront.getChild("bone6");
		this.rightfront = EVERYTHING.getChild("rightfront");
		this.bone7 = rightfront.getChild("bone7");
		this.bone9 = rightfront.getChild("bone9");
		this.bone13 = rightfront.getChild("bone13");
		this.leftfront = EVERYTHING.getChild("leftfront");
		this.bone14 = leftfront.getChild("bone14");
		this.bone15 = leftfront.getChild("bone15");
		this.bone16 = leftfront.getChild("bone16");
		this.rightback = EVERYTHING.getChild("rightback");
		this.bone17 = rightback.getChild("bone17");
		this.bone18 = rightback.getChild("bone18");
		this.bone19 = rightback.getChild("bone19");
		this.leftback = EVERYTHING.getChild("leftback");
		this.bone20 = leftback.getChild("bone20");
		this.bone21 = leftback.getChild("bone21");
		this.bone22 = leftback.getChild("bone22");
		this.body = EVERYTHING.getChild("body");
		this.tail = body.getChild("tail");
		this.bone8 = body.getChild("bone8");
		this.bone23 = body.getChild("bone23");
		this.bone24 = body.getChild("bone24");
		this.bone25 = headneck.getChild("bone25");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition EVERYTHING = partdefinition.addOrReplaceChild("EVERYTHING", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.0F, -2.5642F, 0.0F, 3.1416F, 0.0F));

		PartDefinition headneck = EVERYTHING.addOrReplaceChild("headneck", CubeListBuilder.create(), PartPose.offset(0.0F, -21.0F, 11.0F));

		PartDefinition bone11 = headneck.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(7.9F, 20.7F, -11.0F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r1 = bone11.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 57).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -30.65F, 9.15F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone11.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -2.0F, -10.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -26.55F, 18.75F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -25.25F, 20.75F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone10 = headneck.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 20.7F, -11.7F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r4 = bone10.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 85).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -30.65F, 9.15F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone10.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -2.0F, -10.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -26.55F, 18.75F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone10.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -25.25F, 20.75F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone12 = headneck.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.1F, -2.75F));

		PartDefinition cube_r7 = bone12.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -8.0F, -7.0F, 2.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.7F, 8.55F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone12.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9F, 11.85F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone12.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 66).addBox(-1.0F, -8.0F, -7.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5F, 12.85F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone12.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 42).addBox(-1.0F, -8.0F, -7.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -6.1F, 12.25F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone12.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 73).addBox(-1.0F, -5.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.9F, 9.4F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone12.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 22).addBox(-1.0F, -5.0F, -2.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.4F, 4.5F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone12.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 14).addBox(-2.0F, -6.0F, -2.0F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone25 = headneck.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone25.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 2.05F, 13.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone25.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(77, 67).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.0F, 12.6F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone25.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 20).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, -3.0F, 10.6F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightveryfront = EVERYTHING.addOrReplaceChild("rightveryfront", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 7.0F));

		PartDefinition bone = rightveryfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -16.25F, 3.25F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 29).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -14.0F, 3.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone2 = rightveryfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -8.0F, 0.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -4.5F, 1.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = rightveryfront.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(90, 87).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftveryfront = EVERYTHING.addOrReplaceChild("leftveryfront", CubeListBuilder.create(), PartPose.offset(10.0F, 0.0F, 7.0F));

		PartDefinition bone4 = leftveryfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -16.25F, 3.25F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 29).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 3.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone5 = leftveryfront.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -8.0F, 0.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -4.5F, 1.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone6 = leftveryfront.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(90, 87).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightfront = EVERYTHING.addOrReplaceChild("rightfront", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone7 = rightfront.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone7.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -12.0F, 5.5F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone7.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(61, 59).addBox(-3.0F, -5.0F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -14.0F, 6.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone9 = rightfront.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(32, 66).addBox(-7.0F, -14.25F, 1.5F, 3.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone13 = rightfront.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(91, 16).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftfront = EVERYTHING.addOrReplaceChild("leftfront", CubeListBuilder.create(), PartPose.offset(11.0F, 0.0F, 0.0F));

		PartDefinition bone14 = leftfront.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone14.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -12.0F, 5.5F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone14.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 59).addBox(-3.0F, -5.0F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 6.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone15 = leftfront.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(32, 66).addBox(-7.0F, -14.25F, 1.5F, 3.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone16 = leftfront.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(91, 16).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightback = EVERYTHING.addOrReplaceChild("rightback", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -17.0F));

		PartDefinition bone17 = rightback.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone17.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -12.7F, 3.6F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone17.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 85).addBox(-1.0F, -9.0F, -1.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -9.0F, 1.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone17.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 50).addBox(-3.0F, -6.0F, -3.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -14.0F, 6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone18 = rightback.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone18.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -4.5F, 1.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone19 = rightback.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(91, 64).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftback = EVERYTHING.addOrReplaceChild("leftback", CubeListBuilder.create(), PartPose.offset(10.0F, 0.0F, -17.0F));

		PartDefinition bone20 = leftback.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone20.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 85).addBox(-1.0F, -9.0F, -1.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -9.0F, 1.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone20.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -12.7F, 3.6F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone20.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(20, 50).addBox(-3.0F, -6.0F, -3.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone21 = leftback.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone21.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -4.5F, 1.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone22 = leftback.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(91, 64).addBox(-7.0F, 0.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = EVERYTHING.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.0F, 5.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(16, 41).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -14.3F, -21.45F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -15.05F, -16.45F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(90, 44).addBox(-1.0F, -2.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -15.3F, -12.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone8 = body.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone8.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 31).addBox(-4.0F, -6.0F, -9.0F, 8.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.7F, 1.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone23 = body.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(0, 22).addBox(-5.0F, -18.7F, -13.7F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone24 = body.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone24.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -10.0F, -8.0F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -9.0F, 9.0F, 0.1134F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(DirehorseAnims.Direhorse_Trot, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((DirehorseEntity) entity).idleAnimationState, DirehorseAnims.Direhorse_Idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.headneck.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.headneck.xRot = pHeadPitch * ((float)Math.PI / 180F);
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