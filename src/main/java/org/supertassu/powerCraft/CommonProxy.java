package org.supertassu.powerCraft;

import org.supertassu.powerCraft.blocks.ModBlocks;
import org.supertassu.powerCraft.crafting.Crafting;
import org.supertassu.powerCraft.items.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
    	Crafting.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}