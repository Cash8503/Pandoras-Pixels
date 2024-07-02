package net.cash.pandoraspixels.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.custom.HexapedeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HexapedeRenderer extends MobRenderer<HexapedeEntity, HexapedeModel<HexapedeEntity>> {

    public HexapedeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HexapedeModel<>(pContext.bakeLayer(ModModelLayers.HEXAPEDE_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(HexapedeEntity hexapedeEntity) {
        if (hexapedeEntity.isBaby()) {
            return new ResourceLocation(PandorasPixels.MOD_ID, "textures/entity/hexapede_baby.png");
        } else {
            return new ResourceLocation(PandorasPixels.MOD_ID, "textures/entity/hexapede.png");
        }
    }

    @Override
    public void render(HexapedeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
