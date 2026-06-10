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
              createShaped(RecipeCategory.FOOD, EnderscapeDelightItems.ENDER_ESCAPE)
                      .pattern("TCR")
                      .pattern(" S ")
                      .input('S', Items.BOWL)
                      .input('C', Items.CHORUS_FRUIT)
                      .input('T', EnderscapeDelightItems.DRIFTER_TENTACLES)
                      .input('R', EnderscapeDelightItems.COOKED_RUSTLE_SLICE)
                      .criterion(hasItem(EnderscapeDelightItems.DRIFTER_TENTACLES), conditionsFromItem(EnderscapeDelightItems.DRIFTER_TENTACLES))
                      .offerTo(exporter);
              createShaped(RecipeCategory.MISC, EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE)
                      .pattern("CCC")
                      .pattern("CCC")
                      .pattern("CCC")
                      .input('C', Items.CHORUS_FRUIT)
                      .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                      .offerTo(exporter);
              createShaped(RecipeCategory.FOOD, EnderscapeDelightBlocks.FLANGER_BERRY_COBBLER)
                      .pattern("SS")
                      .pattern("SS")
                      .input('S', EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE)
                      .criterion(hasItem(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE), conditionsFromItem(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE))
                      .offerTo(exporter);

              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS, 4)
                      .pattern("RR ")
                      .pattern("RR ")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB, 6)
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS, 4)
                      .pattern("R  ")
                      .pattern("RR ")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL, 6)
                      .pattern("RRR")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .offerTo(exporter);

              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB, 6)
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS, 4)
                      .pattern("R  ")
                      .pattern("RR ")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL, 6)
                      .pattern("RRR")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                      .offerTo(exporter);

              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS, 4)
                      .pattern("RR ")
                      .pattern("RR ")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB, 6)
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS, 4)
                      .pattern("R  ")
                      .pattern("RR ")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_WALL, 6)
                      .pattern("RRR")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE))
                      .offerTo(exporter);

              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB, 6)
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS, 4)
                      .pattern("R  ")
                      .pattern("RR ")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                      .offerTo(exporter);
              createShaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL, 6)
                      .pattern("RRR")
                      .pattern("RRR")
                      .input('R', EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS)
                      .criterion(hasItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS), conditionsFromItem(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                      .offerTo(exporter);
          }
      };
    }

    @Override
    public String getName() {
        return "";
    }
}
