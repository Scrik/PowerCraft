package org.supertassu.powerCraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

	public static BatteryItem batteryItem;	
	
    public static final void init() {
    	GameRegistry.registerItem(batteryItem = new BatteryItem("battery"), "battery");
    }
    
    public static final CreativeTabs tabPower = new CreativeTabs("power") {
        @Override 
        public Item getTabIconItem() {
            return batteryItem;
        }
    };

}