package net.brixian.enderscapesdelight.item;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class EnderscapeDelightItems {
    public static final Item DRIFTER_TENTACLES = registerItem("drifter_tentacles", Item::new);
    public static final Item RUSTLE_SLICE = registerItem("rustle_slime", Item::new);
    public static final Item COOKED_RUSTLE_SLICE = registerItem("cooked_rustle_slime", Item::new);
    public static final Item GLAZED_FLANGERBERRY = registerItem("glazed_flangerberry", Item::new);
    public static final Item DOUBLE_GLAZED_FLANGERBERRY = registerItem("double_glazed_flangerberry", Item::new);
    public static final Item FLANGERBERRY_COBBLER = registerItem("flangerberry_cobbler", Item::new);
    public static final Item DRIFTER_TENTACLE_SPAGHETTI = registerItem("drifter_tentacle_spaghetti", Item::new);
    public static final Item DRIFT_JELLY_SANDWICH = registerItem("drift_jelly_sandwich", Item::new);
    public static final Item DRIFTER_KEBAB = registerItem("drifter_kebab", Item::new);
    public static final Item DRIFT_THUMB_COOKIE = registerItem("drift_thumb_cookie", Item::new);
    public static final Item SHADOLINED_CHORUS_FRUIT = registerItem("shadowlined_chorus_fruit", Item::new);
    public static final Item RUSTLE_SOUP = registerItem("rustle_soup", Item::new);
    public static final Item MURUBLIGHT_SOUP = registerItem("murublight_soup", Item::new);
    public static final Item SUBMERGED_TENTACLES = registerItem("submerged_tentacles", Item::new);
    public static final Item VEILED_CHIPS = registerItem("veiled_chips", Item::new);
    public static final Item HATRED_SOUP = registerItem("hatred_soup", Item::new);



    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name)))));
    }

    public static void registerEDItems() {
        EnderscapesDelight.LOGGER.info("Registering Mod Items for " + EnderscapesDelight.MOD_ID);
    }
}
