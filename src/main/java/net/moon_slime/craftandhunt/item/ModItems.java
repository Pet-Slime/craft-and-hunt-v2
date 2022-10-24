package net.moon_slime.craftandhunt.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.item.Armor.*;

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

    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new BoneArmor.Helmet());
    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new BoneArmor.Chestplate());
    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new BoneArmor.Leggings());
    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new BoneArmor.Boots());

    public static final RegistryObject<Item> CANINE_WOLF_HELMET = ITEMS.register("canine_wolf_helmet",
            () -> new CanineArmorWolf.Helmet());
    public static final RegistryObject<Item> CANINE_WOLF_CHESTPLATE = ITEMS.register("canine_wolf_chestplate",
            () -> new CanineArmorWolf.Chestplate());
    public static final RegistryObject<Item> CANINE_WOLF_LEGGINGS = ITEMS.register("canine_wolf_leggings",
            () -> new CanineArmorWolf.Leggings());
    public static final RegistryObject<Item> CANINE_WOLF_BOOTS = ITEMS.register("canine_wolf_boots",
            () -> new CanineArmorWolf.Boots());

    public static final RegistryObject<Item> CANINE_FOX_HELMET = ITEMS.register("canine_fox_helmet",
            () -> new CanineArmorFox.Helmet());
    public static final RegistryObject<Item> CANINE_FOX_CHESTPLATE = ITEMS.register("canine_fox_chestplate",
            () -> new CanineArmorFox.Chestplate());
    public static final RegistryObject<Item> CANINE_FOX_LEGGINGS = ITEMS.register("canine_fox_leggings",
            () -> new CanineArmorFox.Leggings());
    public static final RegistryObject<Item> CANINE_FOX_BOOTS = ITEMS.register("canine_fox_boots",
            () -> new CanineArmorFox.Boots());

    public static final RegistryObject<Item> CANINE_FOX_FIRE_HELMET = ITEMS.register("canine_fox_fire_helmet",
            () -> new CanineArmorFoxFire.Helmet());
    public static final RegistryObject<Item> CANINE_FOX_FIRE_CHESTPLATE = ITEMS.register("canine_fox_fire_chestplate",
            () -> new CanineArmorFoxFire.Chestplate());
    public static final RegistryObject<Item> CANINE_FOX_FIRE_LEGGINGS = ITEMS.register("canine_fox_fire_leggings",
            () -> new CanineArmorFoxFire.Leggings());
    public static final RegistryObject<Item> CANINE_FOX_FIRE_BOOTS = ITEMS.register("canine_fox_fire_boots",
            () -> new CanineArmorFoxFire.Boots());

    public static final RegistryObject<Item> HOGLIN_HELMET = ITEMS.register("hoglin_helmet",
            () -> new HoglinArmor.Helmet());
    public static final RegistryObject<Item> HOGLIN_CHESTPLATE = ITEMS.register("hoglin_chestplate",
            () -> new HoglinArmor.Chestplate());
    public static final RegistryObject<Item> HOGLIN_LEGGINGS = ITEMS.register("hoglin_leggings",
            () -> new HoglinArmor.Leggings());
    public static final RegistryObject<Item> HOGLIN_BOOTS = ITEMS.register("hoglin_boots",
            () -> new HoglinArmor.Boots());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
