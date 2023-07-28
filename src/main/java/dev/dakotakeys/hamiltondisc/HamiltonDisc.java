package dev.dakotakeys.hamiltondisc;

import dev.dakotakeys.hamiltondisc.block.BlockRegistry;
import dev.dakotakeys.hamiltondisc.entity.VillagerRegistry;
import dev.dakotakeys.hamiltondisc.item.ItemRegistry;
import dev.dakotakeys.hamiltondisc.loot.ModLootModifiers;
import dev.dakotakeys.hamiltondisc.sound.SoundRegistry;
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

