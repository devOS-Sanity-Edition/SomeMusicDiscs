package one.devos.nautical.SomeMusicDiscs.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs;

public class Music {
    // Carter's Music
    public static final SoundEvent SOUND_BOMBS_AND_BASS = register("disc.bombs_and_bass");
    public static final SoundEvent SOUND_TRIAL1 = register("disc.trial1");
    public static final SoundEvent SOUND_TRILLBIT = register("disc.trillbit");
    public static final SoundEvent SOUND_VERMELLIA = register("disc.vermellia");
    public static final SoundEvent SOUND_WAVE_MARCH = register("disc.wave_march");
    public static final SoundEvent SOUND_AFTER_THAT_DAY = register("disc.after_that_day");
    public static final SoundEvent SOUND_BELOW_THE_FOUNDATION = register("disc.below_the_foundation");
    public static final SoundEvent SOUND_DUELING_SLIDES = register("disc.dueling_slides");
    public static final SoundEvent SOUND_SPIRALING_ECHOES = register("disc.spiraling_echoes");
    public static final SoundEvent SOUND_AWAITING_RETRIEVAL = register("disc.awaiting_retrieval");
    public static final SoundEvent SOUND_DESTRUCTION_OF_CREATION = register("disc.destruction_of_creation");
    public static final SoundEvent SOUND_GROUNDED_RISING = register("disc.grounded_rising");
    public static final SoundEvent SOUND_LAYER_BY_LAYER = register("disc.layer_by_layer");
    public static final SoundEvent SOUND_PENDULUM_PACING = register("disc.pendulum_pacing");
    public static final SoundEvent SOUND_PULSEBRIGHT = register("disc.pulseblight");
    public static final SoundEvent SOUND_RETRACE_REVERSE = register("disc.retrace_reverse");

    public static final SoundEvent SOUND_WAVE_CUTTER = register("disc.wave_cutter");
    public static final SoundEvent SOUND_LIVE_STORAGE = register("disc.live_storage");
    public static final SoundEvent SOUND_STEEL_TIDE = register("disc.steel_tide");

    // Cursed Music
    public static final SoundEvent SOUND_AUTOTUNED_SPANISH_FLEA = register("disc.autotuned_spanish_flea");
    public static final SoundEvent SOUND_YAKETY_SAX = register("disc.yakety_sax");

    // G4
    public static final SoundEvent SOUND_G4_EASY = register("disc.g4_easy");
    public static final SoundEvent SOUND_G4_NORMAL = register("disc.g4_normal");
    public static final SoundEvent SOUND_G4_HARD = register("disc.g4_hard");
    public static final SoundEvent SOUND_G4_HELL = register("disc.g4_hell");
    public static final SoundEvent SOUND_G4_HADES = register("disc.g4_hades");
    public static final SoundEvent SOUND_G4_CHAOS = register("disc.g4_chaos");
    public static final SoundEvent SOUND_G4_REVERSE = register("disc.g4_reverse");
    public static final SoundEvent SOUND_G4_NOX = register("disc.g4_nox");
    public static final SoundEvent SOUND_G4_POLAR = register("disc.g4_polar");
    public static final SoundEvent SOUND_G4_SHOOK = register("disc.g4_shook");


    public static SoundEvent register(String name) {
        ResourceLocation resourceLocation = new ResourceLocation(SomeMusicDiscs.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, resourceLocation, SoundEvent.createVariableRangeEvent(resourceLocation));
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[SomeMusicDiscs] Music Initialized" );
    }
}
