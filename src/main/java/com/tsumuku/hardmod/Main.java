package com.tsumuku.hardmod;

import java.util.ArrayList;
import java.util.List;

import com.tsumuku.hardmod.proxy.CommonProxy;
import com.tsumuku.hardmod.util.RecipeRemover;
import com.tsumuku.hardmod.util.Reference;
import com.tsumuku.hardmod.util.handlers.VanillaRecipeRemover;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, 
	version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		new VanillaRecipeRemover();
				
	}
}
