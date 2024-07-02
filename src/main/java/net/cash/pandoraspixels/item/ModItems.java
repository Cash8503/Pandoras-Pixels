package net.cash.pandoraspixels.item;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.entity.ModEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PandorasPixels.MOD_ID);

    public static final RegistryObject<Item> VIPERWOLF_SPAWN_EGG = ITEMS.register("viperwolf_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VIPERWOLF, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> HEXAPEDE_SPAWN_EGG = ITEMS.register("hexapede_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HEXAPEDE, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final RegistryObject<Item> DIREHORSE_SPAWN_EGG = ITEMS.register("direhorse_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DIREHORSE, 0xFFFFFF, 0xFFFFFF, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}