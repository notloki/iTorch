package com.notloki.itorch.blocks;

import com.google.common.base.Predicate;
import com.notloki.itorch.entities.particles.ParticleCustomFlame;
import com.notloki.itorch.entities.particles.ParticleCustomSmoke;
import com.notloki.itorch.handlers.CreativeTabsHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import javax.annotation.Nullable;
import java.util.Random;


public class BlockITorch extends BlockBase {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {
        public boolean apply(@Nullable EnumFacing p_apply_1_) {
            return p_apply_1_ != EnumFacing.DOWN;
        }
    });

    private String color;

    protected static final AxisAlignedBB STANDING_AABB = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
    protected static final AxisAlignedBB TORCH_NORTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.699999988079071D, 0.6499999761581421D, 0.800000011920929D, 1.0D);
    protected static final AxisAlignedBB TORCH_SOUTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.0D, 0.6499999761581421D, 0.800000011920929D, 0.30000001192092896D);
    protected static final AxisAlignedBB TORCH_WEST_AABB = new AxisAlignedBB(0.699999988079071D, 0.20000000298023224D, 0.3499999940395355D, 1.0D, 0.800000011920929D, 0.6499999761581421D);
    protected static final AxisAlignedBB TORCH_EAST_AABB = new AxisAlignedBB(0.0D, 0.20000000298023224D, 0.3499999940395355D, 0.30000001192092896D, 0.800000011920929D, 0.6499999761581421D);

    public BlockITorch(String name, String color) {

        super(name, Material.CIRCUITS, CreativeTabsHandler.iTorchTab, 0.1F, 0.1F, 1F);
        this.color = color;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        switch ((EnumFacing) state.getValue(FACING)) {
            case EAST:
                return TORCH_EAST_AABB;
            case WEST:
                return TORCH_WEST_AABB;
            case SOUTH:
                return TORCH_SOUTH_AABB;
            case NORTH:
                return TORCH_NORTH_AABB;
            default:
                return STANDING_AABB;
        }
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    private boolean canPlaceOn(World worldIn, BlockPos pos) {
        IBlockState state = worldIn.getBlockState(pos);
        return state.getBlock().canPlaceTorchOnTop(state, worldIn, pos);
    }

    private float IntToFloat(float input) {
        return input /= 255f;

    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        EnumFacing enumfacing = (EnumFacing) stateIn.getValue(FACING);


        double xpos = (double) pos.getX() + 0.5D;
        double ypos = (double) pos.getY() + 0.7D;
        double zpos = (double) pos.getZ() + 0.5D;
        float red;
        float green;
        float blue;
        switch (color) {
            case "yellow":
                red = IntToFloat(255f);
                green = IntToFloat(255f);
                blue = IntToFloat(0f);
                break;
            case "black":
                red = IntToFloat(0f);
                green = IntToFloat(0f);
                blue = IntToFloat(0f);
                break;
            case "blue":
                red = IntToFloat(30f);
                green = IntToFloat(144f);
                blue = IntToFloat(255f);
                break;
            case "brown":
                red = IntToFloat(160f);
                green = IntToFloat(82f);
                blue = IntToFloat(45f);
                break;
            case "cyan":
                red = IntToFloat(0f);
                green = IntToFloat(255f);
                blue = IntToFloat(255f);
                break;
            case "gray":
                red = IntToFloat(80f);
                green = IntToFloat(80f);
                blue = IntToFloat(80f);
                break;
            case "green":
                red = IntToFloat(0f);
                green = IntToFloat(128f);
                blue = IntToFloat(0f);
                break;
            case "light_blue":
                red = IntToFloat(173f);
                green = IntToFloat(216f);
                blue = IntToFloat(230f);
                break;
            case "light_gray":
                red = IntToFloat(169f);
                green = IntToFloat(169f);
                blue = IntToFloat(169f);
                break;
            case "lime":
                red = IntToFloat(0f);
                green = IntToFloat(255f);
                blue = IntToFloat(0f);
                break;
            case "magenta":
                red = IntToFloat(255f);
                green = IntToFloat(0f);
                blue = IntToFloat(255f);
                break;
            case "orange":
                red = IntToFloat(255f);
                green = IntToFloat(140);
                blue = IntToFloat(0f);
                break;
            case "pink":
                red = IntToFloat(255f);
                green = IntToFloat(105f);
                blue = IntToFloat(180f);
                break;
            case "purple":
                red = IntToFloat(148f);
                green = IntToFloat(0f);
                blue = IntToFloat(211f);
                break;
            case "red":
                red = IntToFloat(178f);
                green = IntToFloat(34f);
                blue = IntToFloat(34f);
                break;
            case "white":
                red = IntToFloat(255f);
                green = IntToFloat(255f);
                blue = IntToFloat(255f);
                break;
            default:
                red = IntToFloat(0f);
                green = IntToFloat(0f);
                blue = IntToFloat(0f);
                break;
        }

        if (enumfacing.getAxis().isHorizontal()) {
            EnumFacing enumfacing1 = enumfacing.getOpposite();
            ParticleCustomSmoke newEffect = new ParticleCustomSmoke(worldIn, xpos + 0.27D * (double) enumfacing1.getFrontOffsetX(),
                    ypos + 0.22D, zpos + 0.27D * (double) enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D,
                    0.0D, 1F, red, green, blue);
            Minecraft.getMinecraft().effectRenderer.addEffect(newEffect);

            ParticleCustomFlame newEffect2 = new ParticleCustomFlame(worldIn, xpos + 0.27D * (double)enumfacing1.getFrontOffsetX(),
                    ypos + 0.22D, zpos + 0.27D * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, this.color, red, green, blue);
            Minecraft.getMinecraft().effectRenderer.addEffect(newEffect2);

        } else {
            ParticleCustomSmoke newEffect = new ParticleCustomSmoke(worldIn, xpos,
                    ypos, zpos, 0.0D, 0.0D, 0.0D, 1F, red, green, blue);
            Minecraft.getMinecraft().effectRenderer.addEffect(newEffect);

            ParticleCustomFlame newEffect2 = new ParticleCustomFlame(worldIn, xpos,
                    ypos, zpos, 0.0D, 0.0D, 0.0D, this.color, red, green, blue);
            Minecraft.getMinecraft().effectRenderer.addEffect(newEffect2);
        }
    }

    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta) {
            case 1:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST);
                break;
            case 3:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
                break;
            case 5:
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
        }

        return iblockstate;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public int getMetaFromState(IBlockState state) {
        int i = 0;

        switch ((EnumFacing) state.getValue(FACING)) {
            case EAST:
                i = i | 1;
                break;
            case WEST:
                i = i | 2;
                break;
            case SOUTH:
                i = i | 3;
                break;
            case NORTH:
                i = i | 4;
                break;
            case DOWN:
            case UP:
            default:
                i = i | 5;
        }

        return i;
    }

    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    public BlockFaceShape func_193383_a(IBlockAccess p_193383_1_, IBlockState p_193383_2_, BlockPos p_193383_3_, EnumFacing p_193383_4_) {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

}
