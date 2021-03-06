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
package com.shinoow.abyssalcraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.shinoow.abyssalcraft.AbyssalCraft;
import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.common.blocks.*;
import com.shinoow.abyssalcraft.common.blocks.itemblock.*;
import com.shinoow.abyssalcraft.common.blocks.tile.*;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenDLT;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenDrT;
import com.shinoow.abyssalcraft.lib.ACTabs;

public class BlockHandler implements ILifeCycleHandler {

	public static Block Darkbrickslab2, Darkcobbleslab2, abyslab2, Darkstoneslab2, DLTslab2,
	Altar, dreadbrickslab2, abydreadbrickslab2, cstonebrickslab2, ethaxiumslab2, house,
	darkethaxiumslab2, abycobbleslab2, dreadcobbleslab2, abydreadcobbleslab2, cstonecobbleslab2;

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		ACBlocks.stone = new BlockACStone().setUnlocalizedName("stone");
		ACBlocks.darkstone_brick = new BlockACBrick(1.65F, 12.0F, MapColor.BLACK).setUnlocalizedName("darkstone_brick");
		ACBlocks.cobblestone = new BlockACCobblestone().setUnlocalizedName("cobblestone");
		ACBlocks.glowing_darkstone_bricks = new BlockACBasic(Material.ROCK, "pickaxe", 3, 55F, 3000F, SoundType.STONE, MapColor.BLACK).setLightLevel(1.0F).setUnlocalizedName("dsglow");
		ACBlocks.darkstone_brick_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE, MapColor.BLACK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkbrickslab1");
		Darkbrickslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_brick_slab, Material.ROCK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkbrickslab2");
		ACBlocks.darkstone_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE, MapColor.BLACK).setHardness(1.65F) .setResistance(12.0F).setUnlocalizedName("darkcobbleslab1");
		Darkcobbleslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_cobblestone_slab, Material.ROCK).setHardness(1.65F) .setResistance(12.0F).setUnlocalizedName("darkcobbleslab2");
		ACBlocks.darkstone_brick_stairs = new BlockACStairs(ACBlocks.darkstone_brick).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dbstairs");
		ACBlocks.darkstone_cobblestone_stairs = new BlockACStairs(ACBlocks.cobblestone).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dcstairs");
		ACBlocks.darklands_oak_sapling = new BlockACSapling(new WorldGenDLT(true)).setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("dltsapling");
		ACBlocks.darklands_oak_leaves = new BlockACLeaves(ACBlocks.darklands_oak_sapling, MapColor.BLUE).setHardness(0.2F).setResistance(1.0F).setUnlocalizedName("dltleaves");
		ACBlocks.darklands_oak_wood = new BlockACLog(MapColor.BROWN).setHardness(2.0F).setResistance(1.0F).setUnlocalizedName("dltlog");
		ACBlocks.abyssal_stone_brick = new BlockACBrick(2, 1.8F, 12.0F, MapColor.GREEN).setUnlocalizedName("abybrick");
		ACBlocks.abyssal_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 2, SoundType.STONE, MapColor.GREEN).setCreativeTab(ACTabs.tabBlock).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyslab1");
		abyslab2 = new BlockACDoubleSlab(ACBlocks.abyssal_stone_brick_slab, Material.ROCK, "pickaxe", 2).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyslab2");
		ACBlocks.abyssal_stone_brick_stairs = new BlockACStairs(ACBlocks.abyssal_stone_brick, "pickaxe", 2).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("abystairs");
		ACBlocks.coralium_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("coraliumore");
		ACBlocks.abyssalnite_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abyore");
		ACBlocks.abyssal_stone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 2, SoundType.STONE, MapColor.GREEN).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyfence");
		ACBlocks.darkstone_cobblestone_wall = new BlockACWall(ACBlocks.cobblestone).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dscwall");
		ACBlocks.wooden_crate = new BlockCrate().setHardness(3.0F).setResistance(6.0F).setUnlocalizedName("crate");
		ACBlocks.oblivion_deathbomb = new BlockODB().setHardness(3.0F).setResistance(0F).setUnlocalizedName("odb");
		ACBlocks.ingot_block = new IngotBlock().setUnlocalizedName("ingotblock");
		ACBlocks.coralium_infused_stone = new BlockACOre(3, 3.0F, 6.0F).setUnlocalizedName("coraliumstone");
		ACBlocks.odb_core = new BlockODBcore().setHardness(3.0F).setResistance(0F).setUnlocalizedName("odbcore");
		ACBlocks.abyssal_gateway = new BlockAbyssPortal().setUnlocalizedName("abyportal");
		ACBlocks.darkstone_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE, MapColor.BLACK).setCreativeTab(ACTabs.tabBlock).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkstoneslab1");
		Darkstoneslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_slab, Material.ROCK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkstoneslab2");
		ACBlocks.coralium_fire = new BlockCoraliumfire().setLightLevel(1.0F).setUnlocalizedName("coraliumfire");
		ACBlocks.darkstone_button = new BlockACButton(true, "DS").setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("dsbutton");
		ACBlocks.darkstone_pressure_plate = new BlockACPressureplate("DS", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, SoundType.STONE).setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("dspplate");
		ACBlocks.darklands_oak_planks = new BlockACBasic(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD, MapColor.BROWN).setUnlocalizedName("dltplank");
		ACBlocks.darklands_oak_button = new BlockACButton(true, "DLTplank").setHardness(0.5F).setUnlocalizedName("dltbutton");
		ACBlocks.darklands_oak_pressure_plate = new BlockACPressureplate("DLTplank", Material.WOOD, BlockACPressureplate.Sensitivity.EVERYTHING, SoundType.WOOD).setHardness(0.5F).setUnlocalizedName("dltpplate");
		ACBlocks.darklands_oak_stairs = new BlockACStairs(ACBlocks.darklands_oak_planks).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltstairs");
		ACBlocks.darklands_oak_slab = new BlockACSingleSlab(Material.WOOD, SoundType.WOOD, MapColor.BROWN).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltslab1");
		DLTslab2 = new BlockACDoubleSlab(ACBlocks.darklands_oak_slab, Material.WOOD).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltslab2");
		ACBlocks.dreadlands_infused_powerstone = new BlockPSDL().setHardness(50.0F).setResistance(3000F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("psdl");
		ACBlocks.abyssal_coralium_ore = new BlockACOre(3, 3.0F, 6.0F).setUnlocalizedName("abycorore");
		Altar = new BlockAltar().setHardness(4.0F).setResistance(300.0F).setUnlocalizedName("altar");
		ACBlocks.abyssal_stone_button = new BlockACButton(false, "pickaxe", 2, "AS").setHardness(0.8F).setResistance(12.0F).setUnlocalizedName("abybutton");
		ACBlocks.abyssal_stone_pressure_plate = new BlockACPressureplate("AS", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, "pickaxe", 2, SoundType.STONE).setHardness(0.8F).setResistance(12.0F).setUnlocalizedName("abypplate");
		ACBlocks.darkstone_brick_fence = new BlockACFence(Material.ROCK, SoundType.STONE, MapColor.BLACK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dsbfence");
		ACBlocks.darklands_oak_fence = new BlockACFence(Material.WOOD, SoundType.WOOD, MapColor.BROWN).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltfence");
		ACBlocks.dreaded_abyssalnite_ore = new BlockACOre(4, 2.5F, 20.0F).setUnlocalizedName("dreadore");
		ACBlocks.dreadlands_abyssalnite_ore = new BlockACOre(4, 2.5F, 20.0F).setUnlocalizedName("abydreadore");
		ACBlocks.dreadstone_brick = new BlockACBrick(4, 2.5F, 20.0F, MapColor.RED).setUnlocalizedName("dreadbrick");
		ACBlocks.abyssalnite_stone_brick = new BlockACBrick(4, 2.5F, 20.0F, MapColor.PURPLE).setUnlocalizedName("abydreadbrick");
		ACBlocks.dreadlands_sapling = new BlockACSapling(new WorldGenDrT(true)).setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("dreadsapling");
		ACBlocks.dreadlands_log = new BlockACLog(MapColor.RED).setHardness(2.0F).setResistance(12.0F).setUnlocalizedName("dreadlog");
		ACBlocks.dreadlands_leaves = new BlockACLeaves(ACBlocks.dreadlands_sapling, MapColor.RED).setHardness(0.2F).setResistance(1.0F).setUnlocalizedName("dreadleaves");
		ACBlocks.dreadlands_planks = new BlockACBasic(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD, MapColor.RED).setUnlocalizedName("dreadplanks");
		ACBlocks.dreaded_gateway = new BlockDreadlandsPortal().setUnlocalizedName("dreadportal");
		ACBlocks.dreaded_fire = new BlockDreadFire().setLightLevel(1.0F).setUnlocalizedName("dreadfire");
		ACBlocks.depths_ghoul_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityDGhead(); }}.setUnlocalizedName("dghead");
		ACBlocks.liquid_coralium = new BlockCLiquid().setResistance(500.0F).setLightLevel(1.0F).setUnlocalizedName("cwater");
		ACBlocks.dreadlands_grass = new BlockDreadGrass().setHardness(0.4F).setUnlocalizedName("dreadgrass");
		ACBlocks.pete_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityPhead(); }}.setUnlocalizedName("phead");
		ACBlocks.mr_wilson_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityWhead(); }}.setUnlocalizedName("whead");
		ACBlocks.dr_orange_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityOhead(); }}.setUnlocalizedName("ohead");
		ACBlocks.dreadstone_brick_stairs = new BlockACStairs(ACBlocks.dreadstone_brick, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickstairs");
		ACBlocks.dreadstone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.RED).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickfence");
		ACBlocks.dreadstone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.RED).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickslab1");
		dreadbrickslab2 = new BlockACDoubleSlab(ACBlocks.dreadstone_brick_slab, Material.ROCK, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickslab2");
		ACBlocks.abyssalnite_stone_brick_stairs = new BlockACStairs(ACBlocks.abyssalnite_stone_brick, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickstairs");
		ACBlocks.abyssalnite_stone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.PURPLE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickfence");
		ACBlocks.abyssalnite_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.PURPLE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickslab1");
		abydreadbrickslab2 = new BlockACDoubleSlab(ACBlocks.abyssalnite_stone_brick_slab, Material.ROCK, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickslab2");
		ACBlocks.liquid_antimatter = new BlockAntiliquid().setResistance(500.0F).setLightLevel(0.5F).setUnlocalizedName("antiwater");
		ACBlocks.coralium_stone_brick = new BlockACBrick(1.5F, 10.0F, MapColor.CYAN).setUnlocalizedName("cstonebrick");
		ACBlocks.coralium_stone_brick_fence = new BlockACFence(Material.ROCK, SoundType.STONE, MapColor.CYAN).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickfence");
		ACBlocks.coralium_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE, MapColor.CYAN).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickslab1");
		cstonebrickslab2 = new BlockACDoubleSlab(ACBlocks.coralium_stone_brick_slab, Material.ROCK).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickslab2");
		ACBlocks.coralium_stone_brick_stairs = new BlockACStairs(ACBlocks.coralium_stone_brick, "pickaxe", 0).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickstairs");
		ACBlocks.coralium_stone_button = new BlockACButton(false, "cstone").setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("cstonebutton");
		ACBlocks.coralium_stone_pressure_plate = new BlockACPressureplate("cstone", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, SoundType.STONE).setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("cstonepplate");
		ACBlocks.chagaroth_altar_top = new BlockDreadAltarTop().setHardness(30.0F).setResistance(300.0F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("dreadaltartop");
		ACBlocks.chagaroth_altar_bottom = new BlockDreadAltarBottom().setHardness(30.0F).setResistance(300.0F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("dreadaltarbottom");
		ACBlocks.crystallizer_idle = new BlockCrystallizer(false).setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("crystallizer");
		ACBlocks.crystallizer_active = new BlockCrystallizer(true).setHardness(2.5F).setResistance(12.0F).setLightLevel(0.875F).setUnlocalizedName("crystallizer_on");
		ACBlocks.transmutator_idle = new BlockTransmutator(false).setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("transmutator");
		ACBlocks.transmutator_active = new BlockTransmutator(true).setHardness(2.5F).setResistance(12.0F).setLightLevel(0.875F).setUnlocalizedName("transmutator_on");
		ACBlocks.dreadguard_spawner = new BlockDreadguardSpawner().setUnlocalizedName("dreadguardspawner");
		ACBlocks.chagaroth_spawner = new BlockChagarothSpawner().setUnlocalizedName("chagarothspawner");
		ACBlocks.dreadlands_wood_fence = new BlockACFence(Material.WOOD, SoundType.WOOD, MapColor.RED).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("drtfence");
		ACBlocks.nitre_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("nitreore");
		ACBlocks.abyssal_iron_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abyiroore");
		ACBlocks.abyssal_gold_ore = new BlockACOre(2, 5.0F, 10.0F).setUnlocalizedName("abygolore");
		ACBlocks.abyssal_diamond_ore = new BlockACOre(2, 5.0F, 10.0F).setUnlocalizedName("abydiaore");
		ACBlocks.abyssal_nitre_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abynitore");
		ACBlocks.abyssal_tin_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abytinore");
		ACBlocks.abyssal_copper_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abycopore");
		ACBlocks.pearlescent_coralium_ore = new BlockACOre(5, 8.0F, 10.0F).setUnlocalizedName("abypcorore");
		ACBlocks.liquified_coralium_ore = new BlockACOre(4, 10.0F, 12.0F).setUnlocalizedName("abylcorore");
		ACBlocks.solid_lava = new BlockSolidLava("solidlava");
		ACBlocks.ethaxium_brick = new BlockACBrick(8, 100.0F, Float.MAX_VALUE, MapColor.CLOTH).setUnlocalizedName("ethaxiumbrick");
		ACBlocks.ethaxium_pillar = new BlockEthaxiumPillar(100.0F, MapColor.CLOTH).setUnlocalizedName("ethaxiumpillar");
		ACBlocks.ethaxium_brick_stairs = new BlockACStairs(ACBlocks.ethaxium_brick, "pickaxe", 8).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickstairs");
		ACBlocks.ethaxium_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 8, SoundType.STONE, MapColor.CLOTH).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickslab1");
		ethaxiumslab2 = new BlockACDoubleSlab(ACBlocks.ethaxium_brick_slab, Material.ROCK, "pickaxe", 8).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickslab2");
		ACBlocks.ethaxium_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 8, SoundType.STONE, MapColor.CLOTH).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumfence");
		ACBlocks.omothol_gateway = new BlockOmotholPortal().setUnlocalizedName("omotholportal");
		ACBlocks.omothol_fire = new BlockOmotholFire().setLightLevel(1.0F).setUnlocalizedName("omotholfire");
		ACBlocks.engraver = new BlockEngraver().setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("engraver");
		house = new BlockHouse().setHardness(1.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("engraver_on");
		ACBlocks.materializer = new BlockMaterializer().setUnlocalizedName("materializer");
		ACBlocks.dark_ethaxium_brick = new BlockACBrick(8, 150.0F, Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrick");
		ACBlocks.dark_ethaxium_pillar = new BlockEthaxiumPillar(150.0F, MapColor.STONE).setUnlocalizedName("darkethaxiumpillar");
		ACBlocks.dark_ethaxium_brick_stairs = new BlockACStairs(ACBlocks.dark_ethaxium_brick, "pickaxe", 8).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickstairs");
		ACBlocks.dark_ethaxium_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 8, SoundType.STONE).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickslab1");
		darkethaxiumslab2 = new BlockACDoubleSlab(ACBlocks.dark_ethaxium_brick_slab, Material.ROCK, "pickaxe", 8).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickslab2");
		ACBlocks.dark_ethaxium_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 8, SoundType.STONE, MapColor.STONE).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickfence");
		ACBlocks.ritual_altar = new BlockRitualAltar().setUnlocalizedName("ritualaltar");
		ACBlocks.ritual_pedestal = new BlockRitualPedestal().setUnlocalizedName("ritualpedestal");
		ACBlocks.shoggoth_ooze = new BlockShoggothOoze().setUnlocalizedName("shoggothblock");
		ACBlocks.statue = new BlockStatue().setUnlocalizedName("statue");
		ACBlocks.shoggoth_biomass = new BlockShoggothBiomass();
		ACBlocks.energy_pedestal = new BlockEnergyPedestal();
		ACBlocks.monolith_pillar = new BlockMonolithPillar();
		ACBlocks.sacrificial_altar = new BlockSacrificialAltar();
		ACBlocks.tiered_energy_pedestal = new BlockTieredEnergyPedestal();
		ACBlocks.tiered_sacrificial_altar = new BlockTieredSacrificialAltar();
		ACBlocks.jzahar_spawner = new BlockJzaharSpawner().setUnlocalizedName("jzaharspawner");
		ACBlocks.minion_of_the_gatekeeper_spawner = new BlockGatekeeperMinionSpawner().setUnlocalizedName("gatekeeperminionspawner");
		ACBlocks.mimic_fire = new BlockMimicFire().setUnlocalizedName("fire");
		ACBlocks.decorative_statue = new BlockDecorativeStatue().setUnlocalizedName("statue");
		ACBlocks.crystal_cluster = new BlockCrystalCluster().setUnlocalizedName("crystalcluster");
		ACBlocks.crystal_cluster2 = new BlockCrystalCluster2().setUnlocalizedName("crystalcluster2");
		ACBlocks.energy_collector = new BlockEnergyCollector();
		ACBlocks.energy_relay = new BlockEnergyRelay();
		ACBlocks.energy_container = new BlockEnergyContainer();
		ACBlocks.tiered_energy_collector = new BlockTieredEnergyCollector();
		ACBlocks.tiered_energy_relay = new BlockTieredEnergyRelay("tieredenergyrelay");
		ACBlocks.tiered_energy_container = new BlockTieredEnergyContainer();
		ACBlocks.abyssal_sand = new BlockAbyssalSand();
		ACBlocks.fused_abyssal_sand = new BlockFusedAbyssalSand();
		ACBlocks.abyssal_sand_glass = new BlockAbyssalSandGlass();
		ACBlocks.dreadlands_dirt = new BlockDreadlandsDirt();
		ACBlocks.abyssal_cobblestone_stairs = new BlockACStairs(ACBlocks.cobblestone, "pickaxe", 2).setUnlocalizedName("abyssalcobblestonestairs");
		ACBlocks.abyssal_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 2, SoundType.STONE, MapColor.GREEN).setHardness(2.6F).setResistance(12.0F).setUnlocalizedName("abyssalcobblestoneslab1");
		abycobbleslab2 = new BlockACDoubleSlab(ACBlocks.abyssal_cobblestone_slab, Material.ROCK, "pickaxe", 2).setHardness(2.6F).setResistance(12.0F).setUnlocalizedName("abyssalcobblestoneslab2");
		ACBlocks.abyssal_cobblestone_wall = new BlockACWall(ACBlocks.cobblestone, 2).setHardness(2.6F).setResistance(12.0F).setUnlocalizedName("abyssalcobblestonewall");
		ACBlocks.dreadstone_cobblestone_stairs = new BlockACStairs(ACBlocks.cobblestone, "pickaxe", 4).setUnlocalizedName("dreadstonecobblestonestairs");
		ACBlocks.dreadstone_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.RED).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("dreadstonecobblestoneslab1");
		dreadcobbleslab2 = new BlockACDoubleSlab(ACBlocks.dreadstone_cobblestone_slab, Material.ROCK, "pickaxe", 4).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("dreadstonecobblestoneslab2");
		ACBlocks.dreadstone_cobblestone_wall = new BlockACWall(ACBlocks.cobblestone, 4).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("dreadstonecobblestonewall");
		ACBlocks.abyssalnite_cobblestone_stairs = new BlockACStairs(ACBlocks.cobblestone, "pickaxe", 4).setUnlocalizedName("abyssalnitecobblestonestairs");
		ACBlocks.abyssalnite_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE, MapColor.PURPLE).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("abyssalnitecobblestoneslab1");
		abydreadcobbleslab2 = new BlockACDoubleSlab(ACBlocks.abyssalnite_cobblestone_slab, Material.ROCK, "pickaxe", 4).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("abyssalnitecobblestoneslab2");
		ACBlocks.abyssalnite_cobblestone_wall = new BlockACWall(ACBlocks.cobblestone, 4).setHardness(3.3F).setResistance(20.0F).setUnlocalizedName("abyssalnitecobblestonewall");
		ACBlocks.coralium_cobblestone_stairs = new BlockACStairs(ACBlocks.cobblestone).setUnlocalizedName("coraliumcobblestonestairs");
		ACBlocks.coralium_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE, MapColor.CYAN).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName("coraliumcobblestoneslab1");
		cstonecobbleslab2 = new BlockACDoubleSlab(ACBlocks.coralium_cobblestone_slab, Material.ROCK).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName("coraliumcobblestoneslab2");
		ACBlocks.coralium_cobblestone_wall = new BlockACWall(ACBlocks.cobblestone).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName("coraliumcobblestonewall");
		ACBlocks.luminous_thistle = new BlockLuminousThistle();
		ACBlocks.wastelands_thorn = new BlockWastelandsThorn();
		ACBlocks.rending_pedestal = new BlockRendingPedestal();
		ACBlocks.state_transformer = new BlockStateTransformer();
		ACBlocks.energy_depositioner = new BlockEnergyDepositioner();

		((BlockRitualAltar)ACBlocks.ritual_altar).setBlocks();
		((BlockRitualPedestal)ACBlocks.ritual_pedestal).setBlocks();

		GameRegistry.registerTileEntity(TileEntityCrate.class, "tileEntityCrate");
		GameRegistry.registerTileEntity(TileEntityDGhead.class, "tileEntityDGhead");
		GameRegistry.registerTileEntity(TileEntityPhead.class, "tileEntityPhead");
		GameRegistry.registerTileEntity(TileEntityWhead.class, "tileEntityWhead");
		GameRegistry.registerTileEntity(TileEntityOhead.class, "tileEntityOhead");
		GameRegistry.registerTileEntity(TileEntityCrystallizer.class, "tileEntityCrystallizer");
		GameRegistry.registerTileEntity(TileEntityTransmutator.class, "tileEntityTransmutator");
		GameRegistry.registerTileEntity(TileEntityDreadguardSpawner.class, "tileEntityDradguardSpawner");
		GameRegistry.registerTileEntity(TileEntityChagarothSpawner.class, "tileEntityChagarothSpawner");
		GameRegistry.registerTileEntity(TileEntityEngraver.class, "tileEntityEngraver");
		GameRegistry.registerTileEntity(TileEntityMaterializer.class, "tileEntityMaterializer");
		GameRegistry.registerTileEntity(TileEntityRitualAltar.class, "tileEntityRitualAltar");
		GameRegistry.registerTileEntity(TileEntityRitualPedestal.class, "tileEntityRitualPedestal");
		GameRegistry.registerTileEntity(TileEntityStatue.class, "tileEntityStatue");
		GameRegistry.registerTileEntity(TileEntityDecorativeStatue.class, "tileEntityDecorativeStatue");
		GameRegistry.registerTileEntity(TileEntityShoggothBiomass.class, "tileEntityShoggothBiomass");
		GameRegistry.registerTileEntity(TileEntityEnergyPedestal.class, "tileEntityEnergyPedestal");
		GameRegistry.registerTileEntity(TileEntitySacrificialAltar.class, "tileEntitySacrificialAltar");
		GameRegistry.registerTileEntity(TileEntityTieredEnergyPedestal.class, "tileEntityTieredEnergyPedestal");
		GameRegistry.registerTileEntity(TileEntityTieredSacrificialAltar.class, "tileEntityTieredSacrificialAltar");
		GameRegistry.registerTileEntity(TileEntityJzaharSpawner.class, "tileEntityJzaharSpawner");
		GameRegistry.registerTileEntity(TileEntityGatekeeperMinionSpawner.class, "tileEntityGatekeeperMinionSpawner");
		GameRegistry.registerTileEntity(TileEntityEnergyCollector.class, "tileEntityEnergyCollector");
		GameRegistry.registerTileEntity(TileEntityEnergyRelay.class, "tileEntityEnergyRelay");
		GameRegistry.registerTileEntity(TileEntityEnergyContainer.class, "tileEntityEnergyContainer");
		GameRegistry.registerTileEntity(TileEntityTieredEnergyCollector.class, "tileEntityTieredEnergyCollector");
		GameRegistry.registerTileEntity(TileEntityTieredEnergyRelay.class, "tileEntityTieredEnergyRelay");
		GameRegistry.registerTileEntity(TileEntityTieredEnergyContainer.class, "tileEntityTieredEnergyContainer");
		GameRegistry.registerTileEntity(TileEntityRendingPedestal.class, "tileEntityRendingPedestal");
		GameRegistry.registerTileEntity(TileEntityStateTransformer.class, "tileEntityStateTransformer");
		GameRegistry.registerTileEntity(TileEntityEnergyDepositioner.class, "tileEntityEnergyDepositioner");

		registerBlock(ACBlocks.stone, new ItemMetadataBlock(ACBlocks.stone), "stone");
		registerBlock(ACBlocks.cobblestone, new ItemMetadataBlock(ACBlocks.cobblestone), "cobblestone");
		registerBlock(ACBlocks.darkstone_brick, new ItemMetadataBlock(ACBlocks.darkstone_brick), "darkstone_brick");
		registerBlock(ACBlocks.glowing_darkstone_bricks, "dsglow");
		registerBlock(ACBlocks.darkstone_brick_slab, new ItemDarkbrickSlab(ACBlocks.darkstone_brick_slab), "darkbrickslab1");
		registerBlock(Darkbrickslab2, new ItemDarkbrickSlab(Darkbrickslab2), "darkbrickslab2");
		registerBlock(ACBlocks.darkstone_cobblestone_slab, new ItemDarkcobbleSlab(ACBlocks.darkstone_cobblestone_slab), "darkcobbleslab1");
		registerBlock(Darkcobbleslab2, new ItemDarkcobbleSlab(Darkcobbleslab2), "darkcobbleslab2");
		registerBlock(ACBlocks.darkstone_brick_stairs, "dbstairs");
		registerBlock(ACBlocks.darkstone_cobblestone_stairs, "dcstairs");
		registerBlock(ACBlocks.darklands_oak_leaves, "dltleaves");
		registerBlock(ACBlocks.darklands_oak_wood, "dltlog");
		registerBlock(ACBlocks.darklands_oak_sapling, "dltsapling");
		registerBlock(ACBlocks.abyssal_stone_brick, new ItemMetadataBlock(ACBlocks.abyssal_stone_brick), "abybrick");
		registerBlock(ACBlocks.abyssal_stone_brick_slab, new ItemAbySlab(ACBlocks.abyssal_stone_brick_slab), "abyslab1");
		registerBlock(abyslab2, new ItemAbySlab(abyslab2), "abyslab2");
		registerBlock(ACBlocks.abyssal_stone_brick_stairs, new ItemBlockColorName(ACBlocks.abyssal_stone_brick_stairs), "abystairs");
		registerBlock(ACBlocks.coralium_ore, "coraliumore");
		registerBlock(ACBlocks.abyssalnite_ore, "abyore");
		registerBlock(ACBlocks.abyssal_stone_brick_fence, new ItemBlockColorName(ACBlocks.abyssal_stone_brick_fence), "abyfence");
		registerBlock(ACBlocks.darkstone_cobblestone_wall, "dscwall");
		registerBlock(ACBlocks.oblivion_deathbomb, new ItemODB(ACBlocks.oblivion_deathbomb), "odb");
		registerBlock(ACBlocks.ingot_block, new ItemMetadataBlock(ACBlocks.ingot_block), "ingotblock");
		registerBlock(ACBlocks.coralium_infused_stone, "coraliumstone");
		registerBlock(ACBlocks.odb_core, new ItemBlockColorName(ACBlocks.odb_core), "odbcore");
		registerBlock(ACBlocks.wooden_crate, "crate");
		registerBlock(ACBlocks.abyssal_gateway, "abyportal");
		registerBlock(ACBlocks.darkstone_slab, new ItemDarkstoneSlab(ACBlocks.darkstone_slab), "darkstoneslab1");
		registerBlock(Darkstoneslab2, new ItemDarkstoneSlab(Darkstoneslab2), "darkstoneslab2");
		registerBlock(ACBlocks.coralium_fire, "coraliumfire");
		registerBlock(ACBlocks.darkstone_button, "dsbutton");
		registerBlock(ACBlocks.darkstone_pressure_plate, "dspplate");
		registerBlock(ACBlocks.darklands_oak_planks, "dltplank");
		registerBlock(ACBlocks.darklands_oak_button, "dltbutton");
		registerBlock(ACBlocks.darklands_oak_pressure_plate, "dltpplate");
		registerBlock(ACBlocks.darklands_oak_stairs, "dltstairs");
		registerBlock(ACBlocks.darklands_oak_slab, new ItemDLTSlab(ACBlocks.darklands_oak_slab), "dltslab1");
		registerBlock(DLTslab2, new ItemDLTSlab(DLTslab2), "dltslab2");
		registerBlock(ACBlocks.liquid_coralium, "cwater");
		registerBlock(ACBlocks.dreadlands_infused_powerstone, "psdl");
		registerBlock(ACBlocks.abyssal_coralium_ore, "abycorore");
		registerBlock(Altar, "altar");
		registerBlock(ACBlocks.abyssal_stone_button, new ItemBlockColorName(ACBlocks.abyssal_stone_button), "abybutton");
		registerBlock(ACBlocks.abyssal_stone_pressure_plate, new ItemBlockColorName(ACBlocks.abyssal_stone_pressure_plate), "abypplate");
		registerBlock(ACBlocks.darkstone_brick_fence, "dsbfence");
		registerBlock(ACBlocks.darklands_oak_fence, "dltfence");
		registerBlock(ACBlocks.dreadlands_abyssalnite_ore, "abydreadore");
		registerBlock(ACBlocks.dreaded_abyssalnite_ore, "dreadore");
		registerBlock(ACBlocks.dreadstone_brick, new ItemMetadataBlock(ACBlocks.dreadstone_brick), "dreadbrick");
		registerBlock(ACBlocks.abyssalnite_stone_brick, new ItemMetadataBlock(ACBlocks.abyssalnite_stone_brick), "abydreadbrick");
		registerBlock(ACBlocks.dreadlands_grass, "dreadgrass");
		registerBlock(ACBlocks.dreadlands_log, "dreadlog");
		registerBlock(ACBlocks.dreadlands_leaves, "dreadleaves");
		registerBlock(ACBlocks.dreadlands_sapling, "dreadsapling");
		registerBlock(ACBlocks.dreadlands_planks, "dreadplanks");
		registerBlock(ACBlocks.dreaded_gateway, "dreadportal");
		registerBlock(ACBlocks.dreaded_fire, "dreadfire");
		registerBlock(ACBlocks.depths_ghoul_head, "dghead");
		registerBlock(ACBlocks.pete_head, "phead");
		registerBlock(ACBlocks.mr_wilson_head, "whead");
		registerBlock(ACBlocks.dr_orange_head, "ohead");
		registerBlock(ACBlocks.dreadstone_brick_stairs, "dreadbrickstairs");
		registerBlock(ACBlocks.dreadstone_brick_fence, "dreadbrickfence");
		registerBlock(ACBlocks.dreadstone_brick_slab, new ItemDreadbrickSlab(ACBlocks.dreadstone_brick_slab), "dreadbrickslab1");
		registerBlock(dreadbrickslab2, new ItemDreadbrickSlab(dreadbrickslab2), "dreadbrickslab2");
		registerBlock(ACBlocks.abyssalnite_stone_brick_stairs, "abydreadbrickstairs");
		registerBlock(ACBlocks.abyssalnite_stone_brick_fence, "abydreadbrickfence");
		registerBlock(ACBlocks.abyssalnite_stone_brick_slab, new ItemAbyDreadbrickSlab(ACBlocks.abyssalnite_stone_brick_slab), "abydreadbrickslab1");
		registerBlock(abydreadbrickslab2, new ItemAbyDreadbrickSlab(abydreadbrickslab2), "abydreadbrickslab2");
		registerBlock(ACBlocks.liquid_antimatter, "antiwater");
		registerBlock(ACBlocks.coralium_stone_brick, new ItemMetadataBlock(ACBlocks.coralium_stone_brick), "cstonebrick");
		registerBlock(ACBlocks.coralium_stone_brick_fence, "cstonebrickfence");
		registerBlock(ACBlocks.coralium_stone_brick_slab, new ItemCstonebrickSlab(ACBlocks.coralium_stone_brick_slab), "cstonebrickslab1");
		registerBlock(cstonebrickslab2, new ItemCstonebrickSlab(cstonebrickslab2), "cstonebrickslab2");
		registerBlock(ACBlocks.coralium_stone_brick_stairs, "cstonebrickstairs");
		registerBlock(ACBlocks.coralium_stone_button, "cstonebutton");
		registerBlock(ACBlocks.coralium_stone_pressure_plate, "cstonepplate");
		registerBlock(ACBlocks.chagaroth_altar_top, "dreadaltartop");
		registerBlock(ACBlocks.chagaroth_altar_bottom, "dreadaltarbottom");
		registerBlock(ACBlocks.crystallizer_idle, "crystallizer");
		registerBlock(ACBlocks.crystallizer_active, "crystallizer_on");
		registerBlock(ACBlocks.transmutator_idle, "transmutator");
		registerBlock(ACBlocks.transmutator_active, "transmutator_on");
		registerBlock(ACBlocks.dreadguard_spawner, "dreadguardspawner");
		registerBlock(ACBlocks.chagaroth_spawner, "chagarothspawner");
		registerBlock(ACBlocks.dreadlands_wood_fence, "drtfence");
		registerBlock(ACBlocks.nitre_ore, "nitreore");
		registerBlock(ACBlocks.abyssal_iron_ore, "abyiroore");
		registerBlock(ACBlocks.abyssal_gold_ore, "abygolore");
		registerBlock(ACBlocks.abyssal_diamond_ore, "abydiaore");
		registerBlock(ACBlocks.abyssal_nitre_ore, "abynitore");
		registerBlock(ACBlocks.abyssal_tin_ore, "abytinore");
		registerBlock(ACBlocks.abyssal_copper_ore, "abycopore");
		registerBlock(ACBlocks.pearlescent_coralium_ore, "abypcorore");
		registerBlock(ACBlocks.liquified_coralium_ore, "abylcorore");
		registerBlock(ACBlocks.solid_lava, "solidlava");
		registerBlock(ACBlocks.ethaxium_brick, new ItemMetadataBlock(ACBlocks.ethaxium_brick), "ethaxiumbrick");
		registerBlock(ACBlocks.ethaxium_pillar, new ItemBlockColorName(ACBlocks.ethaxium_pillar), "ethaxiumpillar");
		registerBlock(ACBlocks.ethaxium_brick_stairs, new ItemBlockColorName(ACBlocks.ethaxium_brick_stairs), "ethaxiumbrickstairs");
		registerBlock(ACBlocks.ethaxium_brick_slab, new ItemEthaxiumSlab(ACBlocks.ethaxium_brick_slab), "ethaxiumbrickslab1");
		registerBlock(ethaxiumslab2, new ItemEthaxiumSlab(ethaxiumslab2), "ethaxiumbrickslab2");
		registerBlock(ACBlocks.ethaxium_brick_fence, new ItemBlockColorName(ACBlocks.ethaxium_brick_fence), "ethaxiumfence");
		registerBlock(ACBlocks.omothol_gateway, "omotholportal");
		registerBlock(ACBlocks.omothol_fire, "omotholfire");
		registerBlock(ACBlocks.engraver, "engraver");
		registerBlock(house, "engraver_on");
		registerBlock(ACBlocks.materializer, "materializer");
		registerBlock(ACBlocks.dark_ethaxium_brick, new ItemMetadataBlock(ACBlocks.dark_ethaxium_brick), "darkethaxiumbrick");
		registerBlock(ACBlocks.dark_ethaxium_pillar, new ItemBlockColorName(ACBlocks.dark_ethaxium_pillar), "darkethaxiumpillar");
		registerBlock(ACBlocks.dark_ethaxium_brick_stairs, new ItemBlockColorName(ACBlocks.dark_ethaxium_brick_stairs), "darkethaxiumbrickstairs");
		registerBlock(ACBlocks.dark_ethaxium_brick_slab, new ItemDarkEthaxiumSlab(ACBlocks.dark_ethaxium_brick_slab), "darkethaxiumbrickslab1");
		registerBlock(darkethaxiumslab2, new ItemDarkEthaxiumSlab(darkethaxiumslab2), "darkethaxiumbrickslab2");
		registerBlock(ACBlocks.dark_ethaxium_brick_fence, new ItemBlockColorName(ACBlocks.dark_ethaxium_brick_fence), "darkethaxiumbrickfence");
		registerBlock(ACBlocks.ritual_altar, new ItemRitualBlock(ACBlocks.ritual_altar), "ritualaltar");
		registerBlock(ACBlocks.ritual_pedestal, new ItemRitualBlock(ACBlocks.ritual_pedestal), "ritualpedestal");
		registerBlock(ACBlocks.shoggoth_ooze, new ItemShoggothOoze(ACBlocks.shoggoth_ooze), "shoggothblock");
		registerBlock(ACBlocks.statue, new ItemMetadataBlock(ACBlocks.statue), "statue");
		registerBlock(ACBlocks.shoggoth_biomass, "shoggothbiomass");
		registerBlock(ACBlocks.energy_pedestal, new ItemPEContainerBlock(ACBlocks.energy_pedestal), "energypedestal");
		registerBlock(ACBlocks.monolith_pillar, "monolithpillar");
		registerBlock(ACBlocks.sacrificial_altar, new ItemPEContainerBlock(ACBlocks.sacrificial_altar), "sacrificialaltar");
		registerBlock(ACBlocks.tiered_energy_pedestal, new ItemMetadataPEContainerBlock(ACBlocks.tiered_energy_pedestal), "tieredenergypedestal");
		registerBlock(ACBlocks.tiered_sacrificial_altar, new ItemMetadataPEContainerBlock(ACBlocks.tiered_sacrificial_altar), "tieredsacrificialaltar");
		registerBlock(ACBlocks.jzahar_spawner, "jzaharspawner");
		registerBlock(ACBlocks.minion_of_the_gatekeeper_spawner, "gatekeeperminionspawner");
		registerBlock(ACBlocks.mimic_fire, "fire");
		registerBlock(ACBlocks.decorative_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_statue), "decorativestatue");
		registerBlock(ACBlocks.crystal_cluster, new ItemCrystalClusterBlock(ACBlocks.crystal_cluster), "crystalcluster");
		registerBlock(ACBlocks.crystal_cluster2, new ItemCrystalClusterBlock2(ACBlocks.crystal_cluster2), "crystalcluster2");
		registerBlock(ACBlocks.energy_collector, new ItemPEContainerBlock(ACBlocks.energy_collector), "energycollector");
		registerBlock(ACBlocks.energy_relay, new ItemPEContainerBlock(ACBlocks.energy_relay), "energyrelay");
		registerBlock(ACBlocks.energy_container, new ItemPEContainerBlock(ACBlocks.energy_container), "energycontainer");
		registerBlock(ACBlocks.tiered_energy_collector, new ItemTieredEnergyCollectorBlock(ACBlocks.tiered_energy_collector), "tieredenergycollector");
		registerBlock(ACBlocks.tiered_energy_relay, new ItemTieredEnergyRelayBlock(ACBlocks.tiered_energy_relay), "tieredenergyrelay");
		registerBlock(ACBlocks.tiered_energy_container, new ItemTieredEnergyContainerBlock(ACBlocks.tiered_energy_container), "tieredenergycontainer");
		registerBlock(ACBlocks.abyssal_sand, "abyssalsand");
		registerBlock(ACBlocks.fused_abyssal_sand, "fusedabyssalsand");
		registerBlock(ACBlocks.abyssal_sand_glass, "abyssalsandglass");
		registerBlock(ACBlocks.dreadlands_dirt, "dreadlandsdirt");
		registerBlock(ACBlocks.abyssal_cobblestone_stairs, "abyssalcobblestonestairs");
		registerBlock(ACBlocks.abyssal_cobblestone_slab, new ItemAbyssalcobbleSlab(ACBlocks.abyssal_cobblestone_slab), "abyssalcobblestoneslab1");
		registerBlock(abycobbleslab2, new ItemAbyssalcobbleSlab(abycobbleslab2), "abyssalcobblestoneslab2");
		registerBlock(ACBlocks.abyssal_cobblestone_wall, "abyssalcobblestonewall");
		registerBlock(ACBlocks.dreadstone_cobblestone_stairs, "dreadstonecobblestonestairs");
		registerBlock(ACBlocks.dreadstone_cobblestone_slab, new ItemDreadcobbleSlab(ACBlocks.dreadstone_cobblestone_slab), "dreadstonecobblestoneslab1");
		registerBlock(dreadcobbleslab2, new ItemDreadcobbleSlab(dreadcobbleslab2), "dreadstonecobblestoneslab2");
		registerBlock(ACBlocks.dreadstone_cobblestone_wall, "dreadstonecobblestonewall");
		registerBlock(ACBlocks.abyssalnite_cobblestone_stairs, "abyssalnitecobblestonestairs");
		registerBlock(ACBlocks.abyssalnite_cobblestone_slab, new ItemAbyssalnitecobbleSlab(ACBlocks.abyssalnite_cobblestone_slab), "abyssalnitecobblestoneslab1");
		registerBlock(abydreadcobbleslab2, new ItemAbyssalnitecobbleSlab(abydreadcobbleslab2), "abyssalnitecobblestoneslab2");
		registerBlock(ACBlocks.abyssalnite_cobblestone_wall, "abyssalnitecobblestonewall");
		registerBlock(ACBlocks.coralium_cobblestone_stairs, "coraliumcobblestonestairs");
		registerBlock(ACBlocks.coralium_cobblestone_slab, new ItemCoraliumcobbleSlab(ACBlocks.coralium_cobblestone_slab), "coraliumcobblestoneslab1");
		registerBlock(cstonecobbleslab2, new ItemCoraliumcobbleSlab(cstonecobbleslab2), "coraliumcobblestoneslab2");
		registerBlock(ACBlocks.coralium_cobblestone_wall, "coraliumcobblestonewall");
		registerBlock(ACBlocks.luminous_thistle, "luminousthistle");
		registerBlock(ACBlocks.wastelands_thorn, "wastelandsthorn");
		registerBlock(ACBlocks.rending_pedestal, new ItemRendingPedestalBlock(ACBlocks.rending_pedestal), "rendingpedestal");
		registerBlock(ACBlocks.state_transformer, "statetransformer");
		registerBlock(ACBlocks.energy_depositioner, "energydepositioner");

		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_planks, 5, 20);
		Blocks.FIRE.setFireInfo(DLTslab2, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_slab, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_fence, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_stairs, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_wood, 5, 5);
		Blocks.FIRE.setFireInfo(ACBlocks.darklands_oak_leaves, 30, 60);

		Blocks.FIRE.setFireInfo(ACBlocks.dreadlands_planks, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.dreadlands_wood_fence, 5, 20);
		Blocks.FIRE.setFireInfo(ACBlocks.dreadlands_log, 5, 5);
		Blocks.FIRE.setFireInfo(ACBlocks.dreadlands_leaves, 30, 60);
	}

	@Override
	public void init(FMLInitializationEvent event) {}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		((BlockCLiquid) ACBlocks.liquid_coralium).addBlocks();
	}

	@Override
	public void loadComplete(FMLLoadCompleteEvent event) {}

	private static void registerItem(Item item, String name){
		InitHandler.INSTANCE.ITEMS.add(item.setRegistryName(new ResourceLocation(AbyssalCraft.modid, name)));
	}

	private static void registerBlock(Block block, String name){
		registerBlock(block, new ItemBlock(block), name);
	}

	private static void registerBlock(Block block, ItemBlock item, String name){
		InitHandler.INSTANCE.BLOCKS.add(block.setRegistryName(new ResourceLocation(AbyssalCraft.modid, name)));
		registerItem(item, name);
	}
}
