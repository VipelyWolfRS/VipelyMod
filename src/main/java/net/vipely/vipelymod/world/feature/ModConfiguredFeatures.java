package net.vipely.vipelymod.world.feature;

import java.util.List;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.vipely.vipelymod.VipelyMod;
import net.vipely.vipelymod.block.ModBlocks;

public class ModConfiguredFeatures {

	public static final List<OreFeatureConfig.Target> OVERWORLD_DRASIUM_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DRASIUM_ORE.getDefaultState()),
			OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DRASIUM_ORE.getDefaultState()));
	public static final List<OreFeatureConfig.Target> OVERWORLD_DRASIUM_COAL_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DRASIUM_COAL_ORE.getDefaultState()),
			OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DRASIUM_COAL_ORE.getDefaultState()));
	
	public static final List<OreFeatureConfig.Target> NETHER_DRASIUM_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_DRASIUM_ORE.getDefaultState()));
	public static final List<OreFeatureConfig.Target> NETHER_DRASIUM_COAL_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_DRASIUM_COAL_ORE.getDefaultState()));
	
	public static final List<OreFeatureConfig.Target> END_DRASIUM_ORES = List.of(
			OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_DRASIUM_ORE.getDefaultState()));
	public static final List<OreFeatureConfig.Target> END_DRASIUM_COAL_ORES = List.of(
			OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_DRASIUM_COAL_ORE.getDefaultState()));
	
	
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DRASIUM_ORE =
			ConfiguredFeatures.register("drasium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DRASIUM_ORES, 6));
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DRASIUM_COAL_ORE =
			ConfiguredFeatures.register("drasium_coal_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DRASIUM_COAL_ORES, 6));
	
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_DRASIUM_ORE =
			ConfiguredFeatures.register("nether_drasium_ore", Feature.ORE, new OreFeatureConfig(NETHER_DRASIUM_ORES, 8));
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_DRASIUM_COAL_ORE =
			ConfiguredFeatures.register("nether_drasium_coal_ore", Feature.ORE, new OreFeatureConfig(NETHER_DRASIUM_COAL_ORES, 8));
	
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_DRASIUM_ORE =
			ConfiguredFeatures.register("end_drasium_ore", Feature.ORE, new OreFeatureConfig(END_DRASIUM_ORES, 8));
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_DRASIUM_COAL_ORE =
			ConfiguredFeatures.register("end_drasium_coal_ore", Feature.ORE, new OreFeatureConfig(END_DRASIUM_COAL_ORES, 8));
	
	
	public static void registerConfiguredFeatures() {
		VipelyMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + VipelyMod.MOD_ID);
	}
}
