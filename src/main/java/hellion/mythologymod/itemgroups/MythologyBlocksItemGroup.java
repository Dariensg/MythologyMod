package hellion.mythologymod.itemgroups;

import lists.BlockList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MythologyBlocksItemGroup extends ItemGroup {

	public MythologyBlocksItemGroup() {
		super("mythologyBlocks");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.ethereal_light));
	}

}
