package com.notloki.itorch.util;

import com.notloki.itorch.blocks.BlockITorch;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber
public class RegisterUtil {

    private static List<Block> blocks = new ArrayList<>();

    public static void getBlock() {
        List<Block> blocks = new ArrayList<>();
        Collections.addAll(blocks,
                new BlockITorch("i_torch",            "yellow"),
                new BlockITorch("i_torch_blue",       "blue"),
                new BlockITorch("i_torch_white",      "white"),
                new BlockITorch("i_torch_green",      "green"),
                new BlockITorch("i_torch_black",      "black"),
                new BlockITorch("i_torch_red",        "red"),
                new BlockITorch("i_torch_gray",       "gray"),
                new BlockITorch("i_torch_lime",       "lime"),
                new BlockITorch("i_torch_cyan",       "cyan"),
                new BlockITorch("i_torch_brown",      "brown"),
                new BlockITorch("i_torch_purple",     "purple"),
                new BlockITorch("i_torch_pink",       "pink"),
                new BlockITorch("i_torch_orange",     "orange"),
                new BlockITorch("i_torch_magenta",    "magenta"),
                new BlockITorch("i_torch_light_blue", "light_blue"),
                new BlockITorch("i_torch_light_gray", "light_gray"));

        RegisterUtil.blocks = blocks;

    }



    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        getBlock();
        List<Block> blocks = RegisterUtil.blocks;
        for (Block block : blocks) {

            // System.out.println("Registering :" + block.getRegistryName().toString());
            event.getRegistry().register(block);
        }
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        List<Block> blocks = RegisterUtil.blocks;

        for (Block block : blocks) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerItemBlocks(RegistryEvent<Item> event) {
        List<Block> blocks = RegisterUtil.blocks;

        for (Block block : blocks) {

            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                    new ModelResourceLocation(
                            block.getRegistryName(),
                            "inventory"));

        }
    }
}