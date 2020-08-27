package com.dmh10s.minecraftexpansion.blocks.foundry;

import java.util.Map;
import java.util.Map.Entry;

import com.dmh10s.minecraftexpansion.init.ModItems;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FoundryRecipes
{
	 private static final FoundryRecipes INSTANCE = new FoundryRecipes();
	    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	    
	    public static FoundryRecipes getInstance()
	    {
	        return INSTANCE;
	    }
	    
	    public void addFoundryRecipes(ItemStack input1, ItemStack input2, ItemStack result) 
	    {
	        if(getFoundryResult(input1, input2) != ItemStack.EMPTY) return;
	        this.smeltingList.put(input1, input2, result);

	    }
	    
	    public ItemStack getFoundryResult(ItemStack input1, ItemStack input2) 
	    {
	        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
	        {
	            if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
	            {
	                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
	                {
	                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
	                    {
	                        return (ItemStack)ent.getValue();
	                    }
	                }
	            }
	        }
	        return ItemStack.EMPTY;
	    }
	    
	    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	    {
	        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	    }
	    
	    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	    {
	        return this.smeltingList;
	    }
	
	private FoundryRecipes()
	{
		addFoundryRecipes(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COAL), new ItemStack(ModItems.STEEL));
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(Items.IRON_INGOT), new ItemStack(ModItems.STEEL));
		addFoundryRecipes(new ItemStack(ModItems.STEEL), new ItemStack(Items.COAL), new ItemStack(ModItems.CARBON_STEEL));
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(ModItems.STEEL), new ItemStack(ModItems.CARBON_STEEL));
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(Items.COAL), new ItemStack(ModItems.MOLTEN_CARBON, 4));
		addFoundryRecipes(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT), new ItemStack(ModItems.MOLTEN_IRON, 4));
	}
}
