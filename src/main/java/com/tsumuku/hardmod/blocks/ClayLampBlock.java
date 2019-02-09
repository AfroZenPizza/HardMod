package com.tsumuku.hardmod.blocks;

import com.tsumuku.hardmod.Main;
import com.tsumuku.hardmod.init.ModBlocks;
import com.tsumuku.hardmod.init.ModItems;
import com.tsumuku.hardmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;


//User BlockTorch for reference
public class ClayLampBlock extends BlockTorch implements IHasModel{
	
	public ClayLampBlock(String name) {				
		setLightLevel( 11/16f ); 
		setLightOpacity( 1 );
		
		setUnlocalizedName( name );
		setRegistryName( name );
		setCreativeTab( CreativeTabs.DECORATIONS );
		
		ModBlocks.BLOCKS.add( this );
		ModItems.ITEMS.add( new ItemBlock( this ).setRegistryName( this.getRegistryName() ) );
	}
		  
	
	@Override
	public void registerModels() 
	{
	
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
