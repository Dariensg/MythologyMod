package hellion.mythologymod.world;

import com.hellion.mythologymod.config.OregenConfig;

import lists.MythologyBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get()) {
			
			for(Biome biome : ForgeRegistries.BIOMES)
			{
				//Copper Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.copper_ore.getDefaultState(), OregenConfig.copper_chance.get())));
			
				//Aluminum Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.aluminum_ore.getDefaultState(), OregenConfig.aluminum_chance.get())));
			
				//Tin Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.tin_ore.getDefaultState(), OregenConfig.tin_chance.get())));
		
			}
		
		}
	}
}
