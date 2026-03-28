package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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
                .add(EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);
    }
}
