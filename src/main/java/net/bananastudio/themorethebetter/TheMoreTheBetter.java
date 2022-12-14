package net.bananastudio.themorethebetter;

import net.bananastudio.themorethebetter.block.ModBlocks;
import net.bananastudio.themorethebetter.item.ModItems;
import net.bananastudio.themorethebetter.world.feature.ModConfiguredFeatures;
import net.bananastudio.themorethebetter.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheMoreTheBetter implements ModInitializer {
	public static final String MOD_ID = "themorethebetter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
	}
}
