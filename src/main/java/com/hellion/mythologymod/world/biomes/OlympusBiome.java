package com.hellion.mythologymod.world.biomes;

import com.hellion.mythologymod.MythologyModRegistries;
import com.hellion.mythologymod.init.MythologyBlocks;
import com.hellion.mythologymod.init.MythologyEntities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class OlympusBiome extends Biome {

	public OlympusBiome() {
		super(new Biome.Builder()
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MythologyBlocks.cloud_block.getDefaultState(), MythologyBlocks.cloud_block.getDefaultState(), MythologyBlocks.cloud_block.getDefaultState())))
				.precipitation(RainType.RAIN)
				.category(Category.EXTREME_HILLS)
				.downfall(0.3F)
				.depth(2.0F)
				.temperature(0.2F)
				.scale(1.0F)
				.waterColor(0xfcca03)
				.waterFogColor(0xc9a204)
				.parent(null));
		
		DefaultBiomeFeatures.addCarvers(this);
	    this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.01F)));
	    this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));
	    
	    this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(MythologyEntities.CENTAUR_ENTITY, 50, 1, 5));
	    
	    this.setRegistryName(MythologyModRegistries.location("olympus_biome"));
	}

}
