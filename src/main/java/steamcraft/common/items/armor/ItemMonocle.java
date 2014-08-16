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
package steamcraft.common.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import steamcraft.common.lib.LibInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Surseance
 * 
 */
public class ItemMonocle extends BaseArmor
{
	public ItemMonocle(final ItemArmor.ArmorMaterial armorMat, final int armorType, final int renderIndex)
	{
		super(armorMat, armorType, renderIndex);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
	{
		return LibInfo.PREFIX + "textures/armor/monocle.png";
	}

	/*
	 * @Override
	 * 
	 * @SideOnly(Side.CLIENT) public ModelBiped getArmorModel(EntityLivingBase
	 * living, ItemStack is, int slot) { ModelBiped armorModel = new
	 * ModelBiped(); if (is != null) { if (is.getItem() instanceof ItemMonocle)
	 * { int type = ((ItemArmor)is.getItem()).armorType; if (type == 1 || type
	 * == 3) { armorModel = Steamcraft.proxy.getMonocleArmorModel(0); } else {
	 * armorModel = Steamcraft.proxy.getMonocleArmorModel(1); } } if (armorModel
	 * != null) { armorModel.bipedHead.showModel = slot == 0;
	 * armorModel.bipedHeadwear.showModel = slot == 0;
	 * armorModel.bipedBody.showModel = slot == 1 || slot == 2;
	 * armorModel.bipedRightArm.showModel = slot == 1;
	 * armorModel.bipedLeftArm.showModel = slot == 1;
	 * armorModel.bipedRightLeg.showModel = slot == 2 || slot == 3;
	 * armorModel.bipedLeftLeg.showModel = slot == 2 || slot == 3;
	 * armorModel.isSneak = living.isSneaking(); armorModel.isRiding =
	 * living.isRiding(); armorModel.isChild = living.isChild();
	 * armorModel.heldItemRight = living.getCurrentItemOrArmor(0) != null ? 1 :
	 * 0; if (living instanceof EntityPlayer) { armorModel.aimedBow =
	 * ((EntityPlayer)living).getItemInUseDuration() > 2; } return armorModel; }
	 * } return null; }
	 */
}
