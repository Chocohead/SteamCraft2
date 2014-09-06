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
package steamcraft.common.items.modules;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import steamcraft.common.items.BaseItem;
import boilerplate.steamapi.item.IArmorModule;
import boilerplate.steamapi.item.ModuleRegistry;

/**
 * @author warlordjones
 *
 */
public class ItemWatchDisplay extends BaseItem implements IArmorModule
{
	public ItemWatchDisplay()
	{
		super();
		ModuleRegistry.registerModule(this);
		this.setMaxStackSize(1);
	}

	@Override
	public int getApplicablePiece()
	{
		return 0;
	}

	@Override
	public String getName()
	{
		return "Time Display";
	}

	@Override
	public String getModuleId()
	{
		return "clock";
	}

	@Override
	public void applyArmorEffect(World world, EntityPlayer player, ItemStack stack)
	{
		if(Minecraft.getMinecraft().thePlayer == null || Minecraft.getMinecraft().currentScreen != null)
			return;

		ItemStack helmet = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(3);

		if(Minecraft.getMinecraft().gameSettings.thirdPersonView == 0)
		{
			Tessellator tessellator = Tessellator.instance;
			ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth,
					Minecraft.getMinecraft().displayHeight);
			int width = scaledResolution.getScaledWidth();
			int height = scaledResolution.getScaledHeight();

			FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
			Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();
			int color = 0xCCFF00;

			final long mcTime = world.getTotalWorldTime();
			final Calendar cal = Calendar.getInstance();
			cal.getTime();
			final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

			fontRenderer.drawString("In-Game Time: " + mcTime, 5, 5, color);
			fontRenderer.drawString("Real-World Time: " + sdf.format(cal.getTime()), 5, 15, color);
		}
	}

	@Override
	public EnumArmorEffectType getArmorEffectType()
	{
		return EnumArmorEffectType.HUD;
	}

	@Override
	public ArrayList<IArmorModule> getListOfIncompatibleModules()
	{
		//ArrayList incompats = new ArrayList();
		//incompats.add(InitItems.itemPistonPlating);
		//return incompats;
		return null;
	}

}
