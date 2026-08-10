package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.Nullable;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagDatagen extends FabricTagsProvider.ItemTagsProvider {

    public ItemTagDatagen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.MEAT)
                .add(EnderscapeDelightItems.getRK(EnderscapeDelightItems.COOKED_RUSTLE_SLICE))
                .add(EnderscapeDelightItems.getRK(EnderscapeDelightItems.DRIFTER_TENTACLES))
                .add(EnderscapeDelightItems.getRK(EnderscapeDelightItems.RUSTLE_SLICE));
        tag(ItemTags.SULFUR_CUBE_ARCHETYPE_SLOW_BOUNCY);
    }
}
