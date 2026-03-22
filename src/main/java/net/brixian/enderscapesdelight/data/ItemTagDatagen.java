package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagDatagen extends FabricTagProvider.ItemTagProvider {
    public ItemTagDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.MEAT)
                .add(EnderscapeDelightItems.COOKED_RUSTLE_SLICE)
                .add(EnderscapeDelightItems.DRIFTER_TENTACLES)
                .add(EnderscapeDelightItems.RUSTLE_SLICE);

    }
}
