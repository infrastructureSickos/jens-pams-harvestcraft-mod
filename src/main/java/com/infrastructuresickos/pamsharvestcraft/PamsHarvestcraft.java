package com.infrastructuresickos.pamsharvestcraft;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PamsHarvestcraft.MOD_ID)
public class PamsHarvestcraft {
    public static final String MOD_ID = "pams_harvestcraft";
    private static final Logger LOGGER = LogManager.getLogger();

    public PamsHarvestcraft() {
        LOGGER.info("Pam's HarvestCraft mod loaded.");
    }
}
