package hellion.mythologymod.itemgroups;

import lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MythologyToolsItemGroup extends ItemGroup{

	public MythologyToolsItemGroup( ) {
		super("mythologyTools");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemList.copper_sword);
	}

}
