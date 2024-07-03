package net.cash.pandoraspixels.datagen;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PandorasPixels.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CRIMSON_LOG.get())
                .add(ModBlocks.CRIMSON_WOOD.get())
                .add(ModBlocks.STRIPPED_CRIMSON_LOG.get())
                .add(ModBlocks.STRIPPED_CRIMSON_WOOD.get())

                .add(ModBlocks.FORTUNE_LEAF_LOG.get())
                .add(ModBlocks.FORTUNE_LEAF_WOOD.get())
                .add(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get())
                .add(ModBlocks.STRIPPED_FORTUNE_LEAF_WOOD.get())

                .add(ModBlocks.SHADE_LEAF_LOG.get())
                .add(ModBlocks.SHADE_LEAF_WOOD.get())
                .add(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get())
                .add(ModBlocks.STRIPPED_SHADE_LEAF_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.CRIMSON_PLANKS.get())
                .add(ModBlocks.FORTUNE_LEAF_PLANKS.get())
                .add(ModBlocks.SHADE_LEAF_PLANKS.get());
    }
}
