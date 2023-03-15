package net.vipely.vipelymod;

import net.fabricmc.api.ModInitializer;
import net.vipely.vipelymod.block.ModBlocks;
import net.vipely.vipelymod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipelyMod implements ModInitializer {

	public static final String MOD_ID = "vipelymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
