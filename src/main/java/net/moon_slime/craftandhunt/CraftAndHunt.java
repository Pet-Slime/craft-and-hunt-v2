package net.moon_slime.craftandhunt;

import com.mojang.logging.LogUtils;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.moon_slime.craftandhunt.block.ModBlocks;
import net.moon_slime.craftandhunt.client.model.layered.ModModelLayers;
import net.moon_slime.craftandhunt.client.renderer.CustomArmorRenderProperties;
import net.moon_slime.craftandhunt.item.ModItems;
import net.moon_slime.craftandhunt.loot.ModLootModifiers;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CraftAndHunt.MOD_ID)
public class CraftAndHunt
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "craftandhunt";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);


    public CraftAndHunt()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("Craft and hunt: Initialized");

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::setupEntityModelLayers);

        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        PROXY.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupEntityModelLayers(final EntityRenderersEvent.RegisterLayerDefinitions event) {

        LOGGER.info("Craft and hunt: Entity Model Layers");
        ModModelLayers.register(event);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            PROXY.clientInit();
        }


    }
}
