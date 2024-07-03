package net.cash.pandoraspixels.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.cash.pandoraspixels.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class CrimsonTrunkPlacer extends TrunkPlacer {

    public static final Codec<CrimsonTrunkPlacer> CODEC = RecordCodecBuilder.create(crimsonTrunkPlacerInstance ->
            trunkPlacerParts(crimsonTrunkPlacerInstance).apply(crimsonTrunkPlacerInstance, CrimsonTrunkPlacer::new));

    public CrimsonTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.CRIMSON_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter,
                                                            RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {

        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        int height = pFreeTreeHeight;
        System.out.println("Height:" + height);
        for(int i = 0; i < height; i++){
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
        }
         return List.of();
    }
}
