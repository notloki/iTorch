package com.notloki.itorch.entities.particles;

import net.minecraft.client.particle.ParticleSmokeNormal;
import net.minecraft.world.World;

public class ParticleCustomSmoke extends ParticleSmokeNormal {
    public ParticleCustomSmoke(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i46348_8_, double p_i46348_10_, double p_i46348_12_, float p_i46348_14_, float r, float g, float b) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i46348_8_, p_i46348_10_, p_i46348_12_, p_i46348_14_);
        setRBGColorF(r, g, b);

    }
}
