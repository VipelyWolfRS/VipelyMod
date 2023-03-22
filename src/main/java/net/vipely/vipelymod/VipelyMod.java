package net.vipely.vipelymod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.vipely.vipelymod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.vipely.vipelymod.block.ModBlocks;
import net.vipely.vipelymod.world.feature.ModConfiguredFeatures;
import net.vipely.vipelymod.world.gen.ModOreGeneration;

public class VipelyMod implements ModInitializer {

	public static final String MOD_ID = "vipelymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModOreGeneration.generateOres();
	}
}