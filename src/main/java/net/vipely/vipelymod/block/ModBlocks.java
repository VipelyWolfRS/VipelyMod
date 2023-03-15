package net.vipely.vipelymod.block;

import net.vipely.vipelymod.VipelyMod;
import net.vipely.vipelymod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	public static final Block DRASIUM_BLOCK = registerBlock("drasium_block",
			new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.DRASIUM);
	
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(VipelyMod.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(VipelyMod.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		VipelyMod.LOGGER.debug("Registering ModBlocks for " + VipelyMod.MOD_ID);
	}
}
