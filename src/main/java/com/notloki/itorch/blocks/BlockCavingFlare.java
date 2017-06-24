package com.notloki.itorch.blocks;

import com.notloki.itorch.handlers.CreativeTabsHandler;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Brian on 6/22/2017.
 */
public class BlockCavingFlare extends BlockBase {
    public BlockCavingFlare(String name) {
        super(name,Material.CIRCUITS, CreativeTabsHandler.iTorchTab,0.01f,0.01f,1f);

    }
}
