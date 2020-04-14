package hellion.mythologymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hellion.mythologymod.blocks.BlockCloud;
import hellion.mythologymod.itemgroups.MythologyArmorItemGroup;
import hellion.mythologymod.itemgroups.MythologyBlocksItemGroup;
import hellion.mythologymod.itemgroups.MythologyItemsItemGroup;
import hellion.mythologymod.itemgroups.MythologyToolsItemGroup;
import hellion.mythologymod.items.ItemCustomAxe;
import hellion.mythologymod.items.ItemCustomPickaxe;
import hellion.mythologymod.world.OreGeneration;
import lists.ArmorMaterialList;
import lists.BlockList;
import lists.ItemList;
import lists.ToolMaterialList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("hellionmythologymod")
public class MythologyMod 
{
	public static MythologyMod instance;
	public static final String modid = "hellionmythologymod";
	private static final Logger logger = LogManager.getLogger(modid);
	
	//Creative Tabs
	public static final ItemGroup mythologyItems = new MythologyItemsItemGroup();
	public static final ItemGroup mythologyBlocks = new MythologyBlocksItemGroup(); 
	public static final ItemGroup mythologyArmor = new MythologyArmorItemGroup();
	public static final ItemGroup mythologyTools = new MythologyToolsItemGroup();
	
