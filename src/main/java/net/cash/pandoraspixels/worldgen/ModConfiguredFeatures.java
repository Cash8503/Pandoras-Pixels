package net.cash.pandoraspixels.worldgen;

import net.cash.pandoraspixels.PandorasPixels;
import net.cash.pandoraspixels.block.ModBlocks;
import net.cash.pandoraspixels.worldgen.tree.custom.CrimsonTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_KEY = registerKey("crimson");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FORTUNE_LEAF_KEY = registerKey("fortune_leaf");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHADE_LEAF_KEY = registerKey("shade_leaf");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, CRIMSON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRIMSON_LOG.get()),
                new CrimsonTrunkPlacer(24, 24, 24),

                BlockStateProvider.simple(ModBlocks.CRIMSON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 5),

                new TwoLayersFeatureSize(5, 24, 24)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PandorasPixels.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}