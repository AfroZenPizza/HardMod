package com.tsumuku.hardmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MudBlock extends BlockBase 
{

	public MudBlock( String name, Material material )
	{
		super( name, material );

		setSoundType(SoundType.SLIME);
		setHardness(0.5F);
		setResistance(3.0F);
		setHarvestLevel("spade", 1);
		setLightLevel(0.0f); // Not needed, but for reference
		setLightOpacity(0); // Not needed, reference
		//setBlockUnbreakable(); //reference
	}

	
	
}
