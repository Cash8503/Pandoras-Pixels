package net.cash.pandoraspixels.datagen;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.block.ModBlocks;
import net.cash.pandoraspixels.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PandorasPixels.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VIPERWOLF_SPAWN_EGG);
        simpleItem(ModItems.HEXAPEDE_SPAWN_EGG);
        simpleItem(ModItems.DIREHORSE_SPAWN_EGG);
        saplingItem(ModBlocks.CRIMSON_SAPLING);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PandorasPixels.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PandorasPixels.MOD_ID, "item/" + item.getId().getPath()));
    }
}
