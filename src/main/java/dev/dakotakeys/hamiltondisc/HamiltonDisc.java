package dev.dakotakeys.hamiltondisc;

import dev.dakotakeys.hamiltondisc.loot.AddItemModifier;
import dev.dakotakeys.hamiltondisc.loot.ModLootModifiers;
import dev.dakotakeys.hamiltondisc.registry.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HamiltonDisc.MODID)
public class HamiltonDisc {
    public static final String MODID = "hamiltondisc";

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            VillagerRegistry.registerPOIs();
        });
    }

    public HamiltonDisc() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        ItemRegistry.register(bus);
        SoundRegistry.register(bus);
        CreativeTabRegistry.register(bus);
        BlockRegistry.register(bus);
        VillagerRegistry.register(bus);
        ModLootModifiers.register(bus);
    }
}

