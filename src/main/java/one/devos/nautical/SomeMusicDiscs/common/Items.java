package one.devos.nautical.SomeMusicDiscs.common;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs;

import static one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs.ITEM_GROUP;

public class Items {
    private static final Item.Properties DISC_PROPERTIES = new Item.Properties().stacksTo(1);

    // yakety sax ensues
    public static final Item CRAPPY_SAX = register("crappy_sax", new Item(new Item.Properties().stacksTo(8)));

    // Carter
    public static final Item DISC_BOMBS_AND_BASS = register("bombs_and_bass", new DiscItem(14, Music.SOUND_BOMBS_AND_BASS, DISC_PROPERTIES, 104));
    public static final Item DISC_TRIAL1 = register("trial1", new DiscItem(14, Music.SOUND_TRIAL1, DISC_PROPERTIES, 120));
    public static final Item DISC_TRILLBIT = register("trillbit", new DiscItem(14, Music.SOUND_TRILLBIT, DISC_PROPERTIES, 72));
    public static final Item DISC_VERMELLIA = register("vermellia", new DiscItem(14, Music.SOUND_VERMELLIA, DISC_PROPERTIES, 81));

    public static final Item DISC_WAVE_MARCH = register("wave_march", new DiscItem(14, Music.SOUND_WAVE_MARCH, DISC_PROPERTIES, 129));
    public static final Item DISC_AFTER_THAT_DAY = register("after_that_day", new DiscItem(14, Music.SOUND_AFTER_THAT_DAY, DISC_PROPERTIES, 99));
    public static final Item DISC_BELOW_THE_FOUNDATION = register("below_the_foundation", new DiscItem(14, Music.SOUND_BELOW_THE_FOUNDATION, DISC_PROPERTIES, 115));
    public static final Item DISC_DUELING_SLIDES = register("dueling_slides", new DiscItem(14, Music.SOUND_DUELING_SLIDES, DISC_PROPERTIES, 63));
    public static final Item DISC_SPIRALING_ECHOES = register("spiraling_echoes", new DiscItem(14, Music.SOUND_SPIRALING_ECHOES, DISC_PROPERTIES, 78));

    public static final Item DISC_AWAITING_RETRIEVAL = register("awaiting_retrieval", new DiscItem(14, Music.SOUND_AWAITING_RETRIEVAL, DISC_PROPERTIES, 126));
    public static final Item DISC_DESTRUCTION_OF_CREATION = register("destruction_of_creation", new DiscItem(14, Music.SOUND_DESTRUCTION_OF_CREATION, DISC_PROPERTIES, 106));
    public static final Item DISC_GROUNDED_RISING = register("grounded_rising", new DiscItem(14, Music.SOUND_GROUNDED_RISING, DISC_PROPERTIES, 70));
    public static final Item DISC_LAYER_BY_LAYER = register("layer_by_layer", new DiscItem(14, Music.SOUND_LAYER_BY_LAYER, DISC_PROPERTIES, 89));
    public static final Item DISC_PENDULUM_PACING = register("pendulum_pacing", new DiscItem(14, Music.SOUND_PENDULUM_PACING, DISC_PROPERTIES, 84));
    public static final Item DISC_PULSEBRIGHT = register("pulseblight", new DiscItem(14, Music.SOUND_PULSEBRIGHT, DISC_PROPERTIES, 72));
    public static final Item DISC_RETRACE_REVERSE = register("retrace_reverse", new DiscItem(14, Music.SOUND_RETRACE_REVERSE, DISC_PROPERTIES, 78));

    public static final Item DISC_WAVE_CUTTER = register("wave_cutter", new DiscItem(14, Music.SOUND_WAVE_CUTTER, DISC_PROPERTIES, 112));
    public static final Item DISC_LIVE_STORAGE = register("live_storage", new DiscItem(14, Music.SOUND_LIVE_STORAGE, DISC_PROPERTIES, 60));
    public static final Item DISC_STEEL_TIDE = register("steel_tide", new DiscItem(14, Music.SOUND_STEEL_TIDE, DISC_PROPERTIES, 83));



    // Cursed
    public static final Item DISC_AUTOTUNED_SPANISH_FLEA = register("autotuned_spanish_flea", new DiscItem(14, Music.SOUND_AUTOTUNED_SPANISH_FLEA, DISC_PROPERTIES, 135));
    public static final Item DISC_YAKETY_SAX = register("yakety_sax", new DiscItem(14, Music.SOUND_YAKETY_SAX, DISC_PROPERTIES, 133));

    // G4
    public static final Item DISC_G4_EASY = register("g4_easy", new DiscItem(14, Music.SOUND_G4_EASY, DISC_PROPERTIES, 132));
    public static final Item DISC_G4_NORMAL = register("g4_normal", new DiscItem(14, Music.SOUND_G4_NORMAL, DISC_PROPERTIES, 177));
    public static final Item DISC_G4_HARD = register("g4_hard", new DiscItem(14, Music.SOUND_G4_HARD, DISC_PROPERTIES, 192));
    public static final Item DISC_G4_HELL = register("g4_hell", new DiscItem(14, Music.SOUND_G4_HELL, DISC_PROPERTIES, 140));
    public static final Item DISC_G4_HADES = register("g4_hades", new DiscItem(14, Music.SOUND_G4_HADES, DISC_PROPERTIES, 118 ));
    public static final Item DISC_G4_CHAOS = register("g4_chaos", new DiscItem(14, Music.SOUND_G4_CHAOS, DISC_PROPERTIES, 177));
    public static final Item DISC_G4_REVERSE = register("g4_reverse", new DiscItem(14, Music.SOUND_G4_REVERSE, DISC_PROPERTIES, 110));
    public static final Item DISC_G4_NOX = register("g4_nox", new DiscItem(14, Music.SOUND_G4_NOX, DISC_PROPERTIES, 177));
    public static final Item DISC_G4_POLAR = register("g4_polar", new DiscItem(14, Music.SOUND_G4_POLAR, DISC_PROPERTIES, 192));
    public static final Item DISC_G4_SHOOK = register("g4_shook", new DiscItem(14, Music.SOUND_G4_SHOOK, DISC_PROPERTIES, 81));

    public static Item register(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.accept(item);
        });
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SomeMusicDiscs.MOD_ID, name), item);
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[SomeMusicDiscs] Items Initialized" );
    }
}