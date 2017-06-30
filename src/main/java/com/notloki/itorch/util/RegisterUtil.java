package com.notloki.itorch.util;


import com.notloki.itorch.ITorch;
import com.notloki.itorch.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

public class RegisterUtil {


    public static void registerAll(FMLPreInitializationEvent event) {
        registerBlocks(event, Blocks.iTorch, Blocks.iTorchBlack, Blocks.iTorchBlue, Blocks.iTorchBrown, Blocks.iTorchCyan, Blocks.iTorchGray, Blocks.iTorchGreen,
                Blocks.iTorchLightBlue, Blocks.iTorchLightGray, Blocks.iTorchLime, Blocks.iTorchMagenta, Blocks.iTorchOrange, Blocks.iTorchPink, Blocks.iTorchPurple,
                Blocks.iTorchRed, Blocks.iTorchWhite);

    }

    private static void registerBlocks(FMLPreInitializationEvent event, Block...blocks) {
        for(Block block : blocks) {

            final ItemBlock itemblock = new ItemBlock(block);
            if(event.getSide() == CLIENT) {
                ITorch.LOGGER.info("Registering Block : " + block.getUnlocalizedName().substring(5));
                GameRegistry.register(block);
                GameRegistry.register(itemblock, block.getRegistryName());


                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                        new ModelResourceLocation(
                                block.getRegistryName(),
                                "inventory"));
            }
        }
    }

    private static void registerItems(FMLPreInitializationEvent event, Item...items) {
        for(Item item : items) {
            if(event.getSide() == CLIENT) {
                ITorch.LOGGER.info("Registering Item : " + item.getUnlocalizedName().substring(5));
                GameRegistry.register(item);
            }
            ModelLoader.setCustomModelResourceLocation(item, 0,
                    new ModelResourceLocation(
                            item.getRegistryName(),
                            "inventory"));
        }
    }


}