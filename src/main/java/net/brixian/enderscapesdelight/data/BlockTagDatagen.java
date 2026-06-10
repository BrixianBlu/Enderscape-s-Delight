package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagDatagen extends FabricTagProvider.BlockTagProvider {
    public BlockTagDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE)
                .add(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE)
                .add(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE)
                .add(EnderscapeDelightBlocks.CELESTIAL_CABINET)
                .add(EnderscapeDelightBlocks.MURUBLIGHT_CABINET)
                .add(EnderscapeDelightBlocks.VEILED_CABINET);

        valueLookupBuilder(BlockTags.WALLS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);
        valueLookupBuilder(BlockTags.STAIRS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
        valueLookupBuilder(BlockTags.SLABS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB)
                .add(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB)
                .add(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB)
                .add(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
    }
}
