package net.brixian.enderscapesdelight.item;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EnderscapesDelightItemGroup {
    public static final ItemGroup ENDERSCAPES_DELIGHT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EnderscapesDelight.MOD_ID, "enderscapes_delight_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EnderscapeDelightItems.DRIFTER_KEBAB))
                    .displayName(Text.translatable("itemgroup.enderscapes-delight.enderscapes_delight_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_BRICKS);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
                        entries.add(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB);
                        entries.add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);
                        entries.add(EnderscapeDelightBlocks.CELESTIAL_CABINET);
                        entries.add(EnderscapeDelightBlocks.MURUBLIGHT_CABINET);
                        entries.add(EnderscapeDelightBlocks.VEILED_CABINET);
                        entries.add(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
                        entries.add(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
                        entries.add(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
                        entries.add(EnderscapeDelightItems.DRIFTER_TENTACLES);
                        entries.add(EnderscapeDelightItems.RUSTLE_SLICE);
                        entries.add(EnderscapeDelightItems.COOKED_RUSTLE_SLICE);
                        entries.add(EnderscapeDelightItems.GLAZED_FLANGERBERRY);
                        entries.add(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY);
                        entries.add(EnderscapeDelightItems.DRIFT_GELATIN);
                        entries.add(EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI);
                        entries.add(EnderscapeDelightItems.DRIFT_JELLY_SANDWICH);
                        entries.add(EnderscapeDelightItems.DRIFT_THUMB_COOKIE);
                        entries.add(EnderscapeDelightItems.DRIFTER_KEBAB);
                        entries.add(EnderscapeDelightItems.MURUBLIGHT_SOUP);
                        entries.add(EnderscapeDelightItems.RUSTLE_SOUP);
                        entries.add(EnderscapeDelightItems.SUBMERGED_TENTACLES);
                        entries.add(EnderscapeDelightItems.RUBBLEMITE_ESCARGOT);
                        entries.add(EnderscapeDelightItems.ENDER_ESCAPE);
                        entries.add(EnderscapeDelightItems.HATRED_SOUP);
                        entries.add(EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT);
                        entries.add(EnderscapeDelightItems.VEILED_CHIPS);
                        entries.add(EnderscapeDelightItems.MAGNIA_POPS);
                        entries.add(EnderscapeDelightBlocks.STUFFED_FLANGER_BERRY_BLOCK);
                        entries.add(EnderscapeDelightItems.STUFFED_FLANGER_BERRY);
                    }).build());
    public static void registerItemGroups() {
        EnderscapesDelight.LOGGER.info("Registering Item Groups for " + EnderscapesDelight.MOD_ID);
    }
}
