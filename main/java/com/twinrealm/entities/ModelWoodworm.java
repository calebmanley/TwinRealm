package com.twinrealm.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWoodworm extends ModelBase {
	
	ModelRenderer torso1, torso2, torso3;
	ModelRenderer head;
	ModelRenderer clawleft1, clawright1, clawleft2, clawright2;
	ModelRenderer headthingy;
	ModelRenderer grabthingy1;
	ModelRenderer grabthingy2;

	public ModelWoodworm() {
		textureWidth = 64;
		textureHeight = 32;

		torso1 = new ModelRenderer(this, 0, 0);
		torso1.addBox(-3.5F, -1F, 0F, 7, 5, 6);
		torso1.setRotationPoint(0F, 20F, -6F);
		torso1.setTextureSize(64, 32);
		torso1.mirror = true;
		setRotation(torso1, 0.0743572F, 0F, 0F);
		torso2 = new ModelRenderer(this, 0, 12);
		torso2.addBox(-3F, -2F, 5.5F, 6, 4, 5);
		torso2.setRotationPoint(0F, 20F, -6F);
		torso2.setTextureSize(64, 32);
		torso2.mirror = true;
		setRotation(torso2, -0.1858931F, 0F, 0F);
		torso3 = new ModelRenderer(this, 0, 22);
		torso3.addBox(-2F, -1F, 10F, 4, 3, 4);
		torso3.setRotationPoint(0F, 20F, -6F);
		torso3.setTextureSize(64, 32);
		torso3.mirror = true;
		setRotation(torso3, -0.1487144F, 0F, 0F);
		head = new ModelRenderer(this, 30, 0);
		head.addBox(-2F, 0F, -3F, 4, 3, 3);
		head.setRotationPoint(0F, 20F, -6F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.7807508F, 0F, 0F);
		clawleft1 = new ModelRenderer(this, 50, 0);
		clawleft1.addBox(-0.5F, 0F, 0F, 1, 1, 3);
		clawleft1.setRotationPoint(1F, 24F, -2F);
		clawleft1.setTextureSize(64, 32);
		clawleft1.mirror = true;
		setRotation(clawleft1, -2.825574F, -0.4833219F, 0F);
		clawright1 = new ModelRenderer(this, 50, 5);
		clawright1.addBox(-0.5F, 0F, 0F, 1, 1, 3);
		clawright1.setRotationPoint(-1F, 24F, -2F);
		clawright1.setTextureSize(64, 32);
		clawright1.mirror = true;
		setRotation(clawright1, -2.825574F, 0.4833166F, 0F);
		clawleft2 = new ModelRenderer(this, 50, 10);
		clawleft2.addBox(-0.5F, 1.5F, -2.5F, 1, 1, 2);
		clawleft2.setRotationPoint(1F, 24F, -2F);
		clawleft2.setTextureSize(64, 32);
		clawleft2.mirror = true;
		setRotation(clawleft2, -0.5576792F, -0.4833166F, 0F);
		clawright2 = new ModelRenderer(this, 50, 14);
		clawright2.addBox(-0.5F, 1.5F, -2.5F, 1, 1, 2);
		clawright2.setRotationPoint(-1F, 24F, -2F);
		clawright2.setTextureSize(64, 32);
		clawright2.mirror = true;
		setRotation(clawright2, -0.5576792F, 0.4833166F, 0F);
		headthingy = new ModelRenderer(this, 30, 7);
		headthingy.addBox(-0.5F, -0.5F, -3.5F, 1, 1, 4);
		headthingy.setRotationPoint(0F, 20F, -6F);
		headthingy.setTextureSize(64, 32);
		headthingy.mirror = true;
		setRotation(headthingy, 0.7807556F, 0F, 0F);
		grabthingy1 = new ModelRenderer(this, 24, 25);
		grabthingy1.addBox(-3F, 4F, 12F, 6, 0, 6);
		grabthingy1.setRotationPoint(0F, 20F, -6F);
		grabthingy1.setTextureSize(64, 32);
		grabthingy1.mirror = true;
		setRotation(grabthingy1, 0.1858931F, 0F, 0F);
		grabthingy2 = new ModelRenderer(this, 23, 17);
		grabthingy2.addBox(-3F, 3F, 12F, 6, 0, 7);
		grabthingy2.setRotationPoint(0F, 20F, -6F);
		grabthingy2.setTextureSize(64, 32);
		grabthingy2.mirror = true;
		setRotation(grabthingy2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		torso1.render(f5);
		torso2.render(f5);
		torso3.render(f5);
		head.render(f5);
		clawleft1.render(f5);
		clawright1.render(f5);
		clawleft2.render(f5);
		clawright2.render(f5);
		headthingy.render(f5);
		grabthingy1.render(f5);
		grabthingy2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}