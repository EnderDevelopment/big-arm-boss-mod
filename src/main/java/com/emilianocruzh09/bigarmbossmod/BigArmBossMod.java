package com.emilianocruzh09.bigarmbossmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigArmBossMod implements ModInitializer {
    public static final String MOD_ID = "bigarmbossmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Big Arm Boss Mod");
        // Register entities, items, blocks, etc.
    }

    public void onEnable() {
        LOGGER.info("Enabling Big Arm Boss Mod");
    }

    public void onDisable() {
        LOGGER.info("Disabling Big Arm Boss Mod");
    }

    public void onStop() {
        LOGGER.info("Stopping Big Arm Boss Mod");
    }
}