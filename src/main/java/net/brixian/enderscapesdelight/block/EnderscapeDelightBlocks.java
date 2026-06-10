package net.brixian.enderscapesdelight.block;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.block.FeastBlock;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Function;

public class EnderscapeDelightBlocks {
    //Crates
    public static final Block CHORUS_FRUIT_CRATE = registerBlock("chorus_fruit_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)), AbstractBlock.Settings.create());
    public static final Block FLANGER_BERRY_CRATE = registerBlock("flanger_berry_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)), AbstractBlock.Settings.create());
    public static final Block MURUBLIGHT_BRACKET_CRATE = registerBlock("murublight_bracket_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)), AbstractBlock.Settings.create());

    //Rubble Chitin Blockset
    public static final Block RUBBLE_CHITIN_BLOCK = registerBlock("rubble_chitin_block",
            properties -> new Block(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_CHITIN_SLAB = registerBlock("rubble_chitin_slab",
            properties -> new SlabBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_CHITIN_STAIRS = registerBlock("rubble_chitin_stairs",
            properties -> new StairsBlock(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK.getDefaultState(), properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_CHITIN_WALL = registerBlock("rubble_chitin_wall",
            properties -> new WallBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_BRICKS = registerBlock("rubble_bricks", properties -> new Block(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_BRICKS_SLAB = registerBlock("rubble_bricks_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_BRICKS_STAIRS = registerBlock("rubble_bricks_stairs", properties -> new StairsBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.getDefaultState(), properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block RUBBLE_BRICKS_WALL = registerBlock("rubble_bricks_wall", properties -> new WallBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_BRICKS = registerBlock("dusk_rubble_bricks", properties -> new Block(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_BRICKS_SLAB = registerBlock("dusk_rubble_bricks_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_BRICKS_STAIRS = registerBlock("dusk_rubble_bricks_stairs", properties -> new StairsBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.getDefaultState(), properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_BRICKS_WALL = registerBlock("dusk_rubble_bricks_wall", properties -> new WallBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE = registerBlock("dusk_rubble", properties -> new Block(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_SLAB = registerBlock("dusk_rubble_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_STAIRS = registerBlock("dusk_rubble_stairs", properties -> new StairsBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.getDefaultState(), properties.strength(2f, 3f)), AbstractBlock.Settings.create());
    public static Block DUSK_RUBBLE_WALL = registerBlock("dusk_rubble_wall", properties -> new WallBlock(properties.strength(2f, 3f)), AbstractBlock.Settings.create());

    //Cabinets
    public static Block CELESTIAL_CABINET = registerBlock("celestial_cabinet", CabinetBlock::new, AbstractBlock.Settings.copy(Blocks.BARREL));
    public static Block MURUBLIGHT_CABINET = registerBlock("murublight_cabinet", CabinetBlock::new, AbstractBlock.Settings.copy(Blocks.BARREL));
    public static Block VEILED_CABINET = registerBlock("veiled_cabinet", CabinetBlock::new, AbstractBlock.Settings.copy(Blocks.BARREL));

    //Feasts and Pies
    public static Block FLANGER_BERRY_COBBLER = registerBlock("flanger_berry_cobbler", properties -> new PieBlock(properties, () -> EnderscapeDelightItems.DRIFTER_KEBAB), AbstractBlock.Settings.create());
    public static Block STUFFED_FLANGER_BERRY_BLOCK = registerBlock("stuffed_flanger_berry_block", properties ->  new FeastBlock(properties, () -> (Item) EnderscapeDelightItems.STUFFED_FLANGER_BERRY, false), AbstractBlock.Settings.copy(Blocks.CAKE));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
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

