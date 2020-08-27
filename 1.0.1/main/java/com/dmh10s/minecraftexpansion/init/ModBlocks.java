package com.dmh10s.minecraftexpansion.init;

import java.util.ArrayList;
import java.util.List;

import com.dmh10s.minecraftexpansion.blocks.AluminumBlock;
import com.dmh10s.minecraftexpansion.blocks.AluminumOre;
import com.dmh10s.minecraftexpansion.blocks.LeadOre;
import com.dmh10s.minecraftexpansion.blocks.coke_furnace.BlockCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.crops.BlockCabbageCrop;
import com.dmh10s.minecraftexpansion.blocks.foundry.BlockFoundry;

import net.minecraft.block.Block;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	
	//Ores
	public static final Block LEAD_ORE = new LeadOre("lead_ore");
	
	//Crops
	public static final Block CABBAGE_CROP = new BlockCabbageCrop("cabbage_crop");
	
	//Furnaces
	public static final Block COKE_FURNACE = new BlockCokeFurnace("coke_furnace");
	public static final Block FOUNDRY = new BlockFoundry("foundry");
}
