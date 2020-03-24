package hellion.mythologymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class BlockCloud extends Block
{

	public BlockCloud(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
}
