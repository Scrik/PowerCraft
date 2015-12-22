package org.supertassu.powerCraft.blocks;

import org.supertassu.powerCraft.Main;
import org.supertassu.powerCraft.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChargeBlock extends Block {
	
	protected ChargeBlock(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + "charger");
        this.setCreativeTab(ModItems.tabPower);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
    }
	
}
