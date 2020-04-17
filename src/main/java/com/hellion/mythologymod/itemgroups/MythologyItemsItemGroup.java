package com.hellion.mythologymod.itemgroups;

import lists.MythologyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MythologyItemsItemGroup extends ItemGroup{

	public MythologyItemsItemGroup( ) {
		super("mythologyItems");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(MythologyItems.copper_ingot);
	}

}
