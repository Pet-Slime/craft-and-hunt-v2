package net.moon_slime.craftandhunt.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab CRAFT_AND_HUNT_LEATHERS = new CreativeModeTab("craftandhunttableathers") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEAR_LEATHER_POLAR.get());
        }
    };

    public static final CreativeModeTab CRAFT_AND_HUNT_ARMORS = new CreativeModeTab("craftandhunttabarmors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEAR_LEATHER_POLAR.get());
        }
    };
}
