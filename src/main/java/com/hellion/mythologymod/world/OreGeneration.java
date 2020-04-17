package com.hellion.mythologymod.world;

import com.hellion.mythologymod.config.OregenConfig;

import lists.MythologyBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BlockBlobConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get()) {
			
			for(Biome biome : ForgeRegistries.BIOMES)
			{
				//Copper Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.copper_ore.getDefaultState(), OregenConfig.copper_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 10, 0, 120)));
			
				//Aluminum Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.aluminum_ore.getDefaultState(), OregenConfig.aluminum_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 30, 0, 100)));
			
				//Tin Ore
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MythologyBlocks.tin_ore.getDefaultState(), OregenConfig.tin_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
		
				//Cloud Block
				//biome.addFeature(Decoration.RAW_GENERATION, Biome.createDecoratedFeature(CloudConfig, new BlockBlobConfig(MythologyBlocks.cloud_block.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(2, 150, 0, 256)));
			}
		
		}
	}
}
