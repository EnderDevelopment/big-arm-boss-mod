package com.emilianocruzh09.bigarmbossmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class BigArmBossEntity extends Monster {
    public BigArmBossEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // Register goals for the Big Arm Boss
    }

    @Override
    public void tick() {
        super.tick();
        // Custom tick logic for the Big Arm Boss
    }
}