package net.vipely.vipelymod.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vipely.vipelymod.VipelyMod;

public class ModPaintings {
	public static final PaintingVariant VIPELYWOLF = registerPainting("vipelywolf", new PaintingVariant(32, 32));
	
	public static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
		return Registry.register(Registry.PAINTING_VARIANT, new Identifier(VipelyMod.MOD_ID, name), paintingVariant);
	}
	
	public static void registerPaintings() {
		VipelyMod.LOGGER.debug("Registering Paintings for " + VipelyMod.MOD_ID);
	}
}
