package org.supertassu.powerCraft.crafting;

import org.supertassu.powerCraft.blocks.ModBlocks;
import org.supertassu.powerCraft.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {" # ", "RSR", '#', ModItems.batteryItem, 'R', Items.redstone, 'S', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.batteryItem), new Object[] {"RRR", "RIR", "RRR", 'R', Items.redstone, 'I', Items.iron_ingot});
	}
}
