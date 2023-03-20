package net.vipely.vipelymod.world.feature;

import java.util.List;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
	public static final RegistryEntry<PlacedFeature> DRASIUM_ORE_PLACED = PlacedFeatures.register("drasium_ore_placed",
			ModConfiguredFeatures.DRASIUM_ORE, modifiersWithCount(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
	public static final RegistryEntry<PlacedFeature> DRASIUM_COAL_ORE_PLACED = PlacedFeatures.register("drasium_coal_ore_placed",
			ModConfiguredFeatures.DRASIUM_COAL_ORE, modifiersWithCount(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-20), YOffset.aboveBottom(80))));
	
	public static final RegistryEntry<PlacedFeature> NETHER_DRASIUM_ORE_PLACED = PlacedFeatures.register("nether_drasium_ore_placed",
			ModConfiguredFeatures.NETHER_DRASIUM_ORE, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
	public static final RegistryEntry<PlacedFeature> NETHER_DRASIUM_COAL_ORE_PLACED = PlacedFeatures.register("nether_drasium_coal_ore_placed",
			ModConfiguredFeatures.NETHER_DRASIUM_COAL_ORE, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-20), YOffset.aboveBottom(80))));
	
	public static final RegistryEntry<PlacedFeature> END_DRASIUM_ORE_PLACED = PlacedFeatures.register("end_drasium_ore_placed",
			ModConfiguredFeatures.END_DRASIUM_ORE, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
	public static final RegistryEntry<PlacedFeature> END_DRASIUM_COAL_ORE_PLACED = PlacedFeatures.register("end_drasium_ore_placed",
			ModConfiguredFeatures.END_DRASIUM_COAL_ORE, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-20), YOffset.aboveBottom(80))));
	
	
	private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
		return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
	}
	private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
		return modifiers(CountPlacementModifier.of(count), heightModifier);
	}
	private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
		return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
	}
}
