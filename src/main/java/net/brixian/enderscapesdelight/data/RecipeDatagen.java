package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeDatagen extends FabricRecipeProvider {
    public RecipeDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
      return new RecipeGenerator(wrapperLookup, recipeExporter) {
          @Override
          public void generate() {
              List<ItemConvertible> RUSTLE_SLICE_COOK = List.of(EnderscapeDelightItems.RUSTLE_SLICE);
              offerSmelting(RUSTLE_SLICE_COOK, RecipeCategory.FOOD, EnderscapeDelightItems.COOKED_RUSTLE_SLICE, 0.25f, 200, "cooked_rustle_slice");

              createShaped(RecipeCategory.FOOD, EnderscapeDelightItems.DRIFTER_KEBAB)
                      .pattern("  T")
                      .pattern(" C ")
                      .pattern("S  ")
                      .input('S', Items.STICK)
                      .input('C', Items.CHORUS_FRUIT)
                      .input('T', EnderscapeDelightItems.DRIFTER_TENTACLES)
                      .criterion(hasItem(EnderscapeDelightItems.DRIFTER_TENTACLES), conditionsFromItem(EnderscapeDelightItems.DRIFTER_TENTACLES))
                      .offerTo(exporter);
              createShaped(RecipeCategory.MISC, EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE)
                      .pattern("CCC")
                      .pattern("CCC")
                      .pattern("CCC")
                      .input('C', Items.CHORUS_FRUIT)
                      .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                      .offerTo(exporter);


          }
      };
    }

    @Override
    public String getName() {
        return "";
    }
}
