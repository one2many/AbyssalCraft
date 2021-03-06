/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2017 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.blocks.itemblock;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.shinoow.abyssalcraft.api.energy.IEnergyContainer;

public class ItemPEContainerBlock extends ItemBlock {

	public ItemPEContainerBlock(Block block) {
		super(block);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack is, World player, List l, ITooltipFlag B){
		l.add(String.format("%d/%d PE", (int)getContainedEnergy(is), getMaxEnergy(is)));
	}

	public float getContainedEnergy(ItemStack stack) {
		float energy;
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		if(stack.getTagCompound().hasKey("PotEnergy"))
			energy = stack.getTagCompound().getFloat("PotEnergy");
		else {
			energy = 0;
			stack.getTagCompound().setFloat("PotEnergy", energy);
		}
		return energy;
	}

	@SideOnly(Side.CLIENT)
	public int getMaxEnergy(ItemStack stack) {
		if(block.hasTileEntity(block.getStateFromMeta(stack.getItemDamage()))){
			TileEntity tile = block.createTileEntity(Minecraft.getMinecraft().world, block.getStateFromMeta(stack.getItemDamage()));
			if(tile instanceof IEnergyContainer)
				return ((IEnergyContainer)tile).getMaxEnergy();
		}
		return 0;
	}
}
