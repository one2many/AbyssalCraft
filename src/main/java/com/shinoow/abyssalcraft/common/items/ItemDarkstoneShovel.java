/**
 * AbyssalCraft
 * Copyright 2012-2015 Shinoow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shinoow.abyssalcraft.common.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import com.google.common.collect.Sets;
import com.shinoow.abyssalcraft.AbyssalCraft;

public class ItemDarkstoneShovel extends ItemTool {

	private static Set<Block> blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, AbyssalCraft.Darkgrass});
	public ItemDarkstoneShovel(ToolMaterial enumToolMaterial)
	{
		super(1, enumToolMaterial, blocksEffectiveAgainst);
		enumToolMaterial.customCraftingMaterial = Item.getItemFromBlock(AbyssalCraft.Darkstone_cobble);
		setHarvestLevel("shovel", 1);
	}
	/**
	 * Returns if the item (tool) can harvest results from the block type.
	 */
	@Override
	public boolean func_150897_b(Block par1Block)
	{
		if (par1Block == Blocks.snow_layer)
			return true;
		return par1Block == Blocks.snow;
	}
}