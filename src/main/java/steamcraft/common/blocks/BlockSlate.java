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
package steamcraft.common.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import steamcraft.common.Steamcraft;
import steamcraft.common.init.InitBlocks;
import steamcraft.common.lib.ModInfo;
import boilerplate.common.baseclasses.BaseMetadataBlock;

/**
 * @author warlordjones
 *
 */
public class BlockSlate extends BaseMetadataBlock
{
	private final IIcon[] icon = new IIcon[9];

	public BlockSlate()
	{
		super(Material.rock);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("blockSlate");
		this.setCreativeTab(Steamcraft.tabSC2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(final int side, final int metadata)
	{
		if(metadata < this.icon.length)
			return this.icon[metadata];
		else
			return this.icon[0];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(final IIconRegister ir)
	{
		// Raw
		this.icon[0] = ir.registerIcon(ModInfo.PREFIX + "blockSlateRawBlue");
		this.icon[1] = ir.registerIcon(ModInfo.PREFIX + "blockSlateRawBlack");
		this.icon[2] = ir.registerIcon(ModInfo.PREFIX + "blockSlateRawRed");
		// Cobble
		this.icon[3] = ir.registerIcon(ModInfo.PREFIX + "blockSlateCobbleBlue");
		this.icon[4] = ir.registerIcon(ModInfo.PREFIX + "blockSlateCobbleBlack");
		this.icon[5] = ir.registerIcon(ModInfo.PREFIX + "blockSlateCobbleRed");
		// Brick
		this.icon[6] = ir.registerIcon(ModInfo.PREFIX + "blockSlateBrickBlue");
		this.icon[7] = ir.registerIcon(ModInfo.PREFIX + "blockSlateBrickBlack");
		this.icon[8] = ir.registerIcon(ModInfo.PREFIX + "blockSlateBrickRed");
		// Polished
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs tab, final List l)
	{
		for(int var4 = 0; var4 < this.icon.length; ++var4)
			l.add(new ItemStack(InitBlocks.blockSlate, 1, var4));
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();

		switch(metadata)
		{
			case 0:
				drop.add(new ItemStack(InitBlocks.blockSlate, 1, 3));
				break;
			case 1:
				drop.add(new ItemStack(InitBlocks.blockSlate, 1, 4));
				break;
			case 2:
				drop.add(new ItemStack(InitBlocks.blockSlate, 1, 5));
				break;
			default:
				drop.add(0, new ItemStack(InitBlocks.blockSlate, 1, metadata));
				break;
		}

		return drop;
	}
}