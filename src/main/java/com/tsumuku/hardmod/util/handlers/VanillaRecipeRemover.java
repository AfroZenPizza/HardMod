package com.tsumuku.hardmod.util.handlers;

import java.util.ArrayList;
import java.util.List;

import com.tsumuku.hardmod.util.RecipeRemover;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VanillaRecipeRemover {
	public VanillaRecipeRemover() 
	{
		List<Item> removedItems = new ArrayList<Item>();
		removedItems.add(Items.WOODEN_AXE);
		removedItems.add(Items.WOODEN_HOE);
		removedItems.add(Items.WOODEN_PICKAXE);
		removedItems.add(Items.WOODEN_SHOVEL);
		removedItems.add(Items.WOODEN_SWORD);
		removedItems.add(Items.STONE_AXE);
		removedItems.add(Items.STONE_HOE);
		removedItems.add(Items.STONE_PICKAXE);
		removedItems.add(Items.STONE_SHOVEL);
		removedItems.add(Items.STONE_SWORD);
		removedItems.add(Items.IRON_AXE);
		removedItems.add(Items.IRON_HOE);
		removedItems.add(Items.IRON_PICKAXE);
		removedItems.add(Items.IRON_SHOVEL);
		removedItems.add(Items.IRON_SWORD);
		removedItems.add(Items.DIAMOND_AXE);
		removedItems.add(Items.DIAMOND_HOE);
		removedItems.add(Items.DIAMOND_PICKAXE);
		removedItems.add(Items.DIAMOND_SHOVEL);
		removedItems.add(Items.DIAMOND_SWORD);
		
		removedItems.add(Items.COAL);
		
		for ( Item i : removedItems) {
			new RecipeRemover(i);
		}
	}
}
