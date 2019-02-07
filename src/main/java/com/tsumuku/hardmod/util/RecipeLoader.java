package com.tsumuku.hardmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeLoader
{
	public RecipeLoader(Item item, Object[] recipe) 
	{
		ResourceLocation name = item.getRegistryName();
		ResourceLocation group;
		ItemStack output = new ItemStack(item);		
		GameRegistry.addShapedRecipe(name, null, output, recipe);
	}
	
	public RecipeLoader(Block block, Object[] recipe) 
	{
		Item item = Item.getItemFromBlock(block); 
		ResourceLocation name = item.getRegistryName();
		ResourceLocation group;
		ItemStack output = new ItemStack(item);		
		GameRegistry.addShapedRecipe(name, null, output, recipe);
	}
	
	public RecipeLoader(ItemStack itemstack, Object[] recipe) 
	{
		Item item = itemstack.getItem(); 
		ResourceLocation name = item.getRegistryName();
		ResourceLocation group;			
		GameRegistry.addShapedRecipe(name, null, itemstack, recipe);
	}

}
