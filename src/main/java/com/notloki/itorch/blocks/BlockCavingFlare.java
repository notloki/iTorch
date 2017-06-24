package com.notloki.itorch.blocks;

import com.notloki.itorch.handlers.CreativeTabsHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;

public class BlockCavingFlare extends BlockBase {

    protected static final AxisAlignedBB AABB_UP = new AxisAlignedBB(1,1,1,1,1,1);
    protected static final AxisAlignedBB AABB_DOWN = new AxisAlignedBB(1,1,1,1,1,1);
    protected static final AxisAlignedBB AABB_EAST = new AxisAlignedBB(1,1,1,1,1,1);
    protected static final AxisAlignedBB AABB_WEST = new AxisAlignedBB(1,1,1,1,1,1);
    protected static final AxisAlignedBB AABB_SOUTH = new AxisAlignedBB(1,1,1,1,1,1);
    protected static final AxisAlignedBB AABB_NORTH = new AxisAlignedBB(1,1,1,1,1,1);

    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public BlockCavingFlare(String name) {

        super(name, Material.CIRCUITS, CreativeTabsHandler.iTorchTab, 0.01F,0.01F, 1F);

    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

}