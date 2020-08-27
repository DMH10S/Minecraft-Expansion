package com.dmh10s.minecraftexpansion.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init()
	{
		GameRegistry.addSmelting(Items.COAL, new ItemStack(ModItems.COKE, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.RAW_BOAR_MEAT, new ItemStack(ModItems.COOKED_BOAR_MEAT, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.RAW_TURKEY_BREAST, new ItemStack(ModItems.COOKED_TURKEY_BREAST, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.RAW_TURKEY_DRUMSTICK, new ItemStack(ModItems.COOKED_TURKEY_DRUMSTICK, 1), 1.0f);
	}
}
