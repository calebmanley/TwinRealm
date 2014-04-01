package com.twinrealm.entities;

import com.twinrealm.TwinRealm;

import net.minecraft.client.model.ModelSilverfish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWoodworm extends RenderLiving {
	
    private static final ResourceLocation woodwormTextures = new ResourceLocation(TwinRealm.MODID, "textures/entity/woodworm.png");

    public RenderWoodworm() {
        super(new ModelWoodworm(), 0.3F);
    }

    protected float getDeathMaxRotation(EntityWoodworm woodWorm) {
        return 180.0F;
    }

    public void doRender(EntityWoodworm woodWorm, double d, double d1, double d2, float f, float f1) {
        super.doRender((EntityLiving)woodWorm, d, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(EntityWoodworm woodWorm) {
        return woodwormTextures;
    }

    protected int shouldRenderPass(EntityWoodworm woodWorm, int i, float f) {
        return -1;
    }
    
    public void doRender(EntityLiving entityLiving, double d, double d1, double d2, float f, float f1) {
        this.doRender((EntityWoodworm)entityLiving, d, d1, d2, f, f1);
    }

    protected float getDeathMaxRotation(EntityLivingBase entityLiving) {
        return this.getDeathMaxRotation((EntityWoodworm)entityLiving);
    }

    protected int shouldRenderPass(EntityLivingBase entityLiving, int i, float f) {
        return this.shouldRenderPass((EntityWoodworm)entityLiving, i, f);
    }

    public void doRender(EntityLivingBase entityLiving, double d, double d1, double d2, float f, float f1) {
        this.doRender((EntityWoodworm)entityLiving, d, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityWoodworm)entity);
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        this.doRender((EntityWoodworm)entity, d, d1, d2, f, f1);
    }
}