package net.cash.pandoraspixels.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.cash.pandoraspixels.entity.custom.HexapedeEntity;
import net.cash.pandoraspixels.entity.animations.HexapedeAnims;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

public class HexapedeModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "1"), "main");
	private final ModelPart EVERYUTHING;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart lowerbody;
	private final ModelPart upperbody;
	private final ModelPart tail;
	private final ModelPart leftfront;
	private final ModelPart front;
	private final ModelPart bone6;
	private final ModelPart bone8;
	private final ModelPart bone7;
	private final ModelPart back;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart rightfront;
	private final ModelPart front2;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart back2;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart backleg;
	private final ModelPart backleft;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart backright;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart head;
	private final ModelPart face;
	private final ModelPart rightfrill;
	private final ModelPart leftfrill;
	private final ModelPart tendrils;
	private final ModelPart bone33;
	private final ModelPart bone34;

	public HexapedeModel(ModelPart root) {
		this.EVERYUTHING = root.getChild("EVERYUTHING");
		this.body = EVERYUTHING.getChild("body");
		this.neck = body.getChild("neck");
		this.lowerbody = body.getChild("lowerbody");
		this.upperbody = body.getChild("upperbody");
		this.tail = body.getChild("tail");
		this.leftfront = EVERYUTHING.getChild("leftfront");
		this.front = leftfront.getChild("front");
		this.bone6 = front.getChild("bone6");
		this.bone8 = front.getChild("bone8");
		this.bone7 = front.getChild("bone7");
		this.back = leftfront.getChild("back");
		this.bone10 = back.getChild("bone10");
		this.bone11 = back.getChild("bone11");
		this.bone12 = back.getChild("bone12");
		this.rightfront = EVERYUTHING.getChild("rightfront");
		this.front2 = rightfront.getChild("front2");
		this.bone14 = front2.getChild("bone14");
		this.bone15 = front2.getChild("bone15");
		this.bone16 = front2.getChild("bone16");
		this.back2 = rightfront.getChild("back2");
		this.bone18 = back2.getChild("bone18");
		this.bone19 = back2.getChild("bone19");
		this.bone20 = back2.getChild("bone20");
		this.backleg = EVERYUTHING.getChild("backleg");
		this.backleft = backleg.getChild("backleft");
		this.bone22 = backleft.getChild("bone22");
		this.bone23 = backleft.getChild("bone23");
		this.bone24 = backleft.getChild("bone24");
		this.backright = backleg.getChild("backright");
		this.bone26 = backright.getChild("bone26");
		this.bone27 = backright.getChild("bone27");
		this.bone28 = backright.getChild("bone28");
		this.head = EVERYUTHING.getChild("head");
		this.face = head.getChild("face");
		this.rightfrill = head.getChild("rightfrill");
		this.leftfrill = head.getChild("leftfrill");
		this.tendrils = head.getChild("tendrils");
		this.bone33 = tendrils.getChild("bone33");
		this.bone34 = tendrils.getChild("bone34");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition EVERYUTHING = partdefinition.addOrReplaceChild("EVERYUTHING", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 24.0F, -0.2143F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = EVERYUTHING.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.75F, -16.5F, 6.5F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 24).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0F, -2.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition lowerbody = body.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.5F, -16.5F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(0.5F, -1.0F, -17.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(19, 0).addBox(-0.5F, 1.0F, -17.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upperbody = body.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, 1.5F, -8.5F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(19, 10).addBox(0.5F, -2.0F, -9.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(21, 9).addBox(-0.5F, 1.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -17.25F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftfront = EVERYUTHING.addOrReplaceChild("leftfront", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition front = leftfront.addOrReplaceChild("front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone6 = front.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 43).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone8 = front.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(46, 43).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 8).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition bone7 = front.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(37, 16).addBox(1.75F, -8.5F, 2.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back = leftfront.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -4.0F));

		PartDefinition bone10 = back.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone10.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 9).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone11 = back.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 46).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 18).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -0.75F));

		PartDefinition bone12 = back.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone12.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 37).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -5.75F, 3.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightfront = EVERYUTHING.addOrReplaceChild("rightfront", CubeListBuilder.create(), PartPose.offset(-6.0F, -2.0F, 0.0F));

		PartDefinition front2 = rightfront.addOrReplaceChild("front2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone14 = front2.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone14.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 28).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone15 = front2.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(40, 45).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 27).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition bone16 = front2.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(37, 0).addBox(1.75F, -8.5F, 2.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back2 = rightfront.addOrReplaceChild("back2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, -4.0F));

		PartDefinition bone18 = back2.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone18.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 39).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone19 = back2.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(45, 38).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -0.75F));

		PartDefinition bone20 = back2.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone20.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 35).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -5.75F, 3.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition backleg = EVERYUTHING.addOrReplaceChild("backleg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backleft = backleg.addOrReplaceChild("backleft", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -12.0F));

		PartDefinition bone22 = backleft.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone22.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 31).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone23 = backleft.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(45, 34).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 21).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition bone24 = backleft.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(0, 34).addBox(1.75F, -8.5F, 2.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backright = backleg.addOrReplaceChild("backright", CubeListBuilder.create(), PartPose.offset(-6.0F, -2.0F, -12.0F));

		PartDefinition bone26 = backright.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone26.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 10).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.75F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone27 = backright.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(45, 23).addBox(1.75F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 18).addBox(1.75F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition bone28 = backright.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(14, 27).addBox(1.75F, -8.5F, 2.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = EVERYUTHING.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 7.0F));

		PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(19, 0).addBox(-2.75F, -23.0F, 5.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(45, 5).addBox(-1.75F, -21.0F, 9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -7.0F));

		PartDefinition rightfrill = head.addOrReplaceChild("rightfrill", CubeListBuilder.create(), PartPose.offset(1.0F, 19.0F, -7.0F));

		PartDefinition cube_r11 = rightfrill.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 12).addBox(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 14).addBox(1.0F, -9.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(1.0F, -7.0F, -2.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(30, 35).addBox(1.0F, -5.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -18.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leftfrill = head.addOrReplaceChild("leftfrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 19.0F, 8.0F, 0.0F, 3.1329F, 0.0F));

		PartDefinition cube_r12 = leftfrill.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 0).addBox(0.0F, -9.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(0.0F, -7.0F, -2.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -5.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -18.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition tendrils = head.addOrReplaceChild("tendrils", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, -6.75F));

		PartDefinition bone33 = tendrils.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(45, 19).addBox(-8.45F, -22.8F, 7.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 15).addBox(-8.45F, -19.55F, 0.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, 0.0F, -4.0F));

		PartDefinition cube_r13 = bone33.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.45F, -21.8F, 9.8F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone34 = tendrils.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(16, 44).addBox(-8.45F, -22.8F, 7.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.45F, -19.55F, 0.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 0.0F, -4.0F));

		PartDefinition cube_r14 = bone34.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 14).addBox(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.45F, -21.8F, 9.8F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(HexapedeAnims.hexapedetrot, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((HexapedeEntity) entity).idleAnimationState, HexapedeAnims.Hexapede_Idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		EVERYUTHING.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return EVERYUTHING;
	}
}