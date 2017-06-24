package com.notloki.itorch.util;

import com.notloki.itorch.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber
public class RegisterUtil {

    public static List getBlock() {
        List<Block> blocks = new ArrayList<>();
        Collections.addAll(blocks, Blocks.iTorch, Blocks.iTorchBlack, Blocks.iTorchBlue, Blocks.iTorchBrown, Blocks.iTorchCyan, Blocks.iTorchGray, Blocks.iTorchGreen,
                Blocks.iTorchLightBlue, Blocks.iTorchLightGray, Blocks.iTorchLime, Blocks.iTorchMagenta, Blocks.iTorchOrange, Blocks.iTorchPink, Blocks.iTorchPurple,
                Blocks.iTorchRed, Blocks.iTorchWhite);
        return blocks;

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        List<Block> blocks = getBlock();
        for (Block block : blocks) {
            // System.out.println("Registering :" + block.getRegistryName().toString());
            event.getRegistry().register(block);
        }
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        List<Block> blocks = getBlock();

        for (Block block : blocks) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                    new ModelResourceLocation(
                            block.getRegistryName(),
                            "inventory"));

        }
    }
}