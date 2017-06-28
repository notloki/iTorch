package com.notloki.itorch.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import static net.minecraft.init.Blocks.TORCH;

public class CreativeTabsHandler {

    public static final CreativeTabs iTorchTab = new CreativeTabs("i_torch") {

        @Override
        public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(TORCH));}
    };
}
