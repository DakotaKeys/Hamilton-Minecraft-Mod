package dev.dakotakeys.hamiltondisc.registry;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HamiltonDisc.MODID);

    public static final RegistryObject<EntityType<MoneyZombie>> MONEY_ZOMBIE= ENTITIES.register("money_zombie",
            () -> EntityType.Builder.of(MoneyZombie::new, MobCategory.MONSTER)
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(HamiltonDisc.MODID, "money_zombie").toString())
    );

}
