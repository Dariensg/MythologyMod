package com.hellion.mythologymod;

import org.apache.logging.log4j.Logger;

import hellion.mythologymod.blocks.BlockCloud;
import hellion.mythologymod.items.CustomAxeItem;
import hellion.mythologymod.items.CustomPickaxeItem;
import lists.MythologyArmorMaterials;
import lists.MythologyBlocks;
import lists.MythologyEntities;
import lists.MythologyItems;
import lists.MythologyToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class MythologyModRegistries
{
	public static final ItemGroup MYTHOLOGYITEMS = MythologyMod.MYTHOLOGYITEMS;
	public static final ItemGroup MYTHOLOGYBLOCKS = MythologyMod.MYTHOLOGYBLOCKS;
	public static final ItemGroup MYTHOLOGYTOOLS = MythologyMod.MYTHOLOGYTOOLS;
	public static final ItemGroup MYTHOLOGYARMOR = MythologyMod.MYTHOLOGYARMOR;
	
	public static final Logger LOGGER = MythologyMod.LOGGER;
	public static final String MODID = MythologyMod.MODID;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) //Item Registry
	{
		event.getRegistry().registerAll
		(
				//Item Initialization

				//Metals
				MythologyItems.copper_ingot = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("copper_ingot")),  
						MythologyItems.copper_nugget = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("copper_nugget")),
				MythologyItems.aluminum_ingot = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("aluminum_ingot")),
						MythologyItems.aluminum_nugget = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("aluminum_nugget")),
				MythologyItems.bronze_ingot = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("bronze_ingot")),
						MythologyItems.bronze_nugget = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("bronze_nugget")),
				MythologyItems.tin_ingot = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("tin_ingot")),
						MythologyItems.tin_nugget = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("tin_nugget")),
				MythologyItems.brass_ingot = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("brass_ingot")),
						MythologyItems.brass_nugget = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("brass_nugget")),
						
				//Miscellaneous
				MythologyItems.electrical_powder = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("electrical_powder")), 
				MythologyItems.condensed_lightning = new Item(new Item.Properties().group(MYTHOLOGYITEMS)).setRegistryName(location("condensed_lightning")),
				
				//Tools
				MythologyItems.copper_axe = new CustomAxeItem(MythologyToolMaterials.copper, -1.0f, -3.2f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("copper_axe")), 
						MythologyItems.copper_hoe = new HoeItem(MythologyToolMaterials.copper, -1.5f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("copper_hoe")),
						MythologyItems.copper_pickaxe = new CustomPickaxeItem(MythologyToolMaterials.copper, -1, -2.8f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("copper_pickaxe")), 
						MythologyItems.copper_shovel = new ShovelItem(MythologyToolMaterials.copper, -1.0f, 0.0f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("copper_shovel")), 
						MythologyItems.copper_sword = new SwordItem(MythologyToolMaterials.copper, -1,-2.4f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("copper_sword")),			
				MythologyItems.bronze_axe = new CustomAxeItem(MythologyToolMaterials.bronze, 0.0f, -2.9f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("bronze_axe")),
						MythologyItems.bronze_hoe = new HoeItem(MythologyToolMaterials.bronze, -1.5f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("bronze_hoe")),
						MythologyItems.bronze_pickaxe = new CustomPickaxeItem(MythologyToolMaterials.bronze, 0, -2.8f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("bronze_pickaxe")), 
						MythologyItems.bronze_shovel = new ShovelItem(MythologyToolMaterials.bronze, 0.0f, 0.0f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("bronze_shovel")), 
						MythologyItems.bronze_sword = new SwordItem(MythologyToolMaterials.bronze, 1,-2.4f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("bronze_sword")),			
				MythologyItems.brass_axe = new CustomAxeItem(MythologyToolMaterials.brass, -0.5f, -3.0f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("brass_axe")),
						MythologyItems.brass_hoe = new HoeItem(MythologyToolMaterials.brass, -1.5f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("brass_hoe")),
						MythologyItems.brass_pickaxe = new CustomPickaxeItem(MythologyToolMaterials.brass, 0, -2.8f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("brass_pickaxe")), 
						MythologyItems.brass_shovel = new ShovelItem(MythologyToolMaterials.brass, -0.5f, 0.0f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("brass_shovel")), 
						MythologyItems.brass_sword = new SwordItem(MythologyToolMaterials.brass, 0,-2.4f, new Item.Properties().group(MYTHOLOGYTOOLS)).setRegistryName(location("brass_sword")),			
						
				//Armor
				MythologyItems.copper_helmet = new ArmorItem(MythologyArmorMaterials.copper, EquipmentSlotType.HEAD, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("copper_helmet")),
						MythologyItems.copper_chestplate = new ArmorItem(MythologyArmorMaterials.copper, EquipmentSlotType.CHEST, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("copper_chestplate")),
						MythologyItems.copper_leggings = new ArmorItem(MythologyArmorMaterials.copper, EquipmentSlotType.LEGS, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("copper_leggings")),
						MythologyItems.copper_boots = new ArmorItem(MythologyArmorMaterials.copper, EquipmentSlotType.FEET, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("copper_boots")),
				MythologyItems.bronze_helmet = new ArmorItem(MythologyArmorMaterials.bronze, EquipmentSlotType.HEAD, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("bronze_helmet")),
						MythologyItems.bronze_chestplate = new ArmorItem(MythologyArmorMaterials.bronze, EquipmentSlotType.CHEST, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("bronze_chestplate")),
						MythologyItems.bronze_leggings = new ArmorItem(MythologyArmorMaterials.bronze, EquipmentSlotType.LEGS, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("bronze_leggings")),
						MythologyItems.bronze_boots = new ArmorItem(MythologyArmorMaterials.bronze, EquipmentSlotType.FEET, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("bronze_boots")),
				MythologyItems.brass_helmet = new ArmorItem(MythologyArmorMaterials.brass, EquipmentSlotType.HEAD, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("brass_helmet")),
						MythologyItems.brass_chestplate = new ArmorItem(MythologyArmorMaterials.brass, EquipmentSlotType.CHEST, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("brass_chestplate")),
						MythologyItems.brass_leggings = new ArmorItem(MythologyArmorMaterials.brass, EquipmentSlotType.LEGS, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("brass_leggings")),
						MythologyItems.brass_boots = new ArmorItem(MythologyArmorMaterials.brass, EquipmentSlotType.FEET, new Item.Properties().group(MYTHOLOGYARMOR)).setRegistryName(location("brass_boots")),
				
				//ItemBlock Initialization
				
				//Metals
				MythologyItems.copper_ore = new BlockItem(MythologyBlocks.copper_ore, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.copper_ore.getRegistryName()),
						MythologyItems.copper_block = new BlockItem(MythologyBlocks.copper_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.copper_block.getRegistryName()),
				MythologyItems.aluminum_ore = new BlockItem(MythologyBlocks.aluminum_ore, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.aluminum_ore.getRegistryName()),
						MythologyItems.aluminum_block = new BlockItem(MythologyBlocks.aluminum_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.aluminum_block.getRegistryName()),
				MythologyItems.bronze_block = new BlockItem(MythologyBlocks.bronze_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.bronze_block.getRegistryName()),
				MythologyItems.tin_ore = new BlockItem(MythologyBlocks.tin_ore, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.tin_ore.getRegistryName()),
						MythologyItems.tin_block = new BlockItem(MythologyBlocks.tin_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.tin_block.getRegistryName()),
				MythologyItems.brass_block = new BlockItem(MythologyBlocks.brass_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.brass_block.getRegistryName()),
				
				//Miscellaneous Ore
				MythologyItems.electric_ore = new BlockItem(MythologyBlocks.electric_ore, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.electric_ore.getRegistryName()),
				
				//Miscellaneous
				MythologyItems.cloud_block = new BlockItem(MythologyBlocks.cloud_block, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.cloud_block.getRegistryName()),
				MythologyItems.ethereal_light = new BlockItem(MythologyBlocks.ethereal_light, new Item.Properties().group(MYTHOLOGYBLOCKS)).setRegistryName(MythologyBlocks.ethereal_light.getRegistryName())
		);
		
		MythologyEntities.registerEntitySpawnEggs(event);
		
		LOGGER.info("Items registered.");
	}
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) //Block Registry
	{
		event.getRegistry().registerAll
		(
				//Block Initialization
				
				//Metals
				MythologyBlocks.copper_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("copper_ore")),
						MythologyBlocks.copper_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("copper_block")),
				MythologyBlocks.aluminum_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("aluminum_ore")),
						MythologyBlocks.aluminum_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("aluminum_block")),
				MythologyBlocks.bronze_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("bronze_block")),
				MythologyBlocks.tin_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("tin_ore")),
						MythologyBlocks.tin_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("tin_block")),
				MythologyBlocks.brass_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("brass_block")),
				
				//Miscellaneous Ores
				MythologyBlocks.electric_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("electric_ore")),
				
				//Miscellaneous
				MythologyBlocks.cloud_block = new BlockCloud(Block.Properties.create(Material.ICE).hardnessAndResistance(0.0f, 0.0f).lightValue(0).sound(SoundType.SNOW)).setRegistryName(location("cloud_block")),
				MythologyBlocks.ethereal_light = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 2.0f).lightValue(15).sound(SoundType.GLASS)).setRegistryName(location("ethereal_light"))
		);
		
		LOGGER.info("Blocks registered.");
	}
	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) //Entity Registry
	{
		event.getRegistry().registerAll
		(
			MythologyEntities.MYTHOLOGY_ENTITY	
		);
		
		MythologyEntities.registerEntityWorldSpawns();
		
	}
	
	public static ResourceLocation location(String name) //Simplifies RegistryName
	{
		return new ResourceLocation(MODID, name);
	}
}
