package com.twinrealm.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems {

	public static Item item;
	
	public static void init() {
		item = new ItemBase().setUnlocalizedName("item");
		registerItem(item);
	}
	
	private static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().replace("tile.", ""));
	}
}