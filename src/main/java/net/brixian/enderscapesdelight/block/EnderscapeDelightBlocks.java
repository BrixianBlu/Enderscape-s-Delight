package net.brixian.enderscapesdelight.block;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class EnderscapeDelightBlocks {
    public static final Block CHORUS_FRUIT_CRATE = registerBlock("chorus_fruit_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block FLANGER_BERRY_CRATE = registerBlock("flanger_berry_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MURUBLIGHT_BRACKET_CRATE = registerBlock("murublight_bracket_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));




    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(EnderscapesDelight.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(EnderscapesDelight.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EnderscapesDelight.MOD_ID, name)))));
    }

    public static void registerEDBlocks() {
        EnderscapesDelight.LOGGER.info("Registering Mod Blocks for " + EnderscapesDelight.MOD_ID);
    }
}

