package com.tsumuku.hardmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryManager;

public class RecipeManager extends ForgeRegistries
{

	public RecipeManager( Item item )
	{
		
		ForgeRegistry<IRecipe> recipe = ( ForgeRegistry<IRecipe> ) RECIPES;
		recipe.remove(item.getRegistryName());
		CraftingHelper.loadRecipes(false);
		CraftingManager.init();
		
	}
	public RecipeManager( ItemStack itemstack )
	{
		
		ForgeRegistry<IRecipe> recipe = ( ForgeRegistry<IRecipe> ) RECIPES;
		Item item = itemstack.getItem();
		recipe.remove(item.getRegistryName());
		CraftingHelper.loadRecipes(false);
		CraftingManager.init();
		
	}
	public RecipeManager( Block block )
	{
		
		ForgeRegistry<IRecipe> recipe = ( ForgeRegistry<IRecipe> ) RECIPES;
		Item item = Item.getItemFromBlock( block );
		recipe.remove(item.getRegistryName());		
		CraftingHelper.loadRecipes( false );
		CraftingManager.init();
		
	}

}
