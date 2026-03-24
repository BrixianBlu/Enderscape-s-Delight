package net.brixian.enderscapesdelight.item;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class EnderscapeDelightItems {
    public static final Item DRIFTER_TENTACLES = registerItem("drifter_tentacles", setting -> new Item(setting.food(EnderscapeDelightFood.DRIFTER_TENTACLES)));
    public static final Item RUSTLE_SLICE = registerItem("rustle_slice", settings -> new Item(settings.food(EnderscapeDelightFood.RUSTLE_SLICE, EnderscapeDelightFood.RUSTLE_SLICE_EFFECT)));
    public static final Item COOKED_RUSTLE_SLICE = registerItem("cooked_rustle_slice", settings -> new Item(settings.food(EnderscapeDelightFood.COOKED_RUSTLE_SLICE, EnderscapeDelightFood.COOKED_RUSTLE_SLICE_EFFECT)));
    public static final Item GLAZED_FLANGERBERRY = registerItem("glazed_flanger_berry", settings -> new Item(settings.food(EnderscapeDelightFood.GLAZED_FLANGERBERRY)));
    public static final Item DOUBLE_GLAZED_FLANGERBERRY = registerItem("double_glazed_flanger_berry", settings -> new Item(settings.food(EnderscapeDelightFood.DOUBLE_GLAZED_GLANGERBERRY)));
    public static final Item FLANGERBERRY_COBBLER = registerItem("flanger_berry_cobbler", settings -> new Item(settings.food(EnderscapeDelightFood.FLANGERBERRY_COBBLER)));
    public static final Item DRIFTER_TENTACLE_SPAGHETTI = registerItem("drifter_tentacle_spaghetti",settings -> new Item(settings.food(EnderscapeDelightFood.DRIFT_TENTACLE_SPAGHETTI).maxCount(16).useRemainder(Items.BOWL)));
    public static final Item DRIFT_JELLY_SANDWICH = registerItem("drift_jelly_sandwich", settings -> new Item(settings.food(EnderscapeDelightFood.DRIFT_JELLY_SANDWICH, EnderscapeDelightFood.DRIFT_JELLY_SANDWICH_EFFECT)));
    public static final Item DRIFTER_KEBAB = registerItem("drifter_kebab", settings -> new Item(settings.food(EnderscapeDelightFood.DRIFTER_KEBAB, EnderscapeDelightFood.DRIFTER_KEBAB_EFFECT).useRemainder(Items.STICK)));
    public static final Item DRIFT_THUMB_COOKIE = registerItem("drift_thumb_cookie", settings -> new Item(settings.food(EnderscapeDelightFood.DRIFT_JELLY_THUMB_COOKIE)));
    public static final Item SHADOLINED_CHORUS_FRUIT = registerItem("shadolined_chorus_fruit", settings -> new Item(settings.food(EnderscapeDelightFood.SHADOWLINED_CHORUS_FRUIT, EnderscapeDelightFood.SHADOWLINED_CHORUS_FRUIT_EFFECT)));
    public static final Item RUSTLE_SOUP = registerItem("rustle_soup", settings -> new Item(settings.food(EnderscapeDelightFood.RUSTLE_SOUP, EnderscapeDelightFood.RUSTLE_SOUP_EFFECT).maxCount(1).useRemainder(Items.BOWL)));
    public static final Item MURUBLIGHT_SOUP = registerItem("murublight_soup", settings -> new Item(settings.food(EnderscapeDelightFood.MURUBLIGHT_SOUP, EnderscapeDelightFood.MURUBLIGHT_SOUP_EFFECT).maxCount(1).useRemainder(Items.BOWL)));
    public static final Item SUBMERGED_TENTACLES = registerItem("submerged_tentacles", settings -> new Item(settings.food(EnderscapeDelightFood.SUBMERGED_TENTACLES).maxCount(1)));
    public static final Item MAGNIA_POPS = registerItem("magnia_pops", settings -> new Item(settings.food(EnderscapeDelightFood.MAGNIA_POPS, EnderscapeDelightFood.MAGNIA_POPS_EFFECT)));
    public static final Item VEILED_CHIPS = registerItem("veiled_chips", settings -> new Item(settings.food(EnderscapeDelightFood.VEILED_CHIPS, EnderscapeDelightFood.VEILED_CHIPS_EFFECT)));
    public static final Item HATRED_SOUP = registerItem("hatred_soup", settings -> new Item(settings.food(EnderscapeDelightFood.HATRED_SOUP, EnderscapeDelightFood.HATRED_SOUP_EFFECT).maxCount(1).useRemainder(Items.BOWL)));



    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name)))));
    }

    public static void registerEDItems() {
        EnderscapesDelight.LOGGER.info("Registering Mod Items for " + EnderscapesDelight.MOD_ID);
    }
}
