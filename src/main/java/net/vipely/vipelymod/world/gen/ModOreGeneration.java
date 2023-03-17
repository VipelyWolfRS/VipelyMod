package net.vipely.vipelymod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.vipely.vipelymod.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
	public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
				GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRASIUM_ORE_PLACED.getKey().get());
		
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
				GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_DRASIUM_ORE_PLACED.getKey().get());
		
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
				GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_DRASIUM_ORE_PLACED.getKey().get());
	}
}
