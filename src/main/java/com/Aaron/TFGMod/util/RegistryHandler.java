package com.Aaron.TFGMod.util;


import com.Aaron.TFGMod.TFGMod;
import com.Aaron.TFGMod.blocks.TestBlock;
import com.Aaron.TFGMod.blocks.TestBlockItem;
import com.Aaron.TFGMod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TFGMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TFGMod.MOD_ID);

    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> ITEMTEST = ITEMS.register("itemtest", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", TestBlock::new);

    //Block Items
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block", ()->new TestBlockItem(TEST_BLOCK.get()));


}
