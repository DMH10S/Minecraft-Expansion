package com.dmh10s.minecraftexpansion.init;

import java.util.ArrayList;
import java.util.List;

import com.dmh10s.minecraftexpansion.items.ItemBase;
import com.dmh10s.minecraftexpansion.items.armor.ArmorBase;
import com.dmh10s.minecraftexpansion.items.armor.ArmorNightVision;
import com.dmh10s.minecraftexpansion.items.crops.ItemCabbageSeed;
import com.dmh10s.minecraftexpansion.items.food.FoodBase;
import com.dmh10s.minecraftexpansion.items.tools.ToolAxe;
import com.dmh10s.minecraftexpansion.items.tools.ToolFireAxe;
import com.dmh10s.minecraftexpansion.items.tools.ToolFireSword;
import com.dmh10s.minecraftexpansion.items.tools.ToolHoe;
import com.dmh10s.minecraftexpansion.items.tools.ToolPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.ToolSpade;
import com.dmh10s.minecraftexpansion.items.tools.ToolSpeedSword;
import com.dmh10s.minecraftexpansion.items.tools.ToolSword;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Creative Tabs
	public static final CreativeTabs ITEMS_TAB = (new CreativeTabs("tabItems") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.STEEL);
		}
	});
	
	public static final CreativeTabs BLOCKS_TAB = (new CreativeTabs("tabBlocks") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.FOUNDRY);
		}
	});
	
	public static final CreativeTabs TOOLS_TAB = (new CreativeTabs("tabTools") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.STEEL_AXE);
		}
	});
	
	public static final CreativeTabs COMBAT_TAB = (new CreativeTabs("tabCombat") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.FIRE_SWORD);
		}
	});
	
	public static final CreativeTabs FOOD_TAB = (new CreativeTabs("tabFood") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.COOKED_TURKEY_DRUMSTICK);
		}
	});
	
	//Materials
	public static final ToolMaterial MATERIAL_BLAZE_POWDER = EnumHelper.addToolMaterial("material_blaze_powder",  3, 1000, 9.0F, 3.0F, 20);
	public static final ToolMaterial MATERIAL_CARBON_FIBER = EnumHelper.addToolMaterial("material_carbon_fiber", 3, 1750, 8.5F, 3.5F, 10);
	public static final ToolMaterial MATERIAL_CARBON_STEEL = EnumHelper.addToolMaterial("material_carbon_steel", 3, 1250, 6.0F, 2.75F, 8);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 750, 5.5F, 2.5F, 8);
	
	public static final ArmorMaterial ARMOR_MATERIAL_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_carbon_fiber", Reference.MOD_ID + ":carbon_fiber", 16, new int[] {3, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_carbon_steel", Reference.MOD_ID + ":carbon_steel", 14, new int[] {3, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_KEVLAR = EnumHelper.addArmorMaterial("armor_material_kevlar", Reference.MOD_ID + ":kevlar", 17, new int[] {0, 0, 10, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_LEAD = EnumHelper.addArmorMaterial("armor_material_lead", Reference.MOD_ID + ":lead", 13, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_NIGHT_VISION = EnumHelper.addArmorMaterial("armor_material_night_vision", Reference.MOD_ID + ":night_vision", 13, new int[] {0, 0, 0, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 13, new int[] {3, 5, 6, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_enhanced_carbon_fiber", Reference.MOD_ID + ":enhanced_carbon_fiber", 16, new int[] {4, 8, 11, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_enhanced_carbon_steel", Reference.MOD_ID + ":enhanced_carbon_steel", 14, new int[] {4, 8, 9, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CHAIN = EnumHelper.addArmorMaterial("armor_material_enhanced_chain", Reference.MOD_ID + ":enhanced_chain", 13, new int[] {3, 6, 7, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_DIAMOND = EnumHelper.addArmorMaterial("armor_material_enhanced_diamond", Reference.MOD_ID + ":enhanced_diamond", 15, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_GOLDEN = EnumHelper.addArmorMaterial("armor_material_enhanced_golden", Reference.MOD_ID + ":enhanced_golden", 12, new int[] {3, 5, 7, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_IRON = EnumHelper.addArmorMaterial("armor_material_enhanced_iron", Reference.MOD_ID + ":enhanced_iron", 13, new int[] {3, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_KEVLAR = EnumHelper.addArmorMaterial("armor_material_enhanced_kevlar", Reference.MOD_ID + ":enhanced_kevlar", 17, new int[] {0, 0, 12, 5}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_LEAD = EnumHelper.addArmorMaterial("armor_material_enhanced_lead", Reference.MOD_ID + ":enhanced_lead", 13, new int[] {3, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_STEEL = EnumHelper.addArmorMaterial("armor_material_enhanced_steel", Reference.MOD_ID + ":enhanced_steel", 13, new int[] {4, 7, 8, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_reinforced_carbon_fiber", Reference.MOD_ID + ":reinforced_carbon_fiber", 18, new int[] {3, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_reinforced_carbon_steel", Reference.MOD_ID + ":reinforced_carbon_steel", 16, new int[] {3, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CHAIN = EnumHelper.addArmorMaterial("armor_material_reinforced_chain", Reference.MOD_ID + ":reinforced_chain", 15, new int[] {2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_DIAMOND = EnumHelper.addArmorMaterial("armor_material_reinforced_diamond", Reference.MOD_ID + ":reinforced_diamond", 17, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_GOLDEN = EnumHelper.addArmorMaterial("armor_material_reinforced_golden", Reference.MOD_ID + ":reinforced_golden", 14, new int[] {2, 3, 5, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_IRON = EnumHelper.addArmorMaterial("armor_material_reinforced_iron", Reference.MOD_ID + ":reinforced_iron", 15, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_KEVLAR = EnumHelper.addArmorMaterial("armor_material_reinforced_kevlar", Reference.MOD_ID + ":reinforced_kevlar", 19, new int[] {0, 0, 10, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_LEAD = EnumHelper.addArmorMaterial("armor_material_reinforced_lead", Reference.MOD_ID + ":reinforced_lead", 15, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_STEEL = EnumHelper.addArmorMaterial("armor_material_reinforced_steel", Reference.MOD_ID + ":reinforced_steel", 15, new int[] {3, 5, 6, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item BELLOW = new ItemBase("bellow");
	public static final Item CARBON_FIBER = new ItemBase("carbon_fiber");
	public static final Item CARBON_FIBER_SHEET = new ItemBase("carbon_fiber_sheet");
	public static final Item CHAIN = new ItemBase("chain");
	public static final Item COKE = new ItemBase("coke");
	public static final Item CARBON_STEEL = new ItemBase("carbon_steel");
	public static final Item KEVLAR_FIBER = new ItemBase("kevlar_fiber");
	public static final Item KEVLAR_SHEET = new ItemBase("kevlar_sheet");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item MOLTEN_CARBON = new ItemBase("molten_carbon");
	public static final Item MOLTEN_IRON = new ItemBase("molten_iron");
	public static final Item STEEL = new ItemBase("steel");
	
	//Tools
	public static final ItemAxe CARBON_FIBER_AXE = new ToolAxe("carbon_fiber_axe", MATERIAL_CARBON_FIBER, 5.75F, -2.8F);
	public static final ItemHoe CARBON_FIBER_HOE = new ToolHoe("carbon_fiber_hoe", MATERIAL_CARBON_FIBER);
	public static final ItemPickaxe CARBON_FIBER_PICKAXE = new ToolPickaxe("carbon_fiber_pickaxe", MATERIAL_CARBON_FIBER);
	public static final ItemSpade CARBON_FIBER_SHOVEL = new ToolSpade("carbon_fiber_shovel", MATERIAL_CARBON_FIBER);
	public static final ItemSword CARBON_FIBER_SWORD = new ToolSpeedSword("carbon_fiber_sword", MATERIAL_CARBON_FIBER);
	public static final ItemAxe CARBON_STEEL_AXE = new ToolAxe("carbon_steel_axe", MATERIAL_CARBON_STEEL, 5.75F, -3.2F);
	public static final ItemHoe CARBON_STEEL_HOE = new ToolHoe("carbon_steel_hoe", MATERIAL_CARBON_STEEL);
	public static final ItemPickaxe CARBON_STEEL_PICKAXE = new ToolPickaxe("carbon_steel_pickaxe", MATERIAL_CARBON_STEEL);
	public static final ItemSpade CARBON_STEEL_SHOVEL = new ToolSpade("carbon_steel_shovel", MATERIAL_CARBON_STEEL);
	public static final ItemSword CARBON_STEEL_SWORD = new ToolSword("carbon_steel_sword", MATERIAL_CARBON_STEEL);
	public static final ItemAxe FIRE_AXE = new ToolFireAxe("fire_axe", MATERIAL_BLAZE_POWDER, 6.0F, -3.0F);
	public static final ItemHoe FIRE_HOE = new ToolHoe("fire_hoe", MATERIAL_BLAZE_POWDER);
	public static final ItemPickaxe FIRE_PICKAXE = new ToolPickaxe("fire_pickaxe", MATERIAL_BLAZE_POWDER);
	public static final ItemSpade FIRE_SHOVEL = new ToolSpade("fire_shovel", MATERIAL_BLAZE_POWDER);
	public static final ItemSword FIRE_SWORD = new ToolFireSword("fire_sword", MATERIAL_BLAZE_POWDER);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL, 5.75F, -3.2F);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	
	//Armor
	public static final Item CARBON_FIBER_HELMET = new ArmorBase("carbon_fiber_helmet", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CARBON_FIBER_CHESTPLATE = new ArmorBase("carbon_fiber_chestplate", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item CARBON_FIBER_LEGGINGS = new ArmorBase("carbon_fiber_leggings", ARMOR_MATERIAL_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item CARBON_FIBER_BOOTS = new ArmorBase("carbon_fiber_boots", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item CARBON_STEEL_HELMET = new ArmorBase("carbon_steel_helmet", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CARBON_STEEL_CHESTPLATE = new ArmorBase("carbon_steel_chestplate", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item CARBON_STEEL_LEGGINGS = new ArmorBase("carbon_steel_leggings", ARMOR_MATERIAL_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CARBON_STEEL_BOOTS = new ArmorBase("carbon_steel_boots", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item KEVLAR_HELMET = new ArmorBase("kevlar_helmet", ARMOR_MATERIAL_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item KEVLAR_VEST = new ArmorBase("kevlar_vest", ARMOR_MATERIAL_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_HELMET = new ArmorBase("lead_helmet", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAD_CHESTPLATE = new ArmorBase("lead_chestplate", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_LEGGINGS = new ArmorBase("lead_leggings", ARMOR_MATERIAL_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAD_BOOTS = new ArmorBase("lead_boots", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item NIGHT_VISION_VISOR = new ArmorNightVision("night_vision_visor", ARMOR_MATERIAL_NIGHT_VISION, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ENHANCED_CARBON_FIBER_HELMET = new ArmorBase("enhanced_carbon_fiber_helmet", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CARBON_FIBER_CHESTPLATE = new ArmorBase("enhanced_carbon_fiber_chestplate", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CARBON_FIBER_LEGGINGS = new ArmorBase("enhanced_carbon_fiber_leggings", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CARBON_FIBER_BOOTS = new ArmorBase("enhanced_carbon_fiber_boots", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_CARBON_STEEL_HELMET = new ArmorBase("enhanced_carbon_steel_helmet", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CARBON_STEEL_CHESTPLATE = new ArmorBase("enhanced_carbon_steel_chestplate", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CARBON_STEEL_LEGGINGS = new ArmorBase("enhanced_carbon_steel_leggings", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CARBON_STEEL_BOOTS = new ArmorBase("enhanced_carbon_steel_boots", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_CHAIN_HELMET = new ArmorBase("enhanced_chain_helmet", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CHAIN_CHESTPLATE = new ArmorBase("enhanced_chain_chestplate", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CHAIN_LEGGINGS = new ArmorBase("enhanced_chain_leggings", ARMOR_MATERIAL_ENHANCED_CHAIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CHAIN_BOOTS = new ArmorBase("enhanced_chain_boots", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_DIAMOND_HELMET = new ArmorBase("enhanced_diamond_helmet", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_DIAMOND_CHESTPLATE = new ArmorBase("enhanced_diamond_chestplate", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_DIAMOND_LEGGINGS = new ArmorBase("enhanced_diamond_leggings", ARMOR_MATERIAL_ENHANCED_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_DIAMOND_BOOTS = new ArmorBase("enhanced_diamond_boots", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_GOLDEN_HELMET = new ArmorBase("enhanced_golden_helmet", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_GOLDEN_CHESTPLATE = new ArmorBase("enhanced_golden_chestplate", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_GOLDEN_LEGGINGS = new ArmorBase("enhanced_golden_leggings", ARMOR_MATERIAL_ENHANCED_GOLDEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_GOLDEN_BOOTS = new ArmorBase("enhanced_golden_boots", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_IRON_HELMET = new ArmorBase("enhanced_iron_helmet", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_IRON_CHESTPLATE = new ArmorBase("enhanced_iron_chestplate", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_IRON_LEGGINGS = new ArmorBase("enhanced_iron_leggings", ARMOR_MATERIAL_ENHANCED_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_IRON_BOOTS = new ArmorBase("enhanced_iron_boots", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_KEVLAR_HELMET = new ArmorBase("enhanced_kevlar_helmet", ARMOR_MATERIAL_ENHANCED_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_KEVLAR_VEST = new ArmorBase("enhanced_kevlar_vest", ARMOR_MATERIAL_ENHANCED_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_LEAD_HELMET = new ArmorBase("enhanced_lead_helmet", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_LEAD_CHESTPLATE = new ArmorBase("enhanced_lead_chestplate", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_LEAD_LEGGINGS = new ArmorBase("enhanced_lead_leggings", ARMOR_MATERIAL_ENHANCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_LEAD_BOOTS = new ArmorBase("enhanced_lead_boots", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_STEEL_HELMET = new ArmorBase("enhanced_steel_helmet", ARMOR_MATERIAL_ENHANCED_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_STEEL_CHESTPLATE = new ArmorBase("enhanced_steel_chestplate", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_STEEL_LEGGINGS = new ArmorBase("enhanced_steel_leggings", ARMOR_MATERIAL_ENHANCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_STEEL_BOOTS = new ArmorBase("enhanced_steel_boots", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item REINFORCED_CARBON_FIBER_HELMET = new ArmorBase("reinforced_carbon_fiber_helmet", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CARBON_FIBER_CHESTPLATE = new ArmorBase("reinforced_carbon_fiber_chestplate", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CARBON_FIBER_LEGGINGS = new ArmorBase("reinforced_carbon_fiber_leggings", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CARBON_FIBER_BOOTS = new ArmorBase("reinforced_carbon_fiber_boots", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_CARBON_STEEL_HELMET = new ArmorBase("reinforced_carbon_steel_helmet", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CARBON_STEEL_CHESTPLATE = new ArmorBase("reinforced_carbon_steel_chestplate", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CARBON_STEEL_LEGGINGS = new ArmorBase("reinforced_carbon_steel_leggings", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CARBON_STEEL_BOOTS = new ArmorBase("reinforced_carbon_steel_boots", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_CHAIN_HELMET = new ArmorBase("reinforced_chain_helmet", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CHAIN_CHESTPLATE = new ArmorBase("reinforced_chain_chestplate", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CHAIN_LEGGINGS = new ArmorBase("reinforced_chain_leggings", ARMOR_MATERIAL_REINFORCED_CHAIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CHAIN_BOOTS = new ArmorBase("reinforced_chain_boots", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_DIAMOND_HELMET = new ArmorBase("reinforced_diamond_helmet", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_DIAMOND_CHESTPLATE = new ArmorBase("reinforced_diamond_chestplate", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_DIAMOND_LEGGINGS = new ArmorBase("reinforced_diamond_leggings", ARMOR_MATERIAL_REINFORCED_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_DIAMOND_BOOTS = new ArmorBase("reinforced_diamond_boots", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_GOLDEN_HELMET = new ArmorBase("reinforced_golden_helmet", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_GOLDEN_CHESTPLATE = new ArmorBase("reinforced_golden_chestplate", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_GOLDEN_LEGGINGS = new ArmorBase("reinforced_golden_leggings", ARMOR_MATERIAL_REINFORCED_GOLDEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_GOLDEN_BOOTS = new ArmorBase("reinforced_golden_boots", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_IRON_HELMET = new ArmorBase("reinforced_iron_helmet", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_IRON_CHESTPLATE = new ArmorBase("reinforced_iron_chestplate", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_IRON_LEGGINGS = new ArmorBase("reinforced_iron_leggings", ARMOR_MATERIAL_REINFORCED_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_IRON_BOOTS = new ArmorBase("reinforced_iron_boots", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_KEVLAR_HELMET = new ArmorBase("reinforced_kevlar_helmet", ARMOR_MATERIAL_REINFORCED_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_KEVLAR_VEST = new ArmorBase("reinforced_kevlar_vest", ARMOR_MATERIAL_REINFORCED_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_LEAD_HELMET = new ArmorBase("reinforced_lead_helmet", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_LEAD_CHESTPLATE = new ArmorBase("reinforced_lead_chestplate", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_LEAD_LEGGINGS = new ArmorBase("reinforced_lead_leggings", ARMOR_MATERIAL_REINFORCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_LEAD_BOOTS = new ArmorBase("reinforced_lead_boots", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_STEEL_HELMET = new ArmorBase("reinforced_steel_helmet", ARMOR_MATERIAL_REINFORCED_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_STEEL_CHESTPLATE = new ArmorBase("reinforced_steel_chestplate", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_STEEL_LEGGINGS = new ArmorBase("reinforced_steel_leggings", ARMOR_MATERIAL_REINFORCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_STEEL_BOOTS = new ArmorBase("reinforced_steel_boots", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item CABBAGE = new FoodBase("cabbage", 4, 1.5F, false);
	public static final Item COOKED_BOAR_MEAT = new FoodBase("cooked_boar_meat", 8, 10.0F, true);
	public static final Item COOKED_TURKEY_BREAST = new FoodBase("cooked_turkey_breast", 7, 8.0F, true);
	public static final Item COOKED_TURKEY_DRUMSTICK = new FoodBase("cooked_turkey_drumstick", 4, 5.0F, true);
	//public static final Item GREENS = new FoodBase("greens", 3, 1.0F, false);
	public static final Item RAW_BOAR_MEAT = new FoodBase("raw_boar_meat", 3, 0.5F, true);
	public static final Item RAW_TURKEY_BREAST = new FoodBase("raw_turkey_breast", 3, 0.5F, true);
	public static final Item RAW_TURKEY_DRUMSTICK = new FoodBase("raw_turkey_drumstick", 1, 0.25F, true);
	
	//Crops
	public static final Item CABBAGE_SEED = new ItemCabbageSeed("cabbage_seed");
}
