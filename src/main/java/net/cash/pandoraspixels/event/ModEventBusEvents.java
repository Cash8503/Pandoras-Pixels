package net.cash.pandoraspixels.event;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.ModEntities;
import net.cash.pandoraspixels.entity.custom.ViperwolfEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PandorasPixels.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.VIPERWOLF.get(), ViperwolfEntity.createAttributes().build());
    }
}
