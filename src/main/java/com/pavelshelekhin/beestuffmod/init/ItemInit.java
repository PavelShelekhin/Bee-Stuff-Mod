package com.pavelshelekhin.beestuff.beestuffmod;

import com.pavelshelekhin.beestuffmod.BeeStuff;
import com.pavelshelekhin.beestuffmod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = BeeStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(BeeStuff.MOD_ID)
public class ItemInit {
    public static Item wax_torch = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        Item waxTorch = new WallOrFloorItem(BlockInit.wax_torch_block, BlockInit.wax_torch_block, (new Item.Properties()).group(ItemGroup.DECORATIONS)).setRegistryName("wax_torch");
        event.getRegistry().register(waxTorch);
    }
}
