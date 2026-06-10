package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableDatagen extends FabricBlockLootTableProvider {
    public LootTableDatagen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
        addDrop(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
        addDrop(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
        addDrop(EnderscapeDelightBlocks.MURUBLIGHT_CABINET);
        addDrop(EnderscapeDelightBlocks.CELESTIAL_CABINET);
        addDrop(EnderscapeDelightBlocks.VEILED_CABINET);

        addDrop(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
        addDrop(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS);
        addDrop(EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB);
        addDrop(EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL);

        addDrop(EnderscapeDelightBlocks.RUBBLE_BRICKS);
        addDrop(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS);
        addDrop(EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB);
        addDrop(EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL);

        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_WALL);

        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB);
        addDrop(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL);
    }
}
