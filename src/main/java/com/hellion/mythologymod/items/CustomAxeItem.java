package com.hellion.mythologymod.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class CustomAxeItem extends AxeItem {

	public CustomAxeItem(IItemTier tier, float attackDamage, float attackSpeedIn, Properties builder) {
		super(tier, attackDamage, attackSpeedIn, builder);
	}
}
