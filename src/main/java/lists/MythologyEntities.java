package lists;

import com.hellion.mythologymod.MythologyModRegistries;
import com.hellion.mythologymod.entities.CentaurEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.event.RegistryEvent;

public class MythologyEntities 
{
	public static EntityType<?> MYTHOLOGY_ENTITY = EntityType.Builder.create(CentaurEntity::new, EntityClassification.CREATURE).build(MythologyModRegistries.MODID + "mythology_entity").setRegistryName(MythologyModRegistries.location("mythology_entity"));    
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			MythologyItems.mythology_entity_egg = registerEntitySpawnEgg(MYTHOLOGY_ENTITY, 0x03fceb, 0x39fc03, "mythology_entity_egg")
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(MYTHOLOGY_ENTITY, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE);
	}
	
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(MythologyModRegistries.MYTHOLOGYITEMS));
		item.setRegistryName(MythologyModRegistries.location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, Biome...biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
			}
		}
	}
}
