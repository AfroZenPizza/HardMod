package com.tsumuku.hardmod.init;

import java.util.ArrayList;
import java.util.List;

import com.tsumuku.hardmod.blocks.BlockBase;
import com.tsumuku.hardmod.blocks.MudBlock;
import com.tsumuku.hardmod.blocks.WoolTorchBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MUD_BLOCK = new MudBlock("mud_block", Material.CLAY);
	public static final Block CLAY_MOUND_BLOCK = new BlockBase("clay_mound_block", Material.CLAY);
	public static final Block WOOL_TORCH = new WoolTorchBlock("wool_torch_block");
	
}
