package net.moon_slime.craftandhunt.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.moon_slime.craftandhunt.CraftAndHunt;

import java.util.Collections;


@Mod.EventBusSubscriber(modid = CraftAndHunt.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void configureForgeDatagen(GatherDataEvent evt) {
        var generator = evt.getGenerator();

        generator.addProvider(evt.includeServer(), new ModRecipeProvider(generator));
    }

}
