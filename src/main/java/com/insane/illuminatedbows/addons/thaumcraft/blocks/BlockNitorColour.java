package com.insane.illuminatedbows.addons.thaumcraft.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.insane.illuminatedbows.addons.thaumcraft.tile.TileColouredNitor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNitorColour extends BlockContainer {

	public BlockNitorColour()
	{
		super(Material.cloth);
		this.setBlockName("nitorColour");
		this.setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.7F, 0.7F);
		this.setHardness(0F);
	}
	
	@Override
	 public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }

	@Override
	public boolean hasTileEntity()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {

		blockIcon = register.registerIcon("thaumcraft:blank");

	}

	@Override
	public int getRenderType() {return -1;}

	@Override
	public int getLightValue() {return 15;}

	public boolean renderAsNormalBlock() {return false;}

	public boolean isOpaqueCube() {return false;}


	@Override
	public TileEntity createTileEntity(World world, int meta) 
	{
		return new TileColouredNitor();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) 
	{
		return new TileColouredNitor();
	}


	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return 0;
	}

}
