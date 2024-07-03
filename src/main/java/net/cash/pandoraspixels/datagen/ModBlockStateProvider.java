package net.cash.pandoraspixels.datagen;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PandorasPixels.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.CRIMSON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CRIMSON_WOOD.get()), blockTexture(ModBlocks.CRIMSON_LOG.get()), blockTexture(ModBlocks.CRIMSON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRIMSON_LOG.get()), blockTexture(ModBlocks.STRIPPED_CRIMSON_LOG.get()),
                new ResourceLocation(PandorasPixels.MOD_ID, "block/stripped_crimson_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRIMSON_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CRIMSON_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CRIMSON_LOG.get()));

        blockItem(ModBlocks.CRIMSON_LOG);
        blockItem(ModBlocks.CRIMSON_WOOD);
        blockItem(ModBlocks.STRIPPED_CRIMSON_LOG);
        blockItem(ModBlocks.STRIPPED_CRIMSON_WOOD);

        blockWithItem(ModBlocks.CRIMSON_PLANKS);

        leavesBlock(ModBlocks.CRIMSON_LEAVES);

        saplingBlock(ModBlocks.CRIMSON_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.FORTUNE_LEAF_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FORTUNE_LEAF_WOOD.get()), blockTexture(ModBlocks.FORTUNE_LEAF_LOG.get()), blockTexture(ModBlocks.FORTUNE_LEAF_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get()), blockTexture(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get()),
                new ResourceLocation(PandorasPixels.MOD_ID, "block/stripped_fortune_leaf_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FORTUNE_LEAF_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG.get()));

        blockItem(ModBlocks.FORTUNE_LEAF_LOG);
        blockItem(ModBlocks.FORTUNE_LEAF_WOOD);
        blockItem(ModBlocks.STRIPPED_FORTUNE_LEAF_LOG);
        blockItem(ModBlocks.STRIPPED_FORTUNE_LEAF_WOOD);

        blockWithItem(ModBlocks.FORTUNE_LEAF_PLANKS);

        logBlock(((RotatedPillarBlock) ModBlocks.SHADE_LEAF_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SHADE_LEAF_WOOD.get()), blockTexture(ModBlocks.SHADE_LEAF_LOG.get()), blockTexture(ModBlocks.SHADE_LEAF_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SHADE_LEAF_LOG.get()), blockTexture(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get()),
                new ResourceLocation(PandorasPixels.MOD_ID, "block/stripped_shade_leaf_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SHADE_LEAF_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_SHADE_LEAF_LOG.get()));

        blockItem(ModBlocks.SHADE_LEAF_LOG);
        blockItem(ModBlocks.SHADE_LEAF_WOOD);
        blockItem(ModBlocks.STRIPPED_SHADE_LEAF_LOG);
        blockItem(ModBlocks.STRIPPED_SHADE_LEAF_WOOD);

        blockWithItem(ModBlocks.SHADE_LEAF_PLANKS);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(PandorasPixels.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
