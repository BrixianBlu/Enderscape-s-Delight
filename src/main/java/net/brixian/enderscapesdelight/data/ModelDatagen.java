package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModelDatagen extends FabricModelProvider {
    public ModelDatagen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool RubbleChitinBlocks = blockStateModelGenerator.registerCubeAllModelTexturePool(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
        BlockStateModelGenerator.BlockTexturePool RubbleBrickBlocks = blockStateModelGenerator.registerCubeAllModelTexturePool(EnderscapeDelightBlocks.RUBBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool DuskRubbleBlocks = blockStateModelGenerator.registerCubeAllModelTexturePool(EnderscapeDelightBlocks.DUSK_RUBBLE);
        BlockStateModelGenerator.BlockTexturePool DuskRubbleBricksBlocks = blockStateModelGenerator.registerCubeAllModelTexturePool(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);

        RubbleChitinBlocks.stairs(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS);
        RubbleChitinBlocks.wall(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);
        RubbleChitinBlocks.slab(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB);
        RubbleBrickBlocks.stairs(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS);
        RubbleBrickBlocks.wall(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);
        RubbleBrickBlocks.slab(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
        DuskRubbleBlocks.stairs(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
        DuskRubbleBlocks.wall(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);
        DuskRubbleBlocks.slab(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB);
        DuskRubbleBricksBlocks.stairs(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS);
        DuskRubbleBricksBlocks.wall(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);
        DuskRubbleBricksBlocks.slab(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EnderscapeDelightItems.DRIFTER_TENTACLES, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.RUSTLE_SLICE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.COOKED_RUSTLE_SLICE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.GLAZED_FLANGERBERRY, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DRIFT_GELATIN, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DRIFT_JELLY_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DRIFT_THUMB_COOKIE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DRIFTER_KEBAB, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.MURUBLIGHT_SOUP, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.RUSTLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.SUBMERGED_TENTACLES, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.VEILED_CHIPS, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.HATRED_SOUP, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.MAGNIA_POPS, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.MYSTERY_NUGGET, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.ENDER_ESCAPE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.RUBBLEMITE_ESCARGOT, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.RUBBLE_PLATE, Models.GENERATED);
    }
}
