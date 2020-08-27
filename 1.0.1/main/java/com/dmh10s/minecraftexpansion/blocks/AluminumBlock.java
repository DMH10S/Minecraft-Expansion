package com.dmh10s.minecraftexpansion.blocks;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AluminumBlock extends BlockBase
{
	public AluminumBlock(String name)
	{
		super(name, Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.5F);
		setResistance(7.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0);
		setCreativeTab(ModItems.BLOCKS_TAB);
	}
}