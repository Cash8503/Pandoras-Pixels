package net.cash.pandoraspixels.worldgen.tree;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.worldgen.tree.custom.CrimsonTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, PandorasPixels.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<CrimsonTrunkPlacer>> CRIMSON_TRUNK_PLACER =
            TRUNK_PLACER.register("crimson_trunk_placer", () -> new TrunkPlacerType<>(CrimsonTrunkPlacer.CODEC));

    public static void register(IEventBus eventbus) {
        TRUNK_PLACER.register(eventbus);
    }
}
