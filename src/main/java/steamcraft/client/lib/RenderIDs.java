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
package steamcraft.client.lib;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderIDs
{

	public static int blockCastIronLampRI;
	public static int blockCrystalRI;
	public static int blockDropHammerRI;
	public static int blockHatchRI;
	public static int blockLightningRodRI;
	public static int blockCopperPipeRI;
	public static int blockCopperTankRI;
	public static int blockTeslaCoilRI;
	public static int blockBatteryRI;
	public static int blockChargerRI;
	public static int blockCastIronRailingRI;
	public static int blockCopperWireRI;
	public static int blockSteelWireRI;
	public static int blockPlankStackRI;
	public static int blockArmorEditorRI;
	public static int blockSpiderEggRI;
	public static int blockTrunkRI;
	public static int blockCastIronGateRI;

	public static void setIDs()
	{
		blockCopperPipeRI = RenderingRegistry.getNextAvailableRenderId();
		blockCopperTankRI = RenderingRegistry.getNextAvailableRenderId();
		blockCopperWireRI = RenderingRegistry.getNextAvailableRenderId();
		blockSteelWireRI = RenderingRegistry.getNextAvailableRenderId();
		blockLightningRodRI = RenderingRegistry.getNextAvailableRenderId();
		blockTeslaCoilRI = RenderingRegistry.getNextAvailableRenderId();
		blockBatteryRI = RenderingRegistry.getNextAvailableRenderId();
		blockChargerRI = RenderingRegistry.getNextAvailableRenderId();
		blockCastIronRailingRI = RenderingRegistry.getNextAvailableRenderId();
		blockCastIronLampRI = RenderingRegistry.getNextAvailableRenderId();
		blockHatchRI = RenderingRegistry.getNextAvailableRenderId();
		blockPlankStackRI = RenderingRegistry.getNextAvailableRenderId();
		blockCrystalRI = RenderingRegistry.getNextAvailableRenderId();
		blockArmorEditorRI = RenderingRegistry.getNextAvailableRenderId();
		blockSpiderEggRI = RenderingRegistry.getNextAvailableRenderId();
		blockTrunkRI = RenderingRegistry.getNextAvailableRenderId();
		blockCastIronGateRI = RenderingRegistry.getNextAvailableRenderId();
	}
}
