package com.dmh10s.minecraftexpansion.blocks;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AluminumOre extends BlockBase
{
	public AluminumOre(String name)
	{
		super(name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0);
		setCreativeTab(ModItems.BLOCKS_TAB);
	}
}
