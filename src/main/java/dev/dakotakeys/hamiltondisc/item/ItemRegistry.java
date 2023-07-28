package dev.dakotakeys.hamiltondisc.item;

import dev.dakotakeys.hamiltondisc.CreativeTabRegistry;
import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import dev.dakotakeys.hamiltondisc.block.BlockRegistry;
import dev.dakotakeys.hamiltondisc.sound.SoundRegistry;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HamiltonDisc.MODID);

    public static final RegistryObject<BlockItem> VINYL_ORE = CreativeTabRegistry.addtoBlockTab(ITEMS.register("vinyl_ore",
            () -> new BlockItem(BlockRegistry.VINYL_ORE.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<BlockItem> MONEY_LOG = CreativeTabRegistry.addtoBlockTab(ITEMS.register("money_log",
            () -> new BlockItem(BlockRegistry.MONEY_LOG.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<BlockItem> MONEY_WOOD = CreativeTabRegistry.addtoBlockTab(ITEMS.register("money_wood",
            () -> new BlockItem(BlockRegistry.MONEY_WOOD.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<BlockItem> STRIPPED_MONEY_LOG = CreativeTabRegistry.addtoBlockTab(ITEMS.register("stripped_money_log",
            () -> new BlockItem(BlockRegistry.STRIPPED_MONEY_LOG.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<BlockItem> STRIPPED_MONEY_WOOD = CreativeTabRegistry.addtoBlockTab(ITEMS.register("stripped_money_wood",
            () -> new BlockItem(BlockRegistry.STRIPPED_MONEY_WOOD.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<BlockItem> MONEY_SAPLING = CreativeTabRegistry.addtoBlockTab(ITEMS.register("money_sapling",
            () -> new BlockItem(BlockRegistry.MONEY_SAPLING.get(), new Item.Properties().stacksTo(64))));

    public static final RegistryObject<Item> VINYL_FRAGMENT = CreativeTabRegistry.addtoItemTab(ITEMS.register("vinyl_fragment",
            () -> new Item(new Item.Properties().stacksTo(64))));

    public static final RegistryObject<Item> DOLLAR_BILL = CreativeTabRegistry.addtoItemTab(ITEMS.register("dollar_bill",
            () -> new Item(new Item.Properties().stacksTo(64))));

    public static final RegistryObject<Item> ALEXANDER_HAMILTON_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("alexander_hamilton_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> AARON_BURR_SIR_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("aaron_burr_sir_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> MY_SHOT_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("my_shot_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_STORY_OF_TONIGHT_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_story_of_tonight_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_SCHUYLER_SISTERS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_schuyler_sisters_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> FARMER_REFUTED_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("farmer_refuted_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> YOULL_BE_BACK_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("youll_be_back_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> RIGHT_HAND_MAN_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("right_hand_man_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> A_WINTERS_BALL_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("a_winters_ball_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> HELPLESS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("helpless_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> SATISFIED_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("satisfied_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_STORY_OF_TONIGHT_REPRISE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_story_of_tonight_reprise_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WAIT_FOR_IT_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("wait_for_it_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> STAY_ALIVE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("stay_alive_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> TEN_DUEL_COMMANDMENTS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("ten_duel_commandments_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> MEET_ME_INSIDE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("meet_me_inside_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THAT_WOULD_BE_ENOUGH_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("that_would_be_enough_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> GUNS_AND_SHIPS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("guns_and_ships_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> HISTORY_HAS_ITS_EYES_ON_YOU_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("history_has_its_eyes_on_you_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> YORKTOWN_THE_WORLD_TURNED_UPSIDE_DOWN_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("yorktown_the_world_turned_upside_down_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WHAT_COMES_NEXT_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("what_comes_next_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> DEAR_THEODOSIA_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("dear_theodosia_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> NON_STOP_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("non_stop_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WHATD_I_MISS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("whatd_i_miss_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> CABINET_BATTLE_1_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("cabinet_battle_1_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> TAKE_A_BREAK_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("take_a_break_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> SAY_NO_TO_THIS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("say_no_to_this_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_ROOM_WHERE_IT_HAPPENS_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_room_where_it_happens_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> SCHUYLER_DEFEATED_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("schuyler_defeated_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> CABINET_BATTLE_2_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("cabinet_battle_2_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WASHINGTON_ON_YOUR_SIDE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("washington_on_your_side_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> ONE_LAST_TIME_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("one_last_time_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> I_KNOW_HIM_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("i_know_him_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_ADAMS_ADMINISTRATION_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_adams_administration_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WE_KNOW_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("we_know_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> HURRICANE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("hurricane_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_REYNOLDS_PAMPHLET_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_reynolds_pamphlet_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> BURN_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("burn_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> BLOW_US_ALL_AWAY_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("blow_us_all_away_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> STAY_ALIVE_REPRISE_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("stay_alive_reprise_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> ITS_QUIET_UPTOWN_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("its_quiet_uptown_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_ELECTION_OF_1800_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_election_of_1800_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> YOUR_OBEDIENT_SERVANT_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("your_obedient_servant_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> BEST_OF_WIVES_AND_BEST_OF_WOMEN_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("best_of_wives_and_best_of_women_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> THE_WORLD_WAS_WIDE_ENOUGH_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("the_world_was_wide_enough_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> WHO_LIVES_WHO_DIES_WHO_TELLS_YOUR_STORY_INSERT = CreativeTabRegistry.addtoInsertTab(ITEMS.register("who_lives_who_dies_who_tells_your_story_insert",
            () -> new Item(new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> BLANK_DISC = CreativeTabRegistry.addtoDiscTab(ITEMS.register("blank_disc",
            () -> new Item(new Item.Properties().stacksTo(64))));

    public static final RegistryObject<Item> ALEXANDER_HAMILTON = CreativeTabRegistry.addtoDiscTab(ITEMS.register("alexander_hamilton",
            () -> new RecordItem(1, SoundRegistry.ALEXANDER_HAMILTON, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4720)));

    public static final RegistryObject<Item> AARON_BURR_SIR = CreativeTabRegistry.addtoDiscTab(ITEMS.register("aaron_burr_sir",
            () -> new RecordItem(2, SoundRegistry.AARON_BURR_SIR, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3120)));

    public static final RegistryObject<Item> MY_SHOT = CreativeTabRegistry.addtoDiscTab(ITEMS.register("my_shot",
            () -> new RecordItem(3, SoundRegistry.MY_SHOT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6660)));

    public static final RegistryObject<Item> THE_STORY_OF_TONIGHT = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_story_of_tonight",
            () -> new RecordItem(4, SoundRegistry.THE_STORY_OF_TONIGHT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1820)));

    public static final RegistryObject<Item> THE_SCHUYLER_SISTERS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_schuyler_sisters",
            () -> new RecordItem(5, SoundRegistry.THE_SCHUYLER_SISTERS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3720)));

    public static final RegistryObject<Item> FARMER_REFUTED = CreativeTabRegistry.addtoDiscTab(ITEMS.register("farmer_refuted",
            () -> new RecordItem(6, SoundRegistry.FARMER_REFUTED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2240)));

    public static final RegistryObject<Item> YOULL_BE_BACK = CreativeTabRegistry.addtoDiscTab(ITEMS.register("youll_be_back",
            () -> new RecordItem(7, SoundRegistry.YOULL_BE_BACK, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4160)));

    public static final RegistryObject<Item> RIGHT_HAND_MAN = CreativeTabRegistry.addtoDiscTab(ITEMS.register("right_hand_man",
            () -> new RecordItem(8, SoundRegistry.RIGHT_HAND_MAN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6420)));

    public static final RegistryObject<Item> A_WINTERS_BALL = CreativeTabRegistry.addtoDiscTab(ITEMS.register("a_winters_ball",
            () -> new RecordItem(9, SoundRegistry.A_WINTERS_BALL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1380)));

    public static final RegistryObject<Item> HELPLESS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("helpless",
            () -> new RecordItem(10, SoundRegistry.HELPLESS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4980)));

    public static final RegistryObject<Item> SATISFIED = CreativeTabRegistry.addtoDiscTab(ITEMS.register("satisfied",
            () -> new RecordItem(11, SoundRegistry.SATISFIED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6580)));

    public static final RegistryObject<Item> THE_STORY_OF_TONIGHT_REPRISE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_story_of_tonight_reprise",
            () -> new RecordItem(12, SoundRegistry.THE_STORY_OF_TONIGHT_REPRISE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2300)));

    public static final RegistryObject<Item> WAIT_FOR_IT = CreativeTabRegistry.addtoDiscTab(ITEMS.register("wait_for_it",
            () -> new RecordItem(13, SoundRegistry.WAIT_FOR_IT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3860)));

    public static final RegistryObject<Item> STAY_ALIVE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("stay_alive",
            () -> new RecordItem(14, SoundRegistry.STAY_ALIVE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3180)));

    public static final RegistryObject<Item> TEN_DUEL_COMMANDMENTS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("ten_duel_commandments",
            () -> new RecordItem(15, SoundRegistry.TEN_DUEL_COMMANDMENTS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2120)));

    public static final RegistryObject<Item> MEET_ME_INSIDE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("meet_me_inside",
            () -> new RecordItem(16, SoundRegistry.MEET_ME_INSIDE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1660)));

    public static final RegistryObject<Item> THAT_WOULD_BE_ENOUGH = CreativeTabRegistry.addtoDiscTab(ITEMS.register("that_would_be_enough",
            () -> new RecordItem(17, SoundRegistry.THAT_WOULD_BE_ENOUGH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3560)));

    public static final RegistryObject<Item> GUNS_AND_SHIPS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("guns_and_ships",
            () -> new RecordItem(18, SoundRegistry.GUNS_AND_SHIPS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2540)));

    public static final RegistryObject<Item> HISTORY_HAS_ITS_EYES_ON_YOU = CreativeTabRegistry.addtoDiscTab(ITEMS.register("history_has_its_eyes_on_you",
            () -> new RecordItem(19, SoundRegistry.HISTORY_HAS_ITS_EYES_ON_YOU, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1940)));

    public static final RegistryObject<Item> YORKTOWN_THE_WORLD_TURNED_UPSIDE_DOWN = CreativeTabRegistry.addtoDiscTab(ITEMS.register("yorktown_the_world_turned_upside_down",
            () -> new RecordItem(20, SoundRegistry.YORKTOWN_THE_WORLD_TURNED_UPSIDE_DOWN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4840)));

    public static final RegistryObject<Item> WHAT_COMES_NEXT = CreativeTabRegistry.addtoDiscTab(ITEMS.register("what_comes_next",
            () -> new RecordItem(21, SoundRegistry.WHAT_COMES_NEXT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1980)));

    public static final RegistryObject<Item> DEAR_THEODOSIA = CreativeTabRegistry.addtoDiscTab(ITEMS.register("dear_theodosia",
            () -> new RecordItem(22, SoundRegistry.DEAR_THEODOSIA, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3680)));

    public static final RegistryObject<Item> NON_STOP = CreativeTabRegistry.addtoDiscTab(ITEMS.register("non_stop",
            () -> new RecordItem(23, SoundRegistry.NON_STOP, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 7700)));

    public static final RegistryObject<Item> WHATD_I_MISS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("whatd_i_miss",
            () -> new RecordItem(24, SoundRegistry.WHATD_I_MISS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4720)));

    public static final RegistryObject<Item> CABINET_BATTLE_1 = CreativeTabRegistry.addtoDiscTab(ITEMS.register("cabinet_battle_1",
            () -> new RecordItem(25, SoundRegistry.CABINET_BATTLE_1, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4300)));

    public static final RegistryObject<Item> TAKE_A_BREAK = CreativeTabRegistry.addtoDiscTab(ITEMS.register("take_a_break",
            () -> new RecordItem(26, SoundRegistry.TAKE_A_BREAK, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5720)));

    public static final RegistryObject<Item> SAY_NO_TO_THIS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("say_no_to_this",
            () -> new RecordItem(27, SoundRegistry.SAY_NO_TO_THIS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4840)));

    public static final RegistryObject<Item> THE_ROOM_WHERE_IT_HAPPENS = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_room_where_it_happens",
            () -> new RecordItem(28, SoundRegistry.THE_ROOM_WHERE_IT_HAPPENS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6360)));

    public static final RegistryObject<Item> SCHUYLER_DEFEATED = CreativeTabRegistry.addtoDiscTab(ITEMS.register("schuyler_defeated",
            () -> new RecordItem(29, SoundRegistry.SCHUYLER_DEFEATED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1260)));

    public static final RegistryObject<Item> CABINET_BATTLE_2 = CreativeTabRegistry.addtoDiscTab(ITEMS.register("cabinet_battle_2",
            () -> new RecordItem(30, SoundRegistry.CABINET_BATTLE_2, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2840)));

    public static final RegistryObject<Item> WASHINGTON_ON_YOUR_SIDE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("washington_on_your_side",
            () -> new RecordItem(31, SoundRegistry.WASHINGTON_ON_YOUR_SIDE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3620)));

    public static final RegistryObject<Item> ONE_LAST_TIME = CreativeTabRegistry.addtoDiscTab(ITEMS.register("one_last_time",
            () -> new RecordItem(32, SoundRegistry.ONE_LAST_TIME, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5920)));

    public static final RegistryObject<Item> I_KNOW_HIM = CreativeTabRegistry.addtoDiscTab(ITEMS.register("i_know_him",
            () -> new RecordItem(33, SoundRegistry.I_KNOW_HIM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1940)));

    public static final RegistryObject<Item> THE_ADAMS_ADMINISTRATION = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_adams_administration",
            () -> new RecordItem(34, SoundRegistry.THE_ADAMS_ADMINISTRATION, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1080)));

    public static final RegistryObject<Item> WE_KNOW = CreativeTabRegistry.addtoDiscTab(ITEMS.register("we_know",
            () -> new RecordItem(35, SoundRegistry.WE_KNOW, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2840)));

    public static final RegistryObject<Item> HURRICANE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("hurricane",
            () -> new RecordItem(36, SoundRegistry.HURRICANE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2860)));

    public static final RegistryObject<Item> THE_REYNOLDS_PAMPHLET = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_reynolds_pamphlet",
            () -> new RecordItem(37, SoundRegistry.THE_REYNOLDS_PAMPHLET, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2560)));

    public static final RegistryObject<Item> BURN = CreativeTabRegistry.addtoDiscTab(ITEMS.register("burn",
            () -> new RecordItem(38, SoundRegistry.BURN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4500)));

    public static final RegistryObject<Item> BLOW_US_ALL_AWAY = CreativeTabRegistry.addtoDiscTab(ITEMS.register("blow_us_all_away",
            () -> new RecordItem(39, SoundRegistry.BLOW_US_ALL_AWAY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3460)));

    public static final RegistryObject<Item> STAY_ALIVE_REPRISE = CreativeTabRegistry.addtoDiscTab(ITEMS.register("stay_alive_reprise",
            () -> new RecordItem(40, SoundRegistry.STAY_ALIVE_REPRISE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2220)));

    public static final RegistryObject<Item> ITS_QUIET_UPTOWN = CreativeTabRegistry.addtoDiscTab(ITEMS.register("its_quiet_uptown",
            () -> new RecordItem(41, SoundRegistry.ITS_QUIET_UPTOWN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5400)));

    public static final RegistryObject<Item> THE_ELECTION_OF_1800 = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_election_of_1800",
            () -> new RecordItem(42, SoundRegistry.THE_ELECTION_OF_1800, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4760)));

    public static final RegistryObject<Item> YOUR_OBEDIENT_SERVANT = CreativeTabRegistry.addtoDiscTab(ITEMS.register("your_obedient_servant",
            () -> new RecordItem(43, SoundRegistry.YOUR_OBEDIENT_SERVANT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3000)));

    public static final RegistryObject<Item> BEST_OF_WIVES_AND_BEST_OF_WOMEN = CreativeTabRegistry.addtoDiscTab(ITEMS.register("best_of_wives_and_best_of_women",
            () -> new RecordItem(44, SoundRegistry.BEST_OF_WIVES_AND_BEST_OF_WOMEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 940)));

    public static final RegistryObject<Item> THE_WORLD_WAS_WIDE_ENOUGH = CreativeTabRegistry.addtoDiscTab(ITEMS.register("the_world_was_wide_enough",
            () -> new RecordItem(45, SoundRegistry.THE_WORLD_WAS_WIDE_ENOUGH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6040)));

    public static final RegistryObject<Item> WHO_LIVES_WHO_DIES_WHO_TELLS_YOUR_STORY = CreativeTabRegistry.addtoDiscTab(ITEMS.register("who_lives_who_dies_who_tells_your_story",
            () -> new RecordItem(46, SoundRegistry.WHO_LIVES_WHO_DIES_WHO_TELLS_YOUR_STORY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4340)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}