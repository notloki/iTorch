package com.notloki.itorch.crafting;

import com.notloki.itorch.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class ModRecipes {

    public static final IRecipe i_torch_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorch, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeYellow",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_black_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchBlack, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeBlack",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_blue_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchBlue, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeBlue",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_brown_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchBrown, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeBrown",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_white_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchWhite, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeWhite",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_green_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchGreen, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeGreen",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_red_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchRed, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeRed",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_gray_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchGray, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeGray",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_lime_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchLime, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeLime",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_cyan_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchCyan, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeCyan",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_purple_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchPurple, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyePurple",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_pink_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchPink, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyePink",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_orange_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchOrange, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeOrange",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_magenta_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchMagenta, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeMagenta",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_light_blue_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchLightBlue, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeLightBlue",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_light_gray_shaped = new ShapedOreRecipe(new ItemStack(Blocks.iTorchLightGray, 8), new Object[] {
            "XXX",
            "XOX",
            "XXX",
            'O', "dyeLightGray",
            'X', net.minecraft.init.Blocks.TORCH
    });

    public static final IRecipe i_torch_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorch), new Object[]{
            "dyeYellow",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_blue_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchBlue), new Object[]{
            "dyeBlue",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_white_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchWhite), new Object[]{
            "dyeWhite",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_green_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchGreen), new Object[]{
            "dyeGreen",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_black_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchBlack), new Object[]{
            "dyeBlack",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_red_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchRed), new Object[]{
            "dyeRed",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_gray_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchGray), new Object[]{
            "dyeGray",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_lime_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchLime), new Object[]{
            "dyeLime",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_cyan_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchCyan), new Object[]{
            "dyeCyan",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_brown_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchBrown), new Object[]{
            "dyeBrown",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_purple_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchPurple), new Object[]{
            "dyePurple",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_pink_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchPink), new Object[]{
            "dyePink",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_orange_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchOrange), new Object[]{
            "dyeOrange",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_magenta_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchMagenta), new Object[]{
            "dyeMagenta",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_light_blue_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchLightBlue), new Object[]{
            "dyeLightBlue",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });

    public static final IRecipe i_torch_light_gray_shapeless = new ShapelessOreRecipe(new ItemStack(Blocks.iTorchLightGray), new Object[]{
            "dyeLightGray",
            new ItemStack(net.minecraft.init.Blocks.TORCH)
    });





}
