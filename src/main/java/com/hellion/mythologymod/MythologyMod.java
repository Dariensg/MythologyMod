package com.hellion.mythologymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hellion.mythologymod.client.renders.MythologyRenderRegistry;
import com.hellion.mythologymod.config.Config;

import com.hellion.mythologymod.itemgroups.MythologyArmorItemGroup;
import com.hellion.mythologymod.itemgroups.MythologyBlocksItemGroup;
import com.hellion.mythologymod.itemgroups.MythologyItemsItemGroup;
import com.hellion.mythologymod.itemgroups.MythologyToolsItemGroup;
import com.hellion.mythologymod.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;


@Mod("hellionmythologymod")
public class MythologyMod 
{
	public static MythologyMod instance;
	public static final String MODID = "hellionmythologymod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	//Creative Tabs
	public static final ItemGroup MYTHOLOGYITEMS = new MythologyItemsItemGroup();
	public static final ItemGroup MYTHOLOGYBLOCKS = new MythologyBlocksItemGroup(); 
	public static final ItemGroup MYTHOLOGYARMOR = new MythologyArmorItemGroup();
	public static final ItemGroup MYTHOLOGYTOOLS = new MythologyToolsItemGroup();
	
	public MythologyMod() 
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG, "mythologymod-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG, "mythologymod-client.toml");
		
		Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("mythologymod-client.toml").toString());
		Config.loadConfig(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("mythologymod-server.toml").toString());
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		LOGGER.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		MythologyRenderRegistry.registerEntityRenderers();
		LOGGER.info("clientRegistries method registered.");
	}
	
}
