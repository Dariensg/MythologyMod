package com.hellion.mythologymod.client.renders;

import com.hellion.mythologymod.entities.CentaurEntity;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class MythologyRenderRegistry 
{
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(CentaurEntity.class, new CentaurEntityRender.RenderFactory());
	}
}
