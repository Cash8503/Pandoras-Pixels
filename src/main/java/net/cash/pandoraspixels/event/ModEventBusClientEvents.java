package net.cash.pandoraspixels.event;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.client.DirehorseModel;
import net.cash.pandoraspixels.entity.client.HexapedeModel;
import net.cash.pandoraspixels.entity.client.ModModelLayers;
import net.cash.pandoraspixels.entity.client.ViperwolfModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PandorasPixels.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.VIPERWOLF_LAYER, ViperwolfModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEXAPEDE_LAYER, HexapedeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DIREHORSE_LAYER, DirehorseModel::createBodyLayer);
    }

}
