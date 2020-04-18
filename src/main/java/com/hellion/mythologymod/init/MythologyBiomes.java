package com.hellion.mythologymod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class MythologyBiomes 
{
	public static Biome olympus_biome;
	
	public static void registerBiomes()
	{
		registerBiome(olympus_biome, Type.MOUNTAIN, Type.COLD);
	}
	
	public static void registerBiome(Biome biome, Type... types)
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
}
