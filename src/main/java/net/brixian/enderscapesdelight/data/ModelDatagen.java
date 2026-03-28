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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EnderscapeDelightItems.DRIFTER_TENTACLES, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.RUSTLE_SLICE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.COOKED_RUSTLE_SLICE, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.GLAZED_FLANGERBERRY, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY, Models.GENERATED);
        itemModelGenerator.register(EnderscapeDelightItems.FLANGERBERRY_COBBLER, Models.GENERATED);
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


    }
}
