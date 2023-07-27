package dev.dakotakeys.hamiltondisc.registry;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HamiltonDisc.MODID);

    public static final RegistryObject<DropExperienceBlock> VINYL_ORE = BLOCKS.register("vinyl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(5.0f, 17f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(4,7)
            ));



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
