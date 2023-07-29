package dev.dakotakeys.hamiltondisc.event;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import dev.dakotakeys.hamiltondisc.item.ItemRegistry;
import dev.dakotakeys.hamiltondisc.entity.VillagerRegistry;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
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

        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.AARON_BURR_SIR.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }

        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.MY_SHOT.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_STORY_OF_TONIGHT.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_SCHUYLER_SISTERS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.FARMER_REFUTED.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.YOULL_BE_BACK.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.RIGHT_HAND_MAN.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.A_WINTERS_BALL.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.HELPLESS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.SATISFIED.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_STORY_OF_TONIGHT_REPRISE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WAIT_FOR_IT.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.STAY_ALIVE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.TEN_DUEL_COMMANDMENTS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.MEET_ME_INSIDE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THAT_WOULD_BE_ENOUGH.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.GUNS_AND_SHIPS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.HISTORY_HAS_ITS_EYES_ON_YOU.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.YORKTOWN_THE_WORLD_TURNED_UPSIDE_DOWN.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WHAT_COMES_NEXT.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.DEAR_THEODOSIA.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.NON_STOP.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WHATD_I_MISS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.CABINET_BATTLE_1.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.TAKE_A_BREAK.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.SAY_NO_TO_THIS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_ROOM_WHERE_IT_HAPPENS.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.SCHUYLER_DEFEATED.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.CABINET_BATTLE_2.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WASHINGTON_ON_YOUR_SIDE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.ONE_LAST_TIME.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.I_KNOW_HIM.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_ADAMS_ADMINISTRATION.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WE_KNOW.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.HURRICANE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_REYNOLDS_PAMPHLET.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.BURN.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.BLOW_US_ALL_AWAY.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.STAY_ALIVE_REPRISE.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.ITS_QUIET_UPTOWN.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_ELECTION_OF_1800.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.YOUR_OBEDIENT_SERVANT.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.BEST_OF_WIVES_AND_BEST_OF_WOMEN.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.THE_WORLD_WAS_WIDE_ENOUGH.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }
        if(event.getType() == VillagerRegistry.DISC_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ItemRegistry.WHO_LIVES_WHO_DIES_WHO_TELLS_YOUR_STORY.get(), 1);
            int villagerlevel = 1;

            trades.get(villagerlevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ItemRegistry.DOLLAR_BILL.get(), 20),
                    stack, 1, 8, 0.02F));
        }

    }
}
