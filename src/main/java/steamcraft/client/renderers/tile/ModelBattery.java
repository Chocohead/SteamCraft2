// Date: 13/07/2014 09:04:07
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package steamcraft.client.renderers.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import steamcraft.common.tiles.TileBattery;

public class ModelBattery extends ModelBase
{
	//fields
    ModelRenderer base;
    ModelRenderer upright;
    ModelRenderer top;
    ModelRenderer jar;
    ModelRenderer lid;
    ModelRenderer wire;
    ModelRenderer jar2;
    ModelRenderer lid2;
    ModelRenderer wire2;
    ModelRenderer jar3;
    ModelRenderer lid3;
    ModelRenderer wire3;
    ModelRenderer jar4;
    ModelRenderer lid6;
    ModelRenderer wire6;
    ModelRenderer jar6;
    ModelRenderer lid4;
    ModelRenderer wire4;
    ModelRenderer jar5;
    ModelRenderer lid5;
    ModelRenderer wire5;

  public ModelBattery()
  {
    textureWidth = 64;
    textureHeight = 64;

      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 2, 1, 16);
      base.setRotationPoint(-2.5F, 16F, -12F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      upright = new ModelRenderer(this, 36, 0);
      upright.addBox(0F, 0F, 0F, 2, 5, 2);
      upright.setRotationPoint(-2.5F, 11F, -5F);
      upright.setTextureSize(64, 64);
      upright.mirror = true;
      setRotation(upright, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 17);
      top.addBox(0F, 0F, 0F, 2, 1, 16);
      top.setRotationPoint(-2.5F, 10F, -12F);
      top.setTextureSize(64, 64);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      jar = new ModelRenderer(this, 36, 7);
      jar.addBox(0F, 0F, 0F, 3, 4, 3);
      jar.setRotationPoint(-5.5F, 13F, -10F);
      jar.setTextureSize(64, 64);
      jar.mirror = true;
      setRotation(jar, 0F, 0F, 0F);
      lid = new ModelRenderer(this, 36, 15);
      lid.addBox(0F, 0F, 0F, 2, 1, 2);
      lid.setRotationPoint(-5F, 12F, -9.5F);
      lid.setTextureSize(64, 64);
      lid.mirror = true;
      setRotation(lid, 0F, 0F, 0F);
      wire = new ModelRenderer(this, 36, 19);
      wire.addBox(0F, 0F, 0F, 2, 1, 1);
      wire.setRotationPoint(-4.3F, 11F, -9F);
      wire.setTextureSize(64, 64);
      wire.mirror = true;
      setRotation(wire, 0F, 0F, 0F);
      jar2 = new ModelRenderer(this, 36, 7);
      jar2.addBox(0F, 0F, 0F, 3, 4, 3);
      jar2.setRotationPoint(-5.5F, 13F, -5.5F);
      jar2.setTextureSize(64, 64);
      jar2.mirror = true;
      setRotation(jar2, 0F, 0F, 0F);
      lid2 = new ModelRenderer(this, 36, 15);
      lid2.addBox(0F, 0F, 0F, 2, 1, 2);
      lid2.setRotationPoint(-5F, 12F, -5F);
      lid2.setTextureSize(64, 64);
      lid2.mirror = true;
      setRotation(lid2, 0F, 0F, 0F);
      wire2 = new ModelRenderer(this, 36, 19);
      wire2.addBox(0F, 0F, 0F, 2, 1, 1);
      wire2.setRotationPoint(-4.5F, 11F, -4.5F);
      wire2.setTextureSize(64, 64);
      wire2.mirror = true;
      setRotation(wire2, 0F, 0F, 0F);
      jar3 = new ModelRenderer(this, 36, 7);
      jar3.addBox(0F, 0F, 0F, 3, 4, 3);
      jar3.setRotationPoint(-5.5F, 13F, -1F);
      jar3.setTextureSize(64, 64);
      jar3.mirror = true;
      setRotation(jar3, 0F, 0F, 0F);
      lid3 = new ModelRenderer(this, 36, 15);
      lid3.addBox(0F, 0F, 0F, 2, 1, 2);
      lid3.setRotationPoint(-5F, 12F, -0.5F);
      lid3.setTextureSize(64, 64);
      lid3.mirror = true;
      setRotation(lid3, 0F, 0F, 0F);
      wire3 = new ModelRenderer(this, 36, 19);
      wire3.addBox(0F, 0F, 0F, 2, 1, 1);
      wire3.setRotationPoint(-4F, 11F, 0F);
      wire3.setTextureSize(64, 64);
      wire3.mirror = true;
      setRotation(wire3, 0F, 0F, 0F);
      jar4 = new ModelRenderer(this, 36, 7);
      jar4.addBox(0F, 0F, 0F, 3, 4, 3);
      jar4.setRotationPoint(-0.5F, 13F, -10F);
      jar4.setTextureSize(64, 64);
      jar4.mirror = true;
      setRotation(jar4, 0F, 0F, 0F);
      lid6 = new ModelRenderer(this, 36, 15);
      lid6.addBox(0F, 0F, 0F, 2, 1, 2);
      lid6.setRotationPoint(0F, 12F, -0.5F);
      lid6.setTextureSize(64, 64);
      lid6.mirror = true;
      setRotation(lid6, 0F, 0F, 0F);
      wire6 = new ModelRenderer(this, 36, 19);
      wire6.addBox(0F, 0F, 0F, 2, 1, 1);
      wire6.setRotationPoint(-0.5F, 11F, 0F);
      wire6.setTextureSize(64, 64);
      wire6.mirror = true;
      setRotation(wire6, 0F, 0F, 0F);
      jar6 = new ModelRenderer(this, 36, 7);
      jar6.addBox(0F, 0F, 0F, 3, 4, 3);
      jar6.setRotationPoint(-0.5F, 13F, -1F);
      jar6.setTextureSize(64, 64);
      jar6.mirror = true;
      setRotation(jar6, 0F, 0F, 0F);
      lid4 = new ModelRenderer(this, 36, 15);
      lid4.addBox(0F, 0F, 0F, 2, 1, 2);
      lid4.setRotationPoint(0F, 12F, -9.5F);
      lid4.setTextureSize(64, 64);
      lid4.mirror = true;
      setRotation(lid4, 0F, 0F, 0F);
      wire4 = new ModelRenderer(this, 36, 19);
      wire4.addBox(0F, 0F, 0F, 2, 1, 1);
      wire4.setRotationPoint(-0.5F, 11F, -9F);
      wire4.setTextureSize(64, 64);
      wire4.mirror = true;
      setRotation(wire4, 0F, 0F, 0F);
      jar5 = new ModelRenderer(this, 36, 7);
      jar5.addBox(0F, 0F, 0F, 3, 4, 3);
      jar5.setRotationPoint(-0.5F, 13F, -5.5F);
      jar5.setTextureSize(64, 64);
      jar5.mirror = true;
      setRotation(jar5, 0F, 0F, 0F);
      lid5 = new ModelRenderer(this, 36, 15);
      lid5.addBox(0F, 0F, 0F, 2, 1, 2);
      lid5.setRotationPoint(0F, 12F, -5F);
      lid5.setTextureSize(64, 64);
      lid5.mirror = true;
      setRotation(lid5, 0F, 0F, 0F);
      wire5 = new ModelRenderer(this, 36, 19);
      wire5.addBox(0F, 0F, 0F, 2, 1, 1);
      wire5.setRotationPoint(-0.5F, 11F, -4.5F);
      wire5.setTextureSize(64, 64);
      wire5.mirror = true;
      setRotation(wire5, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, TileEntity tile)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    base.render(f5);
    upright.render(f5);
    top.render(f5);
    if(tile != null)
    {
        TileBattery te = (TileBattery)tile;
        ModelRenderer[] jars = { this.jar, this.jar2, this.jar3, this.jar4, jar5, jar6 };
        ModelRenderer[] lids = { this.lid, this.lid2, this.lid3, this.lid4, lid5, lid6 };
        ModelRenderer[] wires = { this.wire, this.wire2, this.wire3, this.wire4, wire5, wire6 };
          for (int i = 0; i < jars.length; i++)
          {
        	  if(te.inventory[i] != null)
        	  {
        		  jars[i].render(f5);
        		  lids[i].render(f5);
        		  wires[i].render(f5);
        	  }
          }
    }
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}