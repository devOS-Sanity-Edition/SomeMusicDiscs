package one.devos.nautical.SomeMusicDiscs.common;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs;

public class Items {
    public static final CreativeModeTab SOMEMUSICDISCS_ITEM_GROUP = FabricItemGroupBuilder.build(
            new ResourceLocation(SomeMusicDiscs.MOD_ID, "somemusicdiscs"),
            () -> new ItemStack(Items.DISC_BOMBS_AND_BASS));

    private static final Item.Properties DISC_PROPERTIES = new Item.Properties().stacksTo(1).tab(SOMEMUSICDISCS_ITEM_GROUP);

    // yakety sax ensues
    public static final Item CRAPPY_SAX = register("crappy_sax", new Item(new Item.Properties().stacksTo(8).tab(SOMEMUSICDISCS_ITEM_GROUP)));

    // Carter
    public static final Item DISC_BOMBS_AND_BASS = register("bombs_and_bass", new DiscItem(14, Music.SOUND_BOMBS_AND_BASS, DISC_PROPERTIES));
    public static final Item DISC_TRIAL1 = register("trial1", new DiscItem(14, Music.SOUND_TRIAL1, DISC_PROPERTIES));
    public static final Item DISC_TRILLBIT = register("trillbit", new DiscItem(14, Music.SOUND_TRILLBIT, DISC_PROPERTIES));
    public static final Item DISC_VERMELLIA = register("vermellia", new DiscItem(14, Music.SOUND_VERMELLIA, DISC_PROPERTIES));

    public static final Item DISC_WAVE_MARCH = register("wave_march", new DiscItem(14, Music.SOUND_WAVE_MARCH, DISC_PROPERTIES));
    public static final Item DISC_AFTER_THAT_DAY = register("after_that_day", new DiscItem(14, Music.SOUND_AFTER_THAT_DAY, DISC_PROPERTIES));
    public static final Item DISC_BELOW_THE_FOUNDATION = register("below_the_foundation", new DiscItem(14, Music.SOUND_BELOW_THE_FOUNDATION, DISC_PROPERTIES));
    public static final Item DISC_DUELING_SLIDES = register("dueling_slides", new DiscItem(14, Music.SOUND_DUELING_SLIDES, DISC_PROPERTIES));
    public static final Item DISC_SPIRALING_ECHOES = register("spiraling_echoes", new DiscItem(14, Music.SOUND_SPIRALING_ECHOES, DISC_PROPERTIES));


    // Cursed
    public static final Item DISC_AUTOTUNED_SPANISH_FLEA = register("autotuned_spanish_flea", new DiscItem(14, Music.SOUND_AUTOTUNED_SPANISH_FLEA, DISC_PROPERTIES));
    public static final Item DISC_YAKETY_SAX = register("yakety_sax", new DiscItem(14, Music.SOUND_YAKETY_SAX, DISC_PROPERTIES));

    // G4
    public static final Item DISC_G4_EASY = register("g4_easy", new DiscItem(14, Music.SOUND_G4_EASY, DISC_PROPERTIES));
    public static final Item DISC_G4_NORMAL = register("g4_normal", new DiscItem(14, Music.SOUND_G4_NORMAL, DISC_PROPERTIES));
    public static final Item DISC_G4_HARD = register("g4_hard", new DiscItem(14, Music.SOUND_G4_HARD, DISC_PROPERTIES));
    public static final Item DISC_G4_HELL = register("g4_hell", new DiscItem(14, Music.SOUND_G4_HELL, DISC_PROPERTIES));
    public static final Item DISC_G4_HADES = register("g4_hades", new DiscItem(14, Music.SOUND_G4_HADES, DISC_PROPERTIES));
    public static final Item DISC_G4_CHAOS = register("g4_chaos", new DiscItem(14, Music.SOUND_G4_CHAOS, DISC_PROPERTIES));
    public static final Item DISC_G4_REVERSE = register("g4_reverse", new DiscItem(14, Music.SOUND_G4_REVERSE, DISC_PROPERTIES));
    public static final Item DISC_G4_NOX = register("g4_nox", new DiscItem(14, Music.SOUND_G4_NOX, DISC_PROPERTIES));
    public static final Item DISC_G4_POLAR = register("g4_polar", new DiscItem(14, Music.SOUND_G4_POLAR, DISC_PROPERTIES));
    public static final Item DISC_G4_SHOOK = register("g4_shook", new DiscItem(14, Music.SOUND_G4_SHOOK, DISC_PROPERTIES));

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(SomeMusicDiscs.MOD_ID, name), item);
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[" + SomeMusicDiscs.MOD_NAME + "] Items Initialized" );
    }
}