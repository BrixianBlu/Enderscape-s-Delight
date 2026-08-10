package net.brixian.enderscapesdelight.block;

import net.brixian.enderscapesdelight.EnderscapesDelight;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.penumbra.enderscape.block.MagniaBlock;
import net.penumbra.enderscape.block.properties.MagniaPolarity;
import net.penumbra.enderscape.registry.item.EnderscapeItems;
import vectorwing.farmersdelight.common.block.FeastBlock;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Function;

public class EnderscapeDelightBlocks {
    //Crates
    public static final Block CHORUS_FRUIT_CRATE = registerBlock("chorus_fruit_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), Block.Properties.of());
    public static final Block FLANGER_BERRY_CRATE = registerBlock("flanger_berry_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), Block.Properties.of());
    public static final Block MURUBLIGHT_BRACKET_CRATE = registerBlock("murublight_bracket_crate",
            properties -> new Block(properties.strength(2f, 3f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), Block.Properties.of());

    //Rubble Chitin Blockset
    public static final Block RUBBLE_CHITIN_BLOCK = registerBlock("rubble_chitin_block",
            properties -> new Block(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_CHITIN_SLAB = registerBlock("rubble_chitin_slab",
            properties -> new SlabBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_CHITIN_STAIRS = registerBlock("rubble_chitin_stairs",
            properties -> new StairBlock(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK.defaultBlockState(), properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_CHITIN_WALL = registerBlock("rubble_chitin_wall",
            properties -> new WallBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_BRICKS = registerBlock("rubble_bricks", properties -> new Block(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_BRICKS_SLAB = registerBlock("rubble_bricks_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_BRICKS_STAIRS = registerBlock("rubble_bricks_stairs", properties -> new StairBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.defaultBlockState(), properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_BRICKS_WALL = registerBlock("rubble_bricks_wall", properties -> new WallBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_BRICKS = registerBlock("dusk_rubble_bricks", properties -> new Block(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_BRICKS_SLAB = registerBlock("dusk_rubble_bricks_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_BRICKS_STAIRS = registerBlock("dusk_rubble_bricks_stairs", properties -> new StairBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.defaultBlockState(), properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_BRICKS_WALL = registerBlock("dusk_rubble_bricks_wall", properties -> new WallBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE = registerBlock("dusk_rubble", properties -> new Block(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_SLAB = registerBlock("dusk_rubble_slab", properties -> new SlabBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_STAIRS = registerBlock("dusk_rubble_stairs", properties -> new StairBlock(EnderscapeDelightBlocks.RUBBLE_BRICKS.defaultBlockState(), properties.strength(2f, 3f)), Block.Properties.of());
    public static Block DUSK_RUBBLE_WALL = registerBlock("dusk_rubble_wall", properties -> new WallBlock(properties.strength(2f, 3f)), Block.Properties.of());
    public static Block RUBBLE_LANTERN = registerBlock("rubble_lantern", properties -> new Block(properties.strength(2f, 3f).lightLevel(state -> 15)), BlockBehaviour.Properties.of());
    //Cabinets
    public static Block CELESTIAL_CABINET = registerBlock("celestial_cabinet", CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
    public static Block MURUBLIGHT_CABINET = registerBlock("murublight_cabinet", CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
    public static Block VEILED_CABINET = registerBlock("veiled_cabinet", CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));

    //Feasts and Pies
    public static Block FLANGER_BERRY_COBBLER = registerBlock("flanger_berry_cobbler", properties -> new PieBlock(properties, () -> EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE), Block.Properties.of());
    public static Block STUFFED_FLANGER_BERRY_BLOCK = registerBlock("stuffed_flanger_berry_block", properties ->  new FeastBlock(properties, () -> (Item) EnderscapeDelightItems.STUFFED_FLANGER_BERRY, false), Block.Properties.ofFullCopy(Blocks.CAKE));

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        EnderscapesDelight.LOGGER.info("Registering Mod Blocks for " + EnderscapesDelight.MOD_ID);
    }
}