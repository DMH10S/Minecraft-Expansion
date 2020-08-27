package com.dmh10s.minecraftexpansion.util.handler;

import java.util.Random;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class ButcherTradeHandler implements ITradeList
{

	@Override
	public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
	{
		recipeList.add(new MerchantRecipe(new ItemStack(Items.BEEF, random.nextInt(4) + 12), new ItemStack(Items.EMERALD)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.RABBIT, random.nextInt(8) + 24), new ItemStack(Items.EMERALD)));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.MUTTON, random.nextInt(8) + 24), new ItemStack(Items.EMERALD)));
	}
}
