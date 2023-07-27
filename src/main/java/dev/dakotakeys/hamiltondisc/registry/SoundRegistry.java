package dev.dakotakeys.hamiltondisc.registry;

import dev.dakotakeys.hamiltondisc.HamiltonDisc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HamiltonDisc.MODID);

    public static final RegistryObject<SoundEvent> ALEXANDER_HAMILTON = registerSoundEvent("alexander_hamilton");

    public static final RegistryObject<SoundEvent> AARON_BURR_SIR = registerSoundEvent("aaron_burr_sir");

    public static final RegistryObject<SoundEvent> MY_SHOT = registerSoundEvent("my_shot");

    public static final RegistryObject<SoundEvent> THE_STORY_OF_TONIGHT = registerSoundEvent("the_story_of_tonight");

    public static final RegistryObject<SoundEvent> THE_SCHUYLER_SISTERS = registerSoundEvent("the_schuyler_sisters");

    public static final RegistryObject<SoundEvent> FARMER_REFUTED = registerSoundEvent("farmer_refuted");

    public static final RegistryObject<SoundEvent> YOULL_BE_BACK = registerSoundEvent("youll_be_back");

    public static final RegistryObject<SoundEvent> RIGHT_HAND_MAN = registerSoundEvent("right_hand_man");

    public static final RegistryObject<SoundEvent> A_WINTERS_BALL = registerSoundEvent("a_winters_ball");

    public static final RegistryObject<SoundEvent> HELPLESS = registerSoundEvent("helpless");

    public static final RegistryObject<SoundEvent> SATISFIED = registerSoundEvent("satisfied");

    public static final RegistryObject<SoundEvent> THE_STORY_OF_TONIGHT_REPRISE = registerSoundEvent("the_story_of_tonight_reprise");

    public static final RegistryObject<SoundEvent> WAIT_FOR_IT = registerSoundEvent("wait_for_it");

    public static final RegistryObject<SoundEvent> STAY_ALIVE = registerSoundEvent("stay_alive");

    public static final RegistryObject<SoundEvent> TEN_DUEL_COMMANDMENTS = registerSoundEvent("ten_duel_commandments");

    public static final RegistryObject<SoundEvent> MEET_ME_INSIDE = registerSoundEvent("meet_me_inside");

    public static final RegistryObject<SoundEvent> THAT_WOULD_BE_ENOUGH = registerSoundEvent("that_would_be_enough");

    public static final RegistryObject<SoundEvent> GUNS_AND_SHIPS = registerSoundEvent("guns_and_ships");

    public static final RegistryObject<SoundEvent> HISTORY_HAS_ITS_EYES_ON_YOU = registerSoundEvent("history_has_its_eyes_on_you");

    public static final RegistryObject<SoundEvent> YORKTOWN_THE_WORLD_TURNED_UPSIDE_DOWN = registerSoundEvent("yorktown_the_world_turned_upside_down");

    public static final RegistryObject<SoundEvent> WHAT_COMES_NEXT = registerSoundEvent("what_comes_next");

    public static final RegistryObject<SoundEvent> DEAR_THEODOSIA = registerSoundEvent("dear_theodosia");

    public static final RegistryObject<SoundEvent> NON_STOP = registerSoundEvent("non_stop");

    public static final RegistryObject<SoundEvent> WHATD_I_MISS = registerSoundEvent("whatd_i_miss");

    public static final RegistryObject<SoundEvent> CABINET_BATTLE_1 = registerSoundEvent("cabinet_battle_1");

    public static final RegistryObject<SoundEvent> TAKE_A_BREAK = registerSoundEvent("take_a_break");

    public static final RegistryObject<SoundEvent> SAY_NO_TO_THIS = registerSoundEvent("say_no_to_this");

    public static final RegistryObject<SoundEvent> THE_ROOM_WHERE_IT_HAPPENS = registerSoundEvent("the_room_where_it_happens");

    public static final RegistryObject<SoundEvent> SCHUYLER_DEFEATED = registerSoundEvent("schuyler_defeated");

    public static final RegistryObject<SoundEvent> CABINET_BATTLE_2 = registerSoundEvent("cabinet_battle_2");

    public static final RegistryObject<SoundEvent> WASHINGTON_ON_YOUR_SIDE = registerSoundEvent("washington_on_your_side");

    public static final RegistryObject<SoundEvent> ONE_LAST_TIME = registerSoundEvent("one_last_time");

    public static final RegistryObject<SoundEvent> I_KNOW_HIM = registerSoundEvent("i_know_him");

    public static final RegistryObject<SoundEvent> THE_ADAMS_ADMINISTRATION = registerSoundEvent("the_adams_administration");

    public static final RegistryObject<SoundEvent> WE_KNOW = registerSoundEvent("we_know");

    public static final RegistryObject<SoundEvent> HURRICANE = registerSoundEvent("hurricane");

    public static final RegistryObject<SoundEvent> THE_REYNOLDS_PAMPHLET = registerSoundEvent("the_reynolds_pamphlet");

    public static final RegistryObject<SoundEvent> BURN = registerSoundEvent("burn");

    public static final RegistryObject<SoundEvent> BLOW_US_ALL_AWAY = registerSoundEvent("blow_us_all_away");

    public static final RegistryObject<SoundEvent> STAY_ALIVE_REPRISE = registerSoundEvent("stay_alive_reprise");

    public static final RegistryObject<SoundEvent> ITS_QUIET_UPTOWN = registerSoundEvent("its_quiet_uptown");

    public static final RegistryObject<SoundEvent> THE_ELECTION_OF_1800 = registerSoundEvent("the_election_of_1800");

    public static final RegistryObject<SoundEvent> YOUR_OBEDIENT_SERVANT = registerSoundEvent("your_obedient_servant");

    public static final RegistryObject<SoundEvent> BEST_OF_WIVES_AND_BEST_OF_WOMEN = registerSoundEvent("best_of_wives_and_best_of_women");

    public static final RegistryObject<SoundEvent> THE_WORLD_WAS_WIDE_ENOUGH = registerSoundEvent("the_world_was_wide_enough");

    public static final RegistryObject<SoundEvent> WHO_LIVES_WHO_DIES_WHO_TELLS_YOUR_STORY = registerSoundEvent("who_lives_who_dies_who_tells_your_story");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(HamiltonDisc.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
