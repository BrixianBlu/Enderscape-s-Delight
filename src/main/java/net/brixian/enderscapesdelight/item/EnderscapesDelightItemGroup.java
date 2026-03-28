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

                        entries.add(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
                        entries.add(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
                        entries.add(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
                        entries.add(EnderscapeDelightItems.DRIFTER_TENTACLES);
                        entries.add(EnderscapeDelightItems.RUSTLE_SLICE);
                        entries.add(EnderscapeDelightItems.COOKED_RUSTLE_SLICE);
                        entries.add(EnderscapeDelightItems.GLAZED_FLANGERBERRY);
                        entries.add(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY);
                        entries.add(EnderscapeDelightItems.FLANGERBERRY_COBBLER);
                        entries.add(EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI);
                        entries.add(EnderscapeDelightItems.DRIFT_JELLY_SANDWICH);
                        entries.add(EnderscapeDelightItems.DRIFT_THUMB_COOKIE);
                        entries.add(EnderscapeDelightItems.DRIFTER_KEBAB);
                        entries.add(EnderscapeDelightItems.MURUBLIGHT_SOUP);
                        entries.add(EnderscapeDelightItems.RUSTLE_SOUP);
                        entries.add(EnderscapeDelightItems.SUBMERGED_TENTACLES);
                        entries.add(EnderscapeDelightItems.HATRED_SOUP);
                        entries.add(EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT);
                        entries.add(EnderscapeDelightItems.VEILED_CHIPS);
                        entries.add(EnderscapeDelightItems.MAGNIA_POPS);
                    }).build());
    public static void registerItemGroups() {
        EnderscapesDelight.LOGGER.info("Registering Item Groups for " + EnderscapesDelight.MOD_ID);
    }
}
