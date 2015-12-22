package org.supertassu.powerCraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block tutorialBlock;

    public static final void init() {
    	GameRegistry.registerBlock(tutorialBlock = new ChargeBlock("chargeStadion", Material.iron), "chargeStadion");
    }

}