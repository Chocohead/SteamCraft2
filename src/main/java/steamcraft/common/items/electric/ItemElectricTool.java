/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package steamcraft.common.items.electric;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import steamcraft.common.items.tools.ItemModTool;
import boilerplate.api.IEnergyItem;

public class ItemElectricTool extends ItemModTool implements IEnergyItem
{
	protected int maxEnergy = 0;
	protected short maxReceive = 0;
	protected int energyPerBlock = 0;

	protected ItemElectricTool(float damage, ToolMaterial toolMat, int maxEnergy, int maxReceive)
	{
		super(damage, toolMat);
		this.maxEnergy = maxEnergy * 1000;
		this.maxReceive = (short) maxReceive;
		this.setMaxStackSize(1);
		this.setNoRepair();
	}

	@SuppressWarnings("all")
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list)
	{
		list.add(this.getUnchargedItem(item));
		list.add(this.getChargedItem(item));
	}

	public ItemStack getUnchargedItem(Item item)
	{
		ItemStack uncharged = new ItemStack(item);

		if(!uncharged.hasTagCompound())
		{
			uncharged.setTagCompound(new NBTTagCompound());
		}
		uncharged.getTagCompound().setInteger("energy", 0);

		return uncharged.copy();
	}

	public ItemStack getChargedItem(Item item)
	{
		ItemStack charged = new ItemStack(item);

		if(!charged.hasTagCompound())
		{
			charged.setTagCompound(new NBTTagCompound());
		}
		charged.getTagCompound().setInteger("energy", this.maxEnergy);

		return charged.copy();
	}

	@SuppressWarnings("all")
	@Override
	public void addInformation(ItemStack stack, EntityPlayer entityplayer, List list, boolean flag)
	{
		list.add("Energy: " + (this.getEnergyStored(stack) / 1000) + "k / " + (this.maxEnergy / 1000) + "k");
		list.add("Transfer(in): " + this.maxReceive);
	}

	@Override
	public void onCreated(ItemStack stack, World par2World, EntityPlayer par3EntityPlayer)
	{
		this.setEnergy(stack, 0);
	}

	public void setEnergy(ItemStack stack, int energy)
	{
		if(!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		NBTTagCompound tag = stack.getTagCompound();

		if(energy < 0)
			energy = 0;

		if(energy > this.maxEnergy)
			energy = this.maxEnergy;

		tag.setInteger("energy", energy);

		stack.setTagCompound(tag);
	}

	@Override
	public int receiveEnergy(ItemStack itemStack, int maxReceive, boolean simulate)
	{
		int received = Math.min(this.maxEnergy - this.getEnergyStored(itemStack), maxReceive);
		received = Math.min(received, this.maxReceive);

		if(!simulate)
			this.setEnergy(itemStack, this.getEnergyStored(itemStack) + received);

		return received;
	}

	@Override
	public int extractEnergy(ItemStack itemStack, int maxExtract, boolean simulate)
	{
		return 0;
	}

	@Override
	public int getEnergyStored(ItemStack stack)
	{
		return getOrCreateTagCompound(stack).getInteger("energy");
	}

	public static NBTTagCompound getOrCreateTagCompound(ItemStack is)
	{
		if(!is.hasTagCompound())
		{
			is.setTagCompound(new NBTTagCompound());
			is.getTagCompound().setInteger("energy", 0);
		}

		return is.getTagCompound();
	}

	@Override
	public int getMaxEnergyStored(ItemStack container)
	{
		return this.maxEnergy;
	}

	@Override
	public short getMaxSend()
	{
		return 0;
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack)
	{
		return 1.0D - ((double) this.getEnergyStored(stack) / this.getMaxEnergyStored(stack));
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack)
	{
		return true;
	}

	@Override
	public int getItemEnchantability()
	{
		return 0;
	}

	@Override
	public boolean isBookEnchantable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return false;
	}
}
