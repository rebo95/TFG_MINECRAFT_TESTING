package com.Aaron.TFGMod.events;

import com.Aaron.TFGMod.TFGMod;

import com.Aaron.TFGMod.blocks.TestBlockItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraft.world.border.IBorderListener;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = TFGMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.FORGE)

public class testJumpEvent {
    @SubscribeEvent
    public static void testJumpEvent(BlockEvent.BreakEvent event){

        PlayerEntity player = event.getPlayer();


        String brokenBlockName = event.getState().getBlock().getRegistryName().toString();
        String conditionBlock = "tfgmod20200607:test_block";

        if(brokenBlockName.equals(conditionBlock)){
            player.setHealth(player.getHealth() - 1);
            TFGMod.LOGGER.info("Destroying : " + conditionBlock);
        }
    }
}
