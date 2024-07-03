package net.cash.pandoraspixels.datagen.loot;

import net.cash.pandoraspixels.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CRIMSON_LOG.get());
        this.add(ModBlocks.CRIMSON_WOOD.get(), block -> createSingleItemTable(ModBlocks.CRIMSON_LOG.get()));
        this.dropSelf(ModBlocks.STRIPPED_CRIMSON_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CRIMSON_WOOD.get());
        this.dropSelf(ModBlocks.CRIMSON_PLANKS.get());

        this.add(ModBlocks.CRIMSON_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRIMSON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.CRIMSON_SAPLING.get());

        this.dropSelf(ModBlocks.FORTUNE_LEAF_LOG.get());
        this.dropSelf(ModBlocks.FORTUNE_LEAF_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FORTUNE_LEAF_WOOD.get());
        this.dropSelf(ModBlocks.FORTUNE_LEAF_PLANKS.get());

        this.dropSelf(ModBlocks.SHADE_LEAF_LOG.get());
        this.dropSelf(ModBlocks.SHADE_LEAF_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SHADE_LEAF_WOOD.get());
        this.dropSelf(ModBlocks.SHADE_LEAF_PLANKS.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
