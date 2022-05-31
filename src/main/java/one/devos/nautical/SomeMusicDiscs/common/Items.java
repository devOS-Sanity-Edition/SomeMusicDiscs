package one.devos.nautical.SomeMusicDiscs.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs;

public class Items {
    private static final Item.Properties ITEM_PROPERTIES = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC);

    public static final Item DISC_BOMBS_AND_BASS = register("bombs_and_bass", new DiscItem(14, Music.SOUND_BOMBS_AND_BASS, ITEM_PROPERTIES));
    public static final Item DISC_TRIAL1 = register("trial1", new DiscItem(14, Music.SOUND_TRIAL1, ITEM_PROPERTIES));
    public static final Item DISC_TRILLBIT = register("trillbit", new DiscItem(14, Music.SOUND_TRILLBIT, ITEM_PROPERTIES));

    public static final Item DISC_AUTOTUNED_SPANISH_FLEA = register("autotuned_spanish_flea", new DiscItem(14, Music.SOUND_AUTOTUNED_SPANISH_FLEA, ITEM_PROPERTIES));
    public static final Item DISC_YAKETY_SAX = register("yakety_sax", new DiscItem(14, Music.SOUND_YAKETY_SAX, ITEM_PROPERTIES));

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(SomeMusicDiscs.MOD_ID, name), item);
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[" + SomeMusicDiscs.MOD_NAME + "] Items Initialized" );
    }
}