	public MythologyMod() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		logger.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		logger.info("clientRegistries method registered.");
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) //Item Registry
		{
			event.getRegistry().registerAll
			(
					//Item Initialization
					
					//test comment

					//Metals
					ItemList.copper_ingot = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("copper_ingot")),  
							ItemList.copper_nugget = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("copper_nugget")),
					ItemList.aluminum_ingot = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("aluminum_ingot")),
							ItemList.aluminum_nugget = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("aluminum_nugget")),
					ItemList.bronze_ingot = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("bronze_ingot")),
							ItemList.bronze_nugget = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("bronze_nugget")),
					ItemList.tin_ingot = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("tin_ingot")),
							ItemList.tin_nugget = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("tin_nugget")),
					ItemList.brass_ingot = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("brass_ingot")),
							ItemList.brass_nugget = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("brass_nugget")),
							
					//Miscellaneous
					ItemList.electrical_powder = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("electrical_powder")), 
					ItemList.condensed_lightning = new Item(new Item.Properties().group(mythologyItems)).setRegistryName(location("condensed_lightning")),
					
					//Tools
					ItemList.copper_axe = new ItemCustomAxe(ToolMaterialList.copper, -1.0f, -3.2f, new Item.Properties().group(mythologyTools)).setRegistryName(location("copper_axe")), 
							ItemList.copper_hoe = new ItemHoe(ToolMaterialList.copper, -1.5f, new Item.Properties().group(mythologyTools)).setRegistryName(location("copper_hoe")),
							ItemList.copper_pickaxe = new ItemCustomPickaxe(ToolMaterialList.copper, -1, -2.8f, new Item.Properties().group(mythologyTools)).setRegistryName(location("copper_pickaxe")), 
							ItemList.copper_shovel = new ItemSpade(ToolMaterialList.copper, -1.0f, 0.0f, new Item.Properties().group(mythologyTools)).setRegistryName(location("copper_shovel")), 
							ItemList.copper_sword = new ItemSword(ToolMaterialList.copper, -1,-2.4f, new Item.Properties().group(mythologyTools)).setRegistryName(location("copper_sword")),			
					ItemList.bronze_axe = new ItemCustomAxe(ToolMaterialList.bronze, 0.0f, -2.9f, new Item.Properties().group(mythologyTools)).setRegistryName(location("bronze_axe")),
							ItemList.bronze_hoe = new ItemHoe(ToolMaterialList.bronze, -1.5f, new Item.Properties().group(mythologyTools)).setRegistryName(location("bronze_hoe")),
							ItemList.bronze_pickaxe = new ItemCustomPickaxe(ToolMaterialList.bronze, 0, -2.8f, new Item.Properties().group(mythologyTools)).setRegistryName(location("bronze_pickaxe")), 
							ItemList.bronze_shovel = new ItemSpade(ToolMaterialList.bronze, 0.0f, 0.0f, new Item.Properties().group(mythologyTools)).setRegistryName(location("bronze_shovel")), 
							ItemList.bronze_sword = new ItemSword(ToolMaterialList.bronze, 1,-2.4f, new Item.Properties().group(mythologyTools)).setRegistryName(location("bronze_sword")),			
					ItemList.brass_axe = new ItemCustomAxe(ToolMaterialList.brass, -0.5f, -3.0f, new Item.Properties().group(mythologyTools)).setRegistryName(location("brass_axe")),
							ItemList.brass_hoe = new ItemHoe(ToolMaterialList.brass, -1.5f, new Item.Properties().group(mythologyTools)).setRegistryName(location("brass_hoe")),
							ItemList.brass_pickaxe = new ItemCustomPickaxe(ToolMaterialList.brass, 0, -2.8f, new Item.Properties().group(mythologyTools)).setRegistryName(location("brass_pickaxe")), 
							ItemList.brass_shovel = new ItemSpade(ToolMaterialList.brass, -0.5f, 0.0f, new Item.Properties().group(mythologyTools)).setRegistryName(location("brass_shovel")), 
							ItemList.brass_sword = new ItemSword(ToolMaterialList.brass, 0,-2.4f, new Item.Properties().group(mythologyTools)).setRegistryName(location("brass_sword")),			
							
					//Armor
					ItemList.copper_helmet = new ItemArmor(ArmorMaterialList.copper, EntityEquipmentSlot.HEAD, new Item.Properties().group(mythologyArmor)).setRegistryName(location("copper_helmet")),
							ItemList.copper_chestplate = new ItemArmor(ArmorMaterialList.copper, EntityEquipmentSlot.CHEST, new Item.Properties().group(mythologyArmor)).setRegistryName(location("copper_chestplate")),
							ItemList.copper_leggings = new ItemArmor(ArmorMaterialList.copper, EntityEquipmentSlot.LEGS, new Item.Properties().group(mythologyArmor)).setRegistryName(location("copper_leggings")),
							ItemList.copper_boots = new ItemArmor(ArmorMaterialList.copper, EntityEquipmentSlot.FEET, new Item.Properties().group(mythologyArmor)).setRegistryName(location("copper_boots")),
					ItemList.bronze_helmet = new ItemArmor(ArmorMaterialList.bronze, EntityEquipmentSlot.HEAD, new Item.Properties().group(mythologyArmor)).setRegistryName(location("bronze_helmet")),
							ItemList.bronze_chestplate = new ItemArmor(ArmorMaterialList.bronze, EntityEquipmentSlot.CHEST, new Item.Properties().group(mythologyArmor)).setRegistryName(location("bronze_chestplate")),
							ItemList.bronze_leggings = new ItemArmor(ArmorMaterialList.bronze, EntityEquipmentSlot.LEGS, new Item.Properties().group(mythologyArmor)).setRegistryName(location("bronze_leggings")),
							ItemList.bronze_boots = new ItemArmor(ArmorMaterialList.bronze, EntityEquipmentSlot.FEET, new Item.Properties().group(mythologyArmor)).setRegistryName(location("bronze_boots")),
					ItemList.brass_helmet = new ItemArmor(ArmorMaterialList.brass, EntityEquipmentSlot.HEAD, new Item.Properties().group(mythologyArmor)).setRegistryName(location("brass_helmet")),
							ItemList.brass_chestplate = new ItemArmor(ArmorMaterialList.brass, EntityEquipmentSlot.CHEST, new Item.Properties().group(mythologyArmor)).setRegistryName(location("brass_chestplate")),
							ItemList.brass_leggings = new ItemArmor(ArmorMaterialList.brass, EntityEquipmentSlot.LEGS, new Item.Properties().group(mythologyArmor)).setRegistryName(location("brass_leggings")),
							ItemList.brass_boots = new ItemArmor(ArmorMaterialList.brass, EntityEquipmentSlot.FEET, new Item.Properties().group(mythologyArmor)).setRegistryName(location("brass_boots")),
					
					//ItemBlock Initialization
					
					//Metals
					ItemList.copper_ore = new ItemBlock(BlockList.copper_ore, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.copper_ore.getRegistryName()),
							ItemList.copper_block = new ItemBlock(BlockList.copper_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.copper_block.getRegistryName()),
					ItemList.aluminum_ore = new ItemBlock(BlockList.aluminum_ore, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.aluminum_ore.getRegistryName()),
							ItemList.aluminum_block = new ItemBlock(BlockList.aluminum_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.aluminum_block.getRegistryName()),
					ItemList.bronze_block = new ItemBlock(BlockList.bronze_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.bronze_block.getRegistryName()),
					ItemList.tin_ore = new ItemBlock(BlockList.tin_ore, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.tin_ore.getRegistryName()),
							ItemList.tin_block = new ItemBlock(BlockList.tin_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.tin_block.getRegistryName()),
					ItemList.brass_block = new ItemBlock(BlockList.brass_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.brass_block.getRegistryName()),
					
					//Miscellaneous Ore
					ItemList.electric_ore = new ItemBlock(BlockList.electric_ore, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.electric_ore.getRegistryName()),
					
					//Miscellaneous
					ItemList.cloud_block = new ItemBlock(BlockList.cloud_block, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.cloud_block.getRegistryName()),
					ItemList.ethereal_light = new ItemBlock(BlockList.ethereal_light, new Item.Properties().group(mythologyBlocks)).setRegistryName(BlockList.ethereal_light.getRegistryName())
			);
			
			logger.info("Items registered.");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) //Block Registry
		{
			event.getRegistry().registerAll
			(
					//Block Initialization
					
					//Metals
					BlockList.copper_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("copper_ore")),
							BlockList.copper_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("copper_block")),
					BlockList.aluminum_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("aluminum_ore")),
							BlockList.aluminum_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("aluminum_block")),
					BlockList.bronze_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("bronze_block")),
					BlockList.tin_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("tin_ore")),
							BlockList.tin_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("tin_block")),
					BlockList.brass_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(location("brass_block")),
					
					//Miscellaneous Ores
					BlockList.electric_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("electric_ore")),
					
					//Miscellaneous
					BlockList.cloud_block = new BlockCloud(Block.Properties.create(Material.ICE).hardnessAndResistance(0.0f, 0.0f).lightValue(0).sound(SoundType.SNOW)).setRegistryName(location("cloud_block")),
					BlockList.ethereal_light = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 2.0f).lightValue(15).sound(SoundType.GLASS)).setRegistryName(location("ethereal_light"))
			);
			
			logger.info("Blocks registered.");
		}
		
		private static ResourceLocation location(String name) //Simplifies RegistryName
		{
			return new ResourceLocation(modid, name);
		}
	}
}
