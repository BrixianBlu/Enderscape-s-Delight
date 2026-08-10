package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LootTableDatagen extends FabricBlockLootSubProvider {

    public LootTableDatagen(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
        dropSelf(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
        dropSelf(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
        dropSelf(EnderscapeDelightBlocks.MURUBLIGHT_CABINET);
        dropSelf(EnderscapeDelightBlocks.CELESTIAL_CABINET);
        dropSelf(EnderscapeDelightBlocks.VEILED_CABINET);

        dropSelf(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);

        dropSelf(EnderscapeDelightBlocks.RUBBLE_BRICKS);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
        dropSelf(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);

        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);

        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB);
        dropSelf(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);
    }
}
