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
package steamcraft.common.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidTank;
import steamcraft.common.blocks.machines.BlockCopperTank;
import steamcraft.common.tiles.TileCopperTank;
import boilerplate.client.ClientHelper;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author decebaldecebal
 *
 */
public class CopperTankPacket implements IMessage
{
	private int fluidAmount;
	private int x, y, z;
	private String fluidName;

	public CopperTankPacket()
	{
	} // REQUIRED

	public CopperTankPacket(int x, int y, int z, int fluidScaled, String fluidName)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.fluidAmount = fluidScaled;
		this.fluidName = fluidName;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
		this.fluidAmount = buf.readInt();
		this.fluidName = ByteBufUtils.readUTF8String(buf);
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(this.x);
		buf.writeInt(this.y);
		buf.writeInt(this.z);
		buf.writeInt(this.fluidAmount);
		ByteBufUtils.writeUTF8String(buf, this.fluidName);
	}

	public static class CopperTankPacketHandler implements IMessageHandler<CopperTankPacket, IMessage>
	{
		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(CopperTankPacket message, MessageContext ctx)
		{
			World world = ClientHelper.world();

			if(world.getTileEntity(message.x, message.y, message.z) instanceof TileCopperTank)
			{
				TileCopperTank tank = (TileCopperTank) world.getTileEntity(message.x, message.y, message.z);

				tank.tank = new FluidTank(FluidRegistry.getFluid(message.fluidName), message.fluidAmount, TileCopperTank.capacity);
				tank.fluidScaled = (tank.tank.getFluidAmount() / (float) TileCopperTank.capacity) * BlockCopperTank.pixel;

				if(tank.fluidScaled > BlockCopperTank.pixel)
					tank.fluidScaled = BlockCopperTank.pixel;
			}
			
			return null;
		}

	}
}