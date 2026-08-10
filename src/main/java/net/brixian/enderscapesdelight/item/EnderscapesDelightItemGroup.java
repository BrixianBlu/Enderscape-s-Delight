package net.brixian.enderscapesdelight.item;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;

public class EnderscapesDelightItemGroup {
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, "enderscapes_delight_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(EnderscapeDelightItems.DRIFTER_KEBAB))
                    .title(Component.translatable("itemgroup.enderscapes-delight.enderscapes_delight_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_BRICKS);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB);
                        output.accept(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);
                        output.accept(EnderscapeDelightBlocks.RUBBLE_LANTERN);
                        output.accept(EnderscapeDelightBlocks.CELESTIAL_CABINET);
                        output.accept(EnderscapeDelightBlocks.MURUBLIGHT_CABINET);
                        output.accept(EnderscapeDelightBlocks.VEILED_CABINET);
                        output.accept(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
                        output.accept(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
                        output.accept(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
                        output.accept(EnderscapeDelightItems.DRIFTER_TENTACLES);
                        output.accept(EnderscapeDelightItems.RUSTLE_SLICE);
                        output.accept(EnderscapeDelightItems.COOKED_RUSTLE_SLICE);
                        output.accept(EnderscapeDelightItems.GLAZED_FLANGERBERRY);
                        output.accept(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY);
                        output.accept(EnderscapeDelightItems.DRIFT_GELATIN);
                        output.accept(EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI);
                        output.accept(EnderscapeDelightItems.DRIFT_JELLY_SANDWICH);
                        output.accept(EnderscapeDelightItems.DRIFT_THUMB_COOKIE);
                        output.accept(EnderscapeDelightItems.DRIFTER_KEBAB);
                        output.accept(EnderscapeDelightItems.MURUBLIGHT_SOUP);
                        output.accept(EnderscapeDelightItems.RUSTLE_SOUP);
                        output.accept(EnderscapeDelightItems.SUBMERGED_TENTACLES);
                        output.accept(EnderscapeDelightItems.RUBBLEMITE_ESCARGOT);
                        output.accept(EnderscapeDelightItems.ENDER_ESCAPE);
                        output.accept(EnderscapeDelightItems.HATRED_SOUP);
                        output.accept(EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT);
                        output.accept(EnderscapeDelightItems.BLINKING_PUNCH);
                        output.accept(EnderscapeDelightItems.ENLIGHTENED_PUNCH);
                        output.accept(EnderscapeDelightItems.VEILED_CHIPS);
                        output.accept(EnderscapeDelightItems.MAGNIA_POPS);
                        output.accept(EnderscapeDelightItems.DRIFT_GUMMY);
                        output.accept(EnderscapeDelightBlocks.FLANGER_BERRY_COBBLER);
                        output.accept(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE);
                        output.accept(EnderscapeDelightItems.CHORUS_CAKE_ROLL_SLICE);
                        output.accept(EnderscapeDelightBlocks.STUFFED_FLANGER_BERRY_BLOCK);
                        output.accept(EnderscapeDelightItems.STUFFED_FLANGER_BERRY);
                    }).build());

    public static void registerEDModCreativeModeTabs() {
        EnderscapesDelight.LOGGER.info("Registering Creative Mode Tabs for " + EnderscapesDelight.MOD_ID);
    }
}