package com.tsumuku.hardmod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class BlockDropHandler {
	@SubscribeEvent
	public static void onBlockHarvest(HarvestDropsEvent event)
	{
		Block brokenBlock = event.getState().getBlock();	
		if (brokenBlock.getRegistryName() == Blocks.LEAVES.getRegistryName()
				|| brokenBlock.getRegistryName() == Blocks.LEAVES2.getRegistryName()) 
		{
			event.getDrops().add(new ItemStack(Items.STICK, 2));
			event.setDropChance(0.45f);			
		}
	}	
	
}
