package net.moon_slime.craftandhunt.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.client.model.layered.ModModelLayers;
import net.moon_slime.craftandhunt.client.model.layered.ModelCanineArmor;
import net.moon_slime.craftandhunt.item.ModItems;

public class CustomArmorRenderProperties implements IClientItemExtensions {

    private static boolean init;

    public static ModelCanineArmor CANINE_ARMOR_MODEL;
    public static ModelCanineArmor HOGLIN_ARMOR_MODEL;

    public static void initializeModels() {
        init = true;
        CANINE_ARMOR_MODEL = new ModelCanineArmor(Minecraft.getInstance().getEntityModels().bakeLayer(ModModelLayers.CANINE_ARMOR));
        HOGLIN_ARMOR_MODEL = new ModelCanineArmor(Minecraft.getInstance().getEntityModels().bakeLayer(ModModelLayers.HOGLIN_ARMOR));
    }

    @Override
    public HumanoidModel<?> getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
        if(!init){
            initializeModels();
        }
        if(itemStack.getItem() == ModItems.CANINE_WOLF_HELMET.get()){
            return CANINE_ARMOR_MODEL;
        }
        if(itemStack.getItem() == ModItems.CANINE_FOX_HELMET.get()){
            return CANINE_ARMOR_MODEL;
        }
        if(itemStack.getItem() == ModItems.CANINE_FOX_FIRE_HELMET.get()){
            return CANINE_ARMOR_MODEL;
        }
        if(itemStack.getItem() == ModItems.HOGLIN_HELMET.get()){
            return HOGLIN_ARMOR_MODEL;
        }
        return _default;
    }
}
