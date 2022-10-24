package net.moon_slime.craftandhunt.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.item.Armor.BearArmorPanda;
import net.moon_slime.craftandhunt.item.Armor.BearArmorPolar;

public class ModItems {

    private static final CreativeModeTab LEATHERS = ModCreativeModTab.CRAFT_AND_HUNT_LEATHERS;


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CraftAndHunt.MOD_ID);

    public static final RegistryObject<Item> BEAR_LEATHER_POLAR = ITEMS.register("bear_leather_polar",
            () -> new Item(new Item.Properties().tab(LEATHERS)));

    public static final RegistryObject<Item> BEAR_LEATHER_PANDA= ITEMS.register("bear_leather_panda",
            () -> new Item(new Item.Properties().tab(LEATHERS)));

    public static final RegistryObject<Item> BEAR_LEATHER_POLAR_HELMET = ITEMS.register("bear_leather_polar_helmet",
            () -> new BearArmorPolar.Helmet());
    public static final RegistryObject<Item> BEAR_LEATHER_POLAR_CHESTPLATE = ITEMS.register("bear_leather_polar_chestplate",
            () -> new BearArmorPolar.Chestplate());
    public static final RegistryObject<Item> BEAR_LEATHER_POLAR_LEGGINGS = ITEMS.register("bear_leather_polar_leggings",
            () -> new BearArmorPolar.Leggings());
    public static final RegistryObject<Item> BEAR_LEATHER_POLAR_BOOTS = ITEMS.register("bear_leather_polar_boots",
            () -> new BearArmorPolar.Boots());

    public static final RegistryObject<Item> BEAR_LEATHER_PANDA_HELMET = ITEMS.register("bear_leather_panda_helmet",
            () -> new BearArmorPanda.Helmet());
    public static final RegistryObject<Item> BEAR_LEATHER_PANDA_CHESTPLATE = ITEMS.register("bear_leather_panda_chestplate",
            () -> new BearArmorPanda.Chestplate());
    public static final RegistryObject<Item> BEAR_LEATHER_PANDA_LEGGINGS = ITEMS.register("bear_leather_panda_leggings",
            () -> new BearArmorPanda.Leggings());
    public static final RegistryObject<Item> BEAR_LEATHER_PANDA_BOOTS = ITEMS.register("bear_leather_panda_boots",
            () -> new BearArmorPanda.Boots());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
