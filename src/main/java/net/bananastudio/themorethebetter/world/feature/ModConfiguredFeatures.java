package net.bananastudio.themorethebetter.world.feature;

import net.bananastudio.themorethebetter.TheMoreTheBetter;
import net.bananastudio.themorethebetter.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;


public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_RED_DIAMOND_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RED_DIAMOND_ORE.getDefaultState())
    );
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RED_DIAMOND_ORE =
            ConfiguredFeatures.register("red_diamond_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RED_DIAMOND_ORES, 9));


    public static void registerConfiguredFeatures(){
        TheMoreTheBetter.LOGGER.debug("registering the ModConfiguredFeatures for " + TheMoreTheBetter.MOD_ID);
    }
}
