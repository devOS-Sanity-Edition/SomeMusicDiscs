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

    private static final Item.Properties ITEM_PROPERTIES = new Item.Properties().stacksTo(1).tab(SOMEMUSICDISCS_ITEM_GROUP);

    // Carter
    public static final Item DISC_BOMBS_AND_BASS = register("bombs_and_bass", new DiscItem(14, Music.SOUND_BOMBS_AND_BASS, ITEM_PROPERTIES));
    public static final Item DISC_TRIAL1 = register("trial1", new DiscItem(14, Music.SOUND_TRIAL1, ITEM_PROPERTIES));
    public static final Item DISC_TRILLBIT = register("trillbit", new DiscItem(14, Music.SOUND_TRILLBIT, ITEM_PROPERTIES));

    // Cursed
    public static final Item DISC_AUTOTUNED_SPANISH_FLEA = register("autotuned_spanish_flea", new DiscItem(14, Music.SOUND_AUTOTUNED_SPANISH_FLEA, ITEM_PROPERTIES));
    public static final Item DISC_YAKETY_SAX = register("yakety_sax", new DiscItem(14, Music.SOUND_YAKETY_SAX, ITEM_PROPERTIES));

    // G4
    public static final Item DISC_G4_EASY = register("g4_easy", new DiscItem(14, Music.SOUND_G4_EASY, ITEM_PROPERTIES));
    public static final Item DISC_G4_NORMAL = register("g4_normal", new DiscItem(14, Music.SOUND_G4_NORMAL, ITEM_PROPERTIES));
    public static final Item DISC_G4_HARD = register("g4_hard", new DiscItem(14, Music.SOUND_G4_HARD, ITEM_PROPERTIES));
    public static final Item DISC_G4_HELL = register("g4_hell", new DiscItem(14, Music.SOUND_G4_HELL, ITEM_PROPERTIES));
    public static final Item DISC_G4_HADES = register("g4_hades", new DiscItem(14, Music.SOUND_G4_HADES, ITEM_PROPERTIES));
    public static final Item DISC_G4_CHAOS = register("g4_chaos", new DiscItem(14, Music.SOUND_G4_CHAOS, ITEM_PROPERTIES));
    public static final Item DISC_G4_REVERSE = register("g4_reverse", new DiscItem(14, Music.SOUND_G4_REVERSE, ITEM_PROPERTIES));
    public static final Item DISC_G4_NOX = register("g4_nox", new DiscItem(14, Music.SOUND_G4_NOX, ITEM_PROPERTIES));
    public static final Item DISC_G4_POLAR = register("g4_polar", new DiscItem(14, Music.SOUND_G4_POLAR, ITEM_PROPERTIES));
    public static final Item DISC_G4_SHOOK = register("g4_shook", new DiscItem(14, Music.SOUND_G4_SHOOK, ITEM_PROPERTIES));

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(SomeMusicDiscs.MOD_ID, name), item);
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[" + SomeMusicDiscs.MOD_NAME + "] Items Initialized" );
    }
}