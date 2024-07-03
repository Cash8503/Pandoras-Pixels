package net.cash.pandoraspixels.util;

import net.cash.pandoraspixels.PandorasPixels;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CRIMSON_WOOD = tag("crimson_wood");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PandorasPixels.MOD_ID, name));
        }

    }

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(new ResourceLocation(PandorasPixels.MOD_ID, name));
    }
}
