package net.cash.pandoraspixels.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.custom.DirehorseEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DirehorseRenderer extends MobRenderer<DirehorseEntity, DirehorseModel<DirehorseEntity>> {

    public DirehorseRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DirehorseModel<>(pContext.bakeLayer(ModModelLayers.DIREHORSE_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DirehorseEntity direhorseEntity) {
        if (direhorseEntity.isBaby()) {
            return new ResourceLocation(PandorasPixels.MOD_ID, "textures/entity/direhorse_baby.png"); }
        else {
            return new ResourceLocation(PandorasPixels.MOD_ID, "textures/entity/direhorse.png");
        }
    }

    @Override
    public void render(DirehorseEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
