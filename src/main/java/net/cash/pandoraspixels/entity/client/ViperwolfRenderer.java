package net.cash.pandoraspixels.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.custom.ViperwolfEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ViperwolfRenderer extends MobRenderer<ViperwolfEntity, ViperwolfModel<ViperwolfEntity>> {

    public ViperwolfRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ViperwolfModel<>(pContext.bakeLayer(ModModelLayers.VIPERWOLF_LAYER)), .6f);
    }

    @Override
    public ResourceLocation getTextureLocation(ViperwolfEntity viperwolfEntity) {
        return new ResourceLocation(PandorasPixels.MOD_ID, "textures/entity/viperwolf.png");
    }

    @Override
    public void render(ViperwolfEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
