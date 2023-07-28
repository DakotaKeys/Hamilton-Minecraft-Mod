package dev.dakotakeys.hamiltondisc;

import dev.dakotakeys.hamiltondisc.item.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.world.item.CreativeModeTabs.SPAWN_EGGS;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HamiltonDisc.MODID);

    public static final List<Supplier<? extends ItemLike>> HAMILTON_DISC_TAB_ITEMS = new ArrayList<>();

    public static final List<Supplier<? extends ItemLike>> HAMILTON_DISC_TAB_INSERTS = new ArrayList<>();

    public static final List<Supplier<? extends ItemLike>> HAMILTON_DISC_TAB_DISC = new ArrayList<>();

    public static final List<Supplier<? extends ItemLike>> HAMILTON_DISC_TAB_BLOCKS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> HAMILTON_DISC = TABS.register("hamilton_disc",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hamilton_disc_tab"))
                    .icon(ItemRegistry.ALEXANDER_HAMILTON.get()::getDefaultInstance)
                    .withTabsBefore(SPAWN_EGGS)
                    .displayItems((displayParams, output) -> {
                        HAMILTON_DISC_TAB_DISC.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> HAMILTON_DISC_ITEMS = TABS.register("hamilton_disc_items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hamilton_disc_items_tab"))
                    .icon(ItemRegistry.VINYL_FRAGMENT.get()::getDefaultInstance)
                    .withTabsBefore(SPAWN_EGGS)
                    .displayItems((displayParams, output) -> {
                        HAMILTON_DISC_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> HAMILTON_DISC_BLOCKS = TABS.register("hamilton_disc_blocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hamilton_disc_blocks_tab"))
                    .icon(ItemRegistry.MONEY_LOG.get()::getDefaultInstance)
                    .withTabsBefore(SPAWN_EGGS)
                    .displayItems((displayParams, output) -> {
                        HAMILTON_DISC_TAB_BLOCKS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> HAMILTON_DISC_INSERTS = TABS.register("hamilton_disc_inserts",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hamilton_disc_inserts_tab"))
                    .icon(ItemRegistry.ALEXANDER_HAMILTON_INSERT.get()::getDefaultInstance)
                    .withTabsBefore(SPAWN_EGGS)
                    .displayItems((displayParams, output) -> {
                        HAMILTON_DISC_TAB_INSERTS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );


    public static <T extends Item> RegistryObject<T> addtoItemTab(RegistryObject<T> itemLike) {
        HAMILTON_DISC_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addtoBlockTab(RegistryObject<T> itemLike) {
        HAMILTON_DISC_TAB_BLOCKS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addtoInsertTab(RegistryObject<T> itemLike) {
        HAMILTON_DISC_TAB_INSERTS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addtoDiscTab(RegistryObject<T> itemLike) {
        HAMILTON_DISC_TAB_DISC.add(itemLike);
        return itemLike;
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
