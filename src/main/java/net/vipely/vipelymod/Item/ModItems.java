package net.vipely.vipelymod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vipely.vipelymod.VipelyMod;

public class ModItems {

	public static final Item DRASIUM_INGOT = registerItem("drasium_ingot", 
			new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(VipelyMod.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		VipelyMod.LOGGER.debug("Registering Mod Items for " + VipelyMod.MOD_ID);
	}
}
