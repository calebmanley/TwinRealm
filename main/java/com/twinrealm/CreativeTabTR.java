package com.twinrealm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabTR extends CreativeTabs {

	public CreativeTabTR() {
		super(CreativeTabs.getNextID(), TwinRealm.MODID);
	}

	@Override
	public Item getTabIconItem() {
		return Items.arrow;
	}
}