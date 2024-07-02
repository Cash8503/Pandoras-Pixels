package net.cash.pandoraspixels;

import com.mojang.logging.LogUtils;
import net.cash.pandoraspixels.block.ModBlocks;
import net.cash.pandoraspixels.entity.ModEntities;
import net.cash.pandoraspixels.entity.client.DirehorseRenderer;
import net.cash.pandoraspixels.entity.client.HexapedeRenderer;
import net.cash.pandoraspixels.entity.client.ViperwolfRenderer;
import net.cash.pandoraspixels.item.ModCreativeModeTabs;
import net.cash.pandoraspixels.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PandorasPixels.MOD_ID)
public class PandorasPixels {
    public static final String MOD_ID = "pandoraspixels";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PandorasPixels() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.VIPERWOLF_SPAWN_EGG);
            event.accept(ModItems.HEXAPEDE_SPAWN_EGG);
            event.accept(ModItems.DIREHORSE_SPAWN_EGG);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.VIPERWOLF.get(), ViperwolfRenderer::new);
            EntityRenderers.register(ModEntities.HEXAPEDE.get(), HexapedeRenderer::new);
            EntityRenderers.register(ModEntities.DIREHORSE.get(), DirehorseRenderer::new);
        }
    }
}
