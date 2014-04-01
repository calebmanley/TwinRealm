package com.twinrealm.entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class EntityWoodworm extends EntityAnimal {

    public EntityWoodworm(World world) {
        super(world);
        this.setSize(0.3F, 0.7F);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6000000238418579D);
        //this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    protected Entity findPlayerToAttack() {
        double d0 = 8.0D;
        return this.worldObj.getClosestVulnerablePlayerToEntity(this, d0);
    }

    protected String getLivingSound() {
        return "mob.silverfish.say";
    }

    protected String getHurtSound() {
        return "mob.silverfish.hit";
    }

    protected String getDeathSound() {
        return "mob.silverfish.kill";
    }

    public boolean attackEntityFrom(DamageSource source, float f) {
        if (this.isEntityInvulnerable()) {
            return false;
        } else {
            return super.attackEntityFrom(source, f);
        }
    }

    protected void attackEntity(Entity entity, float f) {
        if (this.attackTime <= 0 && f < 1.2F && entity.boundingBox.maxY > this.boundingBox.minY && entity.boundingBox.minY < this.boundingBox.maxY) {
            this.attackTime = 20;
            this.attackEntityAsMob(entity);
        }
    }

    protected void func_145780_a(int x, int y, int z, Block block) {
        this.playSound("mob.silverfish.step", 0.15F, 1.0F);
    }

    protected Item getDropItem() {
        return Item.getItemById(0);
    }

    public void onUpdate() {
        this.renderYawOffset = this.rotationYaw;
        super.onUpdate();
    }

    protected void updateEntityActionState() {
        super.updateEntityActionState();

        if (!this.worldObj.isRemote) {
            if (this.entityToAttack == null && !this.hasPath()) {
                int x = MathHelper.floor_double(this.posX);
                int y = MathHelper.floor_double(this.posY + 0.5D);
                int z = MathHelper.floor_double(this.posZ);
                int side = this.rand.nextInt(6);
                Block block = this.worldObj.getBlock(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side]);
                int blockMeta = this.worldObj.getBlockMetadata(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side]);

                if (BlockSilverfish.func_150196_a(block)) {
                    this.worldObj.setBlock(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side], Blocks.monster_egg, BlockSilverfish.func_150195_a(block, blockMeta), 3);
                    this.spawnExplosionParticle();
                    this.setDead();
                } else {
                    this.updateWanderPath();
                }
            } else if (this.entityToAttack != null && !this.hasPath()) {
                this.entityToAttack = null;
            }
        }
    }
    
    public float getBlockPathWeight(int x, int y, int z) {
        return this.worldObj.getBlock(x, y - 1, z) == Blocks.stone ? 10.0F : super.getBlockPathWeight(x, y, z);
    }

    public boolean getCanSpawnHere() {
        if (super.getCanSpawnHere()) {
            EntityPlayer entityplayer = this.worldObj.getClosestPlayerToEntity(this, 5.0D);
            return entityplayer == null;
        } else {
            return false;
        }
    }

    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}