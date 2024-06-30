package net.cash.pandoraspixels.event;

import net.cash.pandoraspixels.PandorasPixels;
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
    }

}
