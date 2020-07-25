package com.Aaron.TFGMod.blocks;

import com.Aaron.TFGMod.TFGMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class TestBlockItem extends BlockItem {

    public TestBlockItem(Block block) {
        super(block, new Item.Properties().group(TFGMod.TAB));
    }
}
