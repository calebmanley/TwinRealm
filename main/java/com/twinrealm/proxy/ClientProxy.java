package com.twinrealm.proxy;

import com.twinrealm.entities.EntityWoodworm;
import com.twinrealm.entities.RenderWoodworm;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityWoodworm.class, new RenderWoodworm());
	}
}