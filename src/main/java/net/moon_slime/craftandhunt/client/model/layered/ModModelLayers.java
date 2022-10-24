package net.moon_slime.craftandhunt.client.model.layered;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.moon_slime.craftandhunt.CraftAndHunt;

public class ModModelLayers {

    public static final ModelLayerLocation CANINE_ARMOR = createLocation("canine_armor", "main");
    public static final ModelLayerLocation HOGLIN_ARMOR = createLocation("hoglin_armor", "main");

    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CANINE_ARMOR, () -> ModelCanineArmor.createArmorLayer(new CubeDeformation(1.0F)));
        event.registerLayerDefinition(HOGLIN_ARMOR, () -> ModelHoglinArmor.createArmorLayer(new CubeDeformation(1.0F)));

        CraftAndHunt.LOGGER.info("Craft and hunt: Entity Model Layers: initialized");
    }

    private static ModelLayerLocation createLocation(String model, String layer) {
        return new ModelLayerLocation(new ResourceLocation("craftandhunt", model), layer);
    }


}
