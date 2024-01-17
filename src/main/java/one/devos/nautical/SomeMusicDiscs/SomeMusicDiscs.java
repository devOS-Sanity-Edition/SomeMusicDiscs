package one.devos.nautical.SomeMusicDiscs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.SomeMusicDiscs.common.Items;
import one.devos.nautical.SomeMusicDiscs.common.Music;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static one.devos.nautical.SomeMusicDiscs.common.Items.DISC_BOMBS_AND_BASS;

public class SomeMusicDiscs implements ModInitializer {
    public static final String MOD_ID = "somemusicdiscs";

    public static final Logger LOGGER = LogManager.getLogger("SomeMusicDiscs");

    public static final ResourceKey<CreativeModeTab> ITEM_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "somemusicdiscs.tab"));
    public static final CreativeModeTab DISCS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(DISC_BOMBS_AND_BASS))
            .title(Component.translatable("itemGroup.somemusicdiscs.somemusicdiscs"))
            .build();

    @Override
    public void onInitialize() {
        Items.init();
        Music.init();

        LOGGER.info("[SomeMusicDiscs] Version 1.4.1 loaded." );
        LOGGER.info("[SomeMusicDiscs] Either get your ears ready for pleasure, or pain.");
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP, DISCS);
    }
}
