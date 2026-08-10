package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import vectorwing.farmersdelight.common.registry.ModBlocks;

public class ModelDatagen extends FabricModelProvider {

    public ModelDatagen(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.family(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                .stairs(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS)
                .slab(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB)
                .wall(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);
        blockModelGenerators.family(EnderscapeDelightBlocks.RUBBLE_BRICKS)
                .stairs(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS)
                .slab(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB)
                .wall(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);
        blockModelGenerators.family(EnderscapeDelightBlocks.DUSK_RUBBLE)
                .stairs(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS)
                .slab(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB)
                .wall(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);
        blockModelGenerators.family(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS)
                .stairs(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS)
                .slab(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB)
                .wall(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFTER_TENTACLES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.RUSTLE_SLICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.COOKED_RUSTLE_SLICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.GLAZED_FLANGERBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFT_JELLY_SANDWICH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFTER_KEBAB, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFT_THUMB_COOKIE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.RUSTLE_SOUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.MURUBLIGHT_SOUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.SUBMERGED_TENTACLES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.MAGNIA_POPS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.VEILED_CHIPS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.HATRED_SOUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.RUBBLEMITE_ESCARGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFT_GELATIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.ENDER_ESCAPE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.STUFFED_FLANGER_BERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.BLINKING_PUNCH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.ENLIGHTENED_PUNCH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.DRIFT_GUMMY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EnderscapeDelightItems.CHORUS_CAKE_ROLL_SLICE, ModelTemplates.FLAT_ITEM);
    }
}
