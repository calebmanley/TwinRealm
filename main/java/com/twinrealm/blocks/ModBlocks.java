package com.twinrealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block block;
	
	public static void init() {
		block = new BlockBase(Material.rock).setBlockName("block");
		registerBlock(block);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().replace("tile.", ""));
	}
	
	private static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock) {
		GameRegistry.registerBlock(block, itemBlock, block.getUnlocalizedName().replace("tile.", ""));
	}
}