package net.vipely.vipelymod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vipely.vipelymod.VipelyMod;

public class ModItemGroup {
	public static final ItemGroup DRASIUM = FabricItemGroupBuilder.build(
			new Identifier(VipelyMod.MOD_ID, "drasium"), () -> new ItemStack(ModItems.DRASIUM_INGOT));
}
