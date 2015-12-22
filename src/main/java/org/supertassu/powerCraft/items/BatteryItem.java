package org.supertassu.powerCraft.items;

import java.util.List;

import org.supertassu.powerCraft.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.Locale;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BatteryItem extends Item {
	
	public BatteryItem(String unlocalizedName) {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ModItems.tabPower);
		
	}
	
	public IIcon[] icons = new IIcon[6];

	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < 5; i ++) {
	        this.icons[i] = reg.registerIcon(Main.MODID + ":battery_" + i);
	    }
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 5) {
	        meta = 0;
	    }
	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 5; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

}
