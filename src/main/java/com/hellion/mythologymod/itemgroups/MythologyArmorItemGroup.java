package com.hellion.mythologymod.itemgroups;

import com.hellion.mythologymod.init.MythologyItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MythologyArmorItemGroup extends ItemGroup {
	
	public MythologyArmorItemGroup() 
	{
		super("mythologyArmor");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(MythologyItems.copper_chestplate);
	}
}
