package com.twinrealm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import net.minecraft.creativetab.CreativeTabs;

import com.twinrealm.blocks.ModBlocks;
import com.twinrealm.entities.EntityWoodworm;
import com.twinrealm.items.ModItems;
import com.twinrealm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = TwinRealm.MODID, name = TwinRealm.NAME, version = TwinRealm.VERSION)
public class TwinRealm {

	public static final String MODID = "tr";
	public static final String NAME = "TwinRealm";
	public static final String VERSION = "0.1";
	public static final String ASSET = MODID + ":";
	
	@Instance(MODID)
	public static TwinRealm instance;
	
	@SidedProxy(clientSide = "com.twinrealm.proxy.ClientProxy", serverSide = "com.twinrealm.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tab = new CreativeTabTR();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
		
		EntityRegistry.registerGlobalEntityID(EntityWoodworm.class, "woodworm", 110, 0xFF000000, 0xFF000000);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}