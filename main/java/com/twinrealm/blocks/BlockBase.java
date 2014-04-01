package com.twinrealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.twinrealm.TwinRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBase extends Block {

	public BlockBase(Material material) {
		super(material);
		this.setCreativeTab(TwinRealm.tab);
	}
	
	public String getUnwrappedUnlocalisedName() {
		return this.getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(TwinRealm.ASSET + this.getUnwrappedUnlocalisedName());
	}
}