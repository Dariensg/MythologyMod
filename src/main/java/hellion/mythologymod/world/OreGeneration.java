package hellion.mythologymod.world;

import lists.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BlockBlobConfig;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{
			//Copper Ore
			CountRangeConfig copper_ore_placement = new CountRangeConfig(10, 20, 0, 256);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.copper_ore.getDefaultState(), 8), new CountRange(), copper_ore_placement));
			
			//Aluminum Ore
			CountRangeConfig aluminum_ore_placement = new CountRangeConfig(12, 20, 0, 256);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.aluminum_ore.getDefaultState(), 12), new CountRange(), aluminum_ore_placement));
			
			//Tin Ore
			CountRangeConfig tin_ore_placement = new CountRangeConfig(8, 20, 0, 256);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.tin_ore.getDefaultState(), 10), new CountRange(), tin_ore_placement));
		
			CountRangeConfig cloud_block_placement = new CountRangeConfig(1, 200, 0, 256);
			biome.addFeature(Decoration.RAW_GENERATION, new CompositeFeature<>(Feature.BLOCK_BLOB, new BlockBlobConfig(BlockList.cloud_block, 0), new CountRange(), cloud_block_placement));
		}
	}
}
