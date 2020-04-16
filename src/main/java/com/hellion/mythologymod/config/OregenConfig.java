package com.hellion.mythologymod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig 
{
	public static ForgeConfigSpec.IntValue copper_chance;
	public static ForgeConfigSpec.IntValue aluminum_chance;
	public static ForgeConfigSpec.IntValue tin_chance;
	
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		copper_chance = server
				.comment("the maximum number of ore veins of copper ore in a chunk")
				.defineInRange("oregen.copper_chance", 10, 1, 100000);
		
		aluminum_chance = server
				.comment("the maximum number of ore veins of aluminum ore in a chunk")
				.defineInRange("oregen.aluminum_chance", 15, 1, 100000);
		
		tin_chance = server
				.comment("the maximum number of ore veins of tin ore in a chunk")
				.defineInRange("oregen.tin_chance", 20, 1, 100000);
		
		generate_overworld = server
				.comment("Decide if you want the ores to generate in the overworld")
				.define("oregen.generate_overworld", true);
	}
}
