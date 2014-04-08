/**
 * This class was created by <Surseance> or his SC2 development team. 
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 * 
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 * 
 * File created @ [Mar 13, 2014, 7:01:00 PM]
 */
package steamcraft.common.lib;

import java.util.Random;
import java.util.logging.Level;

import steamcraft.common.lib.network.LoggerSteamcraft;
import net.minecraft.client.gui.GuiMainMenu;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.ReflectionHelper;

/**
 * @author Surseance (Johnny Eatmon)
 *
 */
public class SplashesHelper
{
	private static GuiMainMenu lastHacked = null;

	//@formatter:off
	public static String[] splashes = {
		// Features
		"Steam-Powered Wings!",
		"Ray Guns!",
		"Very, very steamy!",
		"Tesla Coils!",
		"Lightning Rods!",
		"Utility Armor!",
		"Gases!",
		"Brass Goggles!",
		"New Splashes!",
		"EventHandlerEntity!",
		"Configuration File!",
		"Guns!",
		"Coffee & Tea Time!",
		// Credits
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"SC2 by Surseance & Team!",
		"Modded by Steampunk Masters!",
		// The Mod
		"Steamcraft 2 v" + LibInfo.VERSION,
		"Steamcraft 2 v" + LibInfo.VERSION,
		"Steamcraft 2 v" + LibInfo.VERSION,
		// Satire 
		"ArrayIndexOutOfBoundsException",
		"WIP",
		"Warning: May Contain Null Pointers!",
		"Warp Core Breach!",
		// Random 
		"Beam me up, Scotty!",
		"Sodium Peroxide",
		"In 1492...",
		"299,792,458 m/s",
		"Watch your language!",
		"E = mc^2",
		"Don't press the button!",
		"Press the button!",
		"Ssssssssssssssss!",
		"#selfie",
		"Who's that POKE�MON?",
		// Advice
		"Kick out the funk!",
		"Read the README!",
		"Check for monsters under your bed!",
		// Also Try...
		"Also try Thaumcraft 4!",
		"Also try Ars Magica 2!",
		"Also try Pixelmon",
		"Also try taking a break once in a while!",
		// Pieces of Code
		"while(true) {}",
		"Integer.toString()"
	};
	
	private static Random random = new Random();
	
	public static void hackSplashes(GuiMainMenu menu)
	{
		if (menu == lastHacked) 
			return;
		
		lastHacked = menu;
		LoggerSteamcraft.log(Level.FINEST, "Hacking main menu splashes");
		Random random = new Random();
		
		if (Utils.checkForUpdatedVersion(LibInfo.NAME, LibInfo.VERSION) && random.nextInt(2) == 0) 
		{
			try {
				ReflectionHelper.setPrivateValue(GuiMainMenu.class, menu, 2, "Update SC2!");
			} catch (Throwable t) {}
		} 
		else if (random.nextInt(4) == 0) 
		{
			try {
				ReflectionHelper.setPrivateValue(GuiMainMenu.class, menu, 2, splashes[random.nextInt(splashes.length)]);
			} catch (Throwable t) {}
		}
	}
}
