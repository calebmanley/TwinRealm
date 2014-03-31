package com.twinrealm;

import com.twinrealm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TwinRealm.MODID, name = TwinRealm.NAME, version = TwinRealm.VERSION)
public class TwinRealm {

	public static final String MODID = "tw";
	public static final String NAME = "TwinRealm";
	public static final String VERSION = "0.1";
	
	@Instance(MODID)
	public static TwinRealm instance;
	
	@SidedProxy(clientSide = "com.twinrealm.proxy.ClientProxy", serverSide = "com.twinrealm.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}