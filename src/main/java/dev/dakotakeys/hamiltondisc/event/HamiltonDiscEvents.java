package dev.dakotakeys.hamiltondisc.event;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import dev.dakotakeys.hamiltondisc.registry.ItemRegistry;
import dev.dakotakeys.hamiltondisc.registry.VillagerRegistry;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = HamiltonDisc.MODID)
public class HamiltonDiscEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.ALEXANDER_HAMILTON.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }

    }
}
