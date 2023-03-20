package net.vipely.vipelymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.vipely.vipelymod.VipelyMod;
import net.vipely.vipelymod.item.ModItemGroup;

public class ModBlocks {
	public static final Block DRASIUM_BLOCK = registerBlock("drasium_block",
			new Block(FabricBlockSettings.of(Material.METAL).strength(5f, 6f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block DRASIUM_COAL_BLOCK = registerBlock("drasium_coal_block",
			new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block DRASIUM_ORE = registerBlock("drasium_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroup.DRASIUM);
	public static final Block NETHER_DRASIUM_ORE = registerBlock("nether_drasium_ore",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block END_DRASIUM_ORE = registerBlock("end_drasium_ore",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block DRASIUM_COAL_ORE = registerBlock("drasium_coal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroup.DRASIUM);
	public static final Block NETHER_DRASIUM_COAL_ORE = registerBlock("nether_drasium_coal_ore",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block END_DRASIUM_COAL_ORE = registerBlock("end_drasium_coal_ore",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.DRASIUM);
	public static final Block DEEPSLATE_DRASIUM_ORE = registerBlock("deepslate_drasium_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroup.DRASIUM);
	public static final Block DEEPSLATE_DRASIUM_COAL_ORE = registerBlock("deepslate_drasium_coal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroup.DRASIUM);
	
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
