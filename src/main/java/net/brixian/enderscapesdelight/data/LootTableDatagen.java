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
        addDrop(EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
        addDrop(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
        addDrop(EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
    }
}
