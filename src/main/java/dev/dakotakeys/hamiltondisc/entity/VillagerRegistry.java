package dev.dakotakeys.hamiltondisc.entity;

import com.google.common.collect.ImmutableSet;
import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import dev.dakotakeys.hamiltondisc.block.BlockRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class VillagerRegistry {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, HamiltonDisc.MODID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, HamiltonDisc.MODID);

    public static final RegistryObject<PoiType> JUKEBOX_POI = POI_TYPES.register("jukebox_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DISC_MERCHANT = VILLAGER_PROFESSIONS.register("disc_merchant",
            () -> new VillagerProfession("disc_merchant", x -> x.get() == JUKEBOX_POI.get(),
                    x -> x.get() == JUKEBOX_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, JUKEBOX_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
