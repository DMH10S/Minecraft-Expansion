package com.dmh10s.minecraftexpansion.blocks.foundry;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityFoundry extends TileEntity implements ITickable
{
	public static final int SIZE = 4;
    
    private int burnTime;
    private int currentBurnTime;
    private int cookTime;
    private int totalCookTime=1540;
        
    
    private ItemStackHandler itemStackHandler = new ItemStackHandler(SIZE)
    {
        @Override
        protected void onContentsChanged(int slot) {
            
           TileEntityFoundry.this.markDirty();
        }
    };
    

    
    public static int getItemBurnTime(ItemStack fuel) 
    {
        if(fuel.isEmpty()) return 0;
        else 
        {
            Item item = fuel.getItem();
            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR) {}
            
            if(item == ModItems.COKE) return 1540;

            return GameRegistry.getFuelValue(fuel);
        }
    }
    

    
    
    
    
    public static boolean isItemFuel(ItemStack fuel)
    {
        return getItemBurnTime(fuel) > 0;
    }

    
    
    
    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
    {
        return true;
    }


    
    
    public boolean isBurning() 
    {
        return this.burnTime > 0;
    }
    
    
    @SideOnly(Side.CLIENT)
      public static boolean isBurning(TileEntityFoundry te) {

        return te.getField(0) > 0;
    }

    
    
    
    public void update() 
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;
        
        if(this.isBurning()) --this.burnTime;
        
        if(!this.world.isRemote) 
        {

                ItemStack fuel = this.itemStackHandler.getStackInSlot(2);
            
            
            if(this.isBurning() || !fuel.isEmpty() && !(this.itemStackHandler.getStackInSlot(0)).isEmpty() || (this.itemStackHandler.getStackInSlot(1)).isEmpty())
            {
                if(!this.isBurning() && this.canSmelt()) 
                {
                    this.burnTime = getItemBurnTime(fuel);
                    this.currentBurnTime = this.burnTime;
                    
                    if(this.isBurning()) 
                    {
                        flag1 = true;
                        
                        if(!fuel.isEmpty()) 
                        {
                            Item item = fuel.getItem();
                            fuel.shrink(1);
                            
                            if(fuel.isEmpty()) 
                            {
                                ItemStack item1 = item.getContainerItem(fuel);
                                this.itemStackHandler.setStackInSlot(2, item1);
                            }
                        }
                    }
                } 
                if(this.isBurning() && this.canSmelt()) 
                {
                    ++this.cookTime;
                    
//the 20 here is the total cook time i want. The cook lasts 20 ticks then the item is cooked
                    
                    if(this.cookTime == 1540) 
                    {
                        this.cookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                } 
                else this.cookTime = 0;
            } 
            else if(!this.isBurning() && this.cookTime > 0) 
                
//same here : 20 is for 20 ticks of cooking                
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, 1540);
            }
            if(flag != this.isBurning()) 
            {
                flag1 = true;
                BlockFoundry.setState(this.isBurning(), this.world, this.pos);
            }
        } 
        if(flag1) this.markDirty();
    }
    
    
    
    private boolean canSmelt() 
    {
            
            
        
        
        if((this.itemStackHandler.getStackInSlot(0)).isEmpty() || ((this.itemStackHandler.getStackInSlot(0)).isEmpty())) return false;
        else 
        {
                
            ItemStack result = FoundryRecipes.getInstance().getFoundryResult(this.itemStackHandler.getStackInSlot(0), this.itemStackHandler.getStackInSlot(1));    
            
            if(result.isEmpty()) return false;
            else
            {
                ItemStack output = this.itemStackHandler.getStackInSlot(3);
                
                if(output.isEmpty()) return true;
                if(!output.isItemEqual(result)) return false;
                int res = output.getCount() + result.getCount();
                return res <= getInventoryStackLimit() && res <= output.getMaxStackSize();
            }
        }
    }
    
    
    private int getInventoryStackLimit() {
        return 64;
    
    }

    
    
    public void smeltItem() 
    {
                
        if(this.canSmelt()) 
        {
            
            ItemStack input1 = this.itemStackHandler.getStackInSlot(0);
            ItemStack input2 = this.itemStackHandler.getStackInSlot(1);
            ItemStack output = this.itemStackHandler.getStackInSlot(3);
            ItemStack result = FoundryRecipes.getInstance().getFoundryResult(input1, input2);    
            
            
            if(output.isEmpty()) this.itemStackHandler.setStackInSlot(3, result.copy());
            else if(output.getItem() == result.getItem()) output.grow(result.getCount());
            
            input1.shrink(1);
            input2.shrink(1);
        }
    }
    
    
        

    
     public int getField(int id)
        {
            switch(id)
            {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
            	return this.totalCookTime;
            default:
                return 0;
            }
        }
            public void setField(int id, int value)
        {
            switch(id)
            {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            }
        }
    
    
    
    
    
    
    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        
         if (compound.hasKey("items")) {itemStackHandler.deserializeNBT((NBTTagCompound) compound.getTag("items"));}
        
        }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) 
    {
        super.writeToNBT(compound);
        
        compound.setInteger("BurnTime", this.burnTime);
        compound.setInteger("CookTime", this.cookTime);

        
        compound.setTag("items", itemStackHandler.serializeNBT());
         return compound;
    }
    
        
     @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing)
        {
            if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
            else return false;
        }
        
     @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing)
        {
            if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(itemStackHandler);
            return super.getCapability(capability, facing);
        }
    
        public boolean isUsablebyplayer(EntityPlayer playerIn) {
            return !isInvalid() && playerIn.getDistanceSq(pos.add(0.5D, 0.5D, 0.5D)) <= 64D;
        }
        
        public boolean isUsableByPlayer(EntityPlayer player) 
        {
        	return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
        }
    
}
