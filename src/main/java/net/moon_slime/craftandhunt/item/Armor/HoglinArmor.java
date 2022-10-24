package net.moon_slime.craftandhunt.item.Armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.ForgeRegistries;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.item.ModCreativeModTab;
import net.moon_slime.craftandhunt.item.ModItems;

public class HoglinArmor extends ArmorItem {

    private static final CreativeModeTab LEATHERS = ModCreativeModTab.CRAFT_AND_HUNT_ARMORS;



    public HoglinArmor(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ModItems.BEAR_LEATHER_POLAR.get()));
            }

            @Override
            public String getName() {
                return "hoglin_armor";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    @Override
    public void initializeClient(java.util.function.Consumer<IClientItemExtensions> consumer) {
        consumer.accept((IClientItemExtensions) CraftAndHunt.PROXY.getArmorRenderProperties());
    }

    public static class Helmet extends HoglinArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "craftandhunt:textures/models/armor/hoglin_layer_1.png";
        }
    }

    public static class Chestplate extends HoglinArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "craftandhunt:textures/models/armor/hoglin_layer_1.png";
        }
    }

    public static class Leggings extends HoglinArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "craftandhunt:textures/models/armor/hoglin_layer_2.png";
        }
    }

    public static class Boots extends HoglinArmor {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "craftandhunt:textures/models/armor/hoglin_layer_1.png";
        }
    }
}

