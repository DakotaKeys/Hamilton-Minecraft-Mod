package dev.dakotakeys.hamiltondisc.registry;

import com.google.common.collect.ImmutableSet;
import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
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

    public static final RegistryObject<PoiType> VINYL_ORE_POI = POI_TYPES.register("vinyl_ore_poi",
            () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.VINYL_ORE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DISC_MERCHANT = VILLAGER_PROFESSIONS.register("disc_merchant",
            () -> new VillagerProfession("disc_merchant", x -> x.get() == VINYL_ORE_POI.get(),
                    x -> x.get() == VINYL_ORE_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, VINYL_ORE_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
