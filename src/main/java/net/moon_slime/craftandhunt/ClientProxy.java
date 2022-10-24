package net.moon_slime.craftandhunt;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.moon_slime.craftandhunt.client.renderer.CustomArmorRenderProperties;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = CraftAndHunt.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public Object getArmorRenderProperties() {
        return new CustomArmorRenderProperties();
    }
}
