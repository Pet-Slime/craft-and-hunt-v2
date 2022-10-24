package net.moon_slime.craftandhunt;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CraftAndHunt.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {
    public void init() {
    }

    public void clientInit() {
    }

    public Object getArmorRenderProperties() {
        return null;
    }
}
