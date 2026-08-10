package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.BlockTags;
import net.penumbra.enderscape.registry.tag.EnderscapeBlockTags;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagDatagen extends FabricTagsProvider.BlockTagsProvider {
    public BlockTagDatagen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.CELESTIAL_CABINET))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.VEILED_CABINET))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.MURUBLIGHT_CABINET));

        tag(BlockTags.WALLS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL));
        tag(BlockTags.STAIRS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS));
        tag(BlockTags.SLABS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB));
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB));
        tag(EnderscapeBlockTags.VOID_FIRE_BASE_BLOCKS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE))
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.MURUBLIGHT_CABINET));
        tag(EnderscapeBlockTags.CELESTIAL_WOOD_BLOCKS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.CELESTIAL_CABINET));
        tag(EnderscapeBlockTags.MURUBLIGHT_WOOD_BLOCKS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.MURUBLIGHT_CABINET));
        tag(EnderscapeBlockTags.VEILED_WOOD_BLOCKS)
                .add(EnderscapeDelightBlocks.getRK(EnderscapeDelightBlocks.VEILED_CABINET));


    }
}
