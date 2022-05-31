package one.devos.nautical.BadMusicDiscs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import one.devos.nautical.BadMusicDiscs.common.Items;
import one.devos.nautical.BadMusicDiscs.common.Music;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BadMusicDiscs implements ModInitializer {
    public static final String MOD_ID = "badmusicdiscs";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        Items.init();
        Music.init();

        LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded." );
        LOGGER.info("[" + MOD_NAME + "] " + "Either get your ears ready for pleasure, or pain.");
    }
}
