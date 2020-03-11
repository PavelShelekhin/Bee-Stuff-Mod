package com.pavelshelekhin.beestuffmod.init;

import com.pavelshelekhin.beestuffmod.BeeStuff;
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
public class BlockInit {
    public static Block wax_torch_block = null;
    public static Block reinforced_wax = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        Block wax_torch_block = new Block(Block.Properties.create(Material.ORGANIC)).setRegistryName("wax_torch_block");
        Block reinforced_wax = new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(5)).setRegistryName("reinforced_wax");

        event.getRegistry().register(wax_torch_block);
        event.getRegistry().register(reinforced_wax);
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        Item reinforced_wax = new Item(new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("reinforced_wax");

        event.getRegistry().register(reinforced_wax);
    }
}
