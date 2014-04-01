package com.twinrealm.items;

import com.twinrealm.TwinRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase() {
		this.setCreativeTab(TwinRealm.tab);
	}
	
	public String getUnwrappedUnlocalisedName() {
		return this.getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(TwinRealm.ASSET + this.getUnwrappedUnlocalisedName());
	}
}