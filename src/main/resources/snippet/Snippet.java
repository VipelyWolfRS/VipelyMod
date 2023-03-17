package snippet;

public class Snippet {
	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DRASIUM_ORE =
				ConfiguredFeatures.register("drasium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DRASIUM_ORES, (int) 4.5));
}

