package net.cash.pandoraspixels.item;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PandorasPixels.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PANDORA_TAB = CREATIVE_MODE_TABS.register("pandora_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VIPERWOLF_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.pandora_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.ACACIA_BOAT.asItem());
                        output.accept(ModItems.VIPERWOLF_SPAWN_EGG.get());
                        output.accept(ModItems.HEXAPEDE_SPAWN_EGG.get());
                        output.accept(ModItems.DIREHORSE_SPAWN_EGG.get());

                        output.accept(ModBlocks.CRIMSON_LOG.get());
                        output.accept(ModBlocks.CRIMSON_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_LOG.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_WOOD.get());
                        output.accept(ModBlocks.CRIMSON_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_LEAVES.get());
                        output.accept(ModBlocks.CRIMSON_SAPLING.get());

                        output.accept(ModBlocks.FORTUNE_LEAF_LOG.get());
                        output.accept(ModBlocks.FORTUNE_LEAF_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get());
                        output.accept(ModBlocks.STRIPPED_FORTUNE_LEAF_WOOD.get());
                        output.accept(ModBlocks.FORTUNE_LEAF_PLANKS.get());
                        output.accept(ModBlocks.FORTUNE_LEAF.get());

                        output.accept(ModBlocks.SHADE_LEAF_LOG.get());
                        output.accept(ModBlocks.SHADE_LEAF_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get());
                        output.accept(ModBlocks.STRIPPED_SHADE_LEAF_WOOD.get());
                        output.accept(ModBlocks.SHADE_LEAF_PLANKS.get());
                        output.accept(ModBlocks.SHADE_LEAF.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
