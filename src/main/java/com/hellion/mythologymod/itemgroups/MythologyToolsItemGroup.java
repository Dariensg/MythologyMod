package com.hellion.mythologymod.itemgroups;

import lists.MythologyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MythologyToolsItemGroup extends ItemGroup{

	public MythologyToolsItemGroup( ) {
		super("mythologyTools");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(MythologyItems.copper_sword);
	}

}
