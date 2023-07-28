package dev.dakotakeys.hamiltondisc.block;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import dev.dakotakeys.hamiltondisc.worldgen.tree.MoneyTreeGrower;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HamiltonDisc.MODID);

    public static final RegistryObject<DropExperienceBlock> VINYL_ORE = BLOCKS.register("vinyl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(5.0f, 17f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(4,7)
            ));

    public static final RegistryObject<Block> MONEY_LOG = BLOCKS.register("money_log",
            () -> new FlammableRotatedPillarBlockRegistry(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MONEY_WOOD = BLOCKS.register("money_wood",
            () -> new FlammableRotatedPillarBlockRegistry(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MONEY_LOG = BLOCKS.register("stripped_money_log",
            () -> new FlammableRotatedPillarBlockRegistry(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MONEY_WOOD = BLOCKS.register("stripped_money_wood",
            () -> new FlammableRotatedPillarBlockRegistry(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> MONEY_SAPLING = BLOCKS.register("money_sapling",
            () -> new SaplingBlock(new MoneyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
