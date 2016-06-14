/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.shinoow.abyssalcraft.client.model.entity.ModelDG;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiGhoul;

@SideOnly(Side.CLIENT)
public class RenderAntiGhoul extends RenderLiving {

	private static final ResourceLocation ghoulResource = new ResourceLocation("abyssalcraft:textures/model/anti/depths_ghoul.png");

	public RenderAntiGhoul(RenderManager manager)
	{
		super(manager, new ModelDG(), 0.5F);
	}

	protected ResourceLocation getGhoulTexture(EntityAntiGhoul par1EntityLiving)
	{
		return ghoulResource;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return getGhoulTexture((EntityAntiGhoul)entity);
	}
}