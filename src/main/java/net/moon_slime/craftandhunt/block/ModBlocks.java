package net.moon_slime.craftandhunt.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.item.ModCreativeModTab;
import net.moon_slime.craftandhunt.item.ModItems;

import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CraftAndHunt.MOD_ID);


    private static final CreativeModeTab LEATHERS = ModCreativeModTab.CRAFT_AND_HUNT_LEATHERS;

     public static final RegistryObject<Block> BEAR_LEATHER_POLAR_BLOCK = registerBlock("bear_leather_polar_block",
             () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOL).color(MaterialColor.SNOW).sound(SoundType.WOOL).strength(0.8F)), LEATHERS);


    public static final RegistryObject<Block> BEAR_LEATHER_PANDA_BLOCK = registerBlock("bear_leather_panda_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOL).color(MaterialColor.SNOW).sound(SoundType.WOOL).strength(0.8F)), LEATHERS);











    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
