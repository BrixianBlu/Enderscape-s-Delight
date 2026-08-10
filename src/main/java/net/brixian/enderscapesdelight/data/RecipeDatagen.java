package net.brixian.enderscapesdelight.data;

import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.penumbra.enderscape.registry.block.EnderscapeBlocks;
import net.penumbra.enderscape.registry.item.EnderscapeItems;
import net.penumbra.enderscape.registry.tag.EnderscapeBlockTags;
import vectorwing.farmersdelight.common.crafting.CookingPotBookCategory;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeDatagen extends FabricRecipeProvider {


    public RecipeDatagen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {

            @Override
            public void buildRecipes() {
                List<ItemLike> RUSTLE_SMELTABLES = List.of(EnderscapeDelightItems.RUSTLE_SLICE
                );


                oreSmelting(RUSTLE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, EnderscapeDelightItems.COOKED_RUSTLE_SLICE, 0.25f, 200, "cooked_rustle_slice");



                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightBlocks.STUFFED_FLANGER_BERRY_BLOCK, 1, 200, 200, EnderscapeBlocks.RIPE_PURUBERRY_BLOCK)
                        .addIngredient(ModItems.ONION.get())
                        .addIngredient(ModItems.RICE.get())
                        .addIngredient(Items.BROWN_MUSHROOM)
                        .addIngredient(EnderscapeItems.RUBBLE_CHITIN)
                        .addIngredient(Items.POTATO)
                        .addIngredient(Items.CARROT)
                        .unlockedByAnyIngredient(EnderscapeItems.PURUBERRY)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .build(output, String.valueOf(EnderscapeDelightItems.STUFFED_FLANGER_BERRY));
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.DRIFT_GELATIN, 1, 200, 200, Items.BOWL)
                        .addIngredient(Items.WATER_BUCKET)
                        .addIngredient(Items.BONE)
                        .addIngredient(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedByAnyIngredient(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .build(output, EnderscapeDelightItems.DRIFT_GELATIN + "_cooking_recipe" );
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.HATRED_SOUP, 1, 200, 200, Items.BOWL)
                        .addIngredient(EnderscapeItems.NEBULITE_SHARDS)
                        .addIngredient(EnderscapeItems.MURUBLIGHT_BRACKET_ITEM)
                        .addIngredient(EnderscapeItems.VOID_LACHRYMA_BUCKET)
                        .addIngredient(EnderscapeDelightItems.RUSTLE_SLICE)
                        .unlockedByAnyIngredient(EnderscapeItems.VOID_LACHRYMA_BUCKET)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .build(output, EnderscapeDelightItems.HATRED_SOUP + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.MURUBLIGHT_SOUP, 1, 200, 200, Items.BOWL)
                        .addIngredient(EnderscapeItems.MURUBLIGHT_BRACKET_ITEM)
                        .addIngredient(EnderscapeItems.MURUBLIGHT_BRACKET_ITEM)
                        .unlockedByAnyIngredient(EnderscapeItems.MURUBLIGHT_BRACKET_ITEM)
                        .setRecipeBookCategory(CookingPotBookCategory.MISC)
                        .build(output, EnderscapeDelightItems.MURUBLIGHT_SOUP + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.RUBBLEMITE_ESCARGOT, 1, 200, 200, Items.BOWL)
                        .addIngredient(EnderscapeBlocks.KURODITE)
                        .addIngredient(Items.END_STONE)
                        .addIngredient(EnderscapeBlocks.VERADITE)
                        .addIngredient(EnderscapeBlocks.MIRESTONE)
                        .unlockedByAnyIngredient(EnderscapeItems.RUBBLE_CHITIN)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .build(output, EnderscapeDelightItems.RUBBLEMITE_ESCARGOT + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.RUSTLE_SOUP, 1, 200, 200, Items.BOWL)
                        .addIngredient(EnderscapeDelightItems.MURUBLIGHT_SOUP)
                        .addIngredient(EnderscapeDelightItems.COOKED_RUSTLE_SLICE)
                        .unlockedByAnyIngredient(EnderscapeDelightItems.COOKED_RUSTLE_SLICE)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .build(output, EnderscapeDelightItems.RUSTLE_SOUP + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.SUBMERGED_TENTACLES, 1, 200, 200, Items.BOWL)
                        .addIngredient(ModItems.TOMATO.get())
                        .addIngredient(EnderscapeDelightItems.DRIFTER_TENTACLES)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .unlockedByAnyIngredient(EnderscapeDelightItems.DRIFTER_TENTACLES)
                        .build(output, EnderscapeDelightItems.SUBMERGED_TENTACLES + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI, 1, 200, 200, Items.BOWL)
                        .addIngredient(ModItems.TOMATO.get())
                        .addIngredient(EnderscapeDelightItems.DRIFTER_TENTACLES)
                        .addIngredient(EnderscapeItems.MURUBLIGHT_BRACKET_ITEM)
                        .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                        .addIngredient(EnderscapeDelightItems.DRIFTER_TENTACLES)
                        .build(output, EnderscapeDelightItems.DRIFTER_TENTACLE_SPAGHETTI + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.ENLIGHTENED_PUNCH, 1, 200, 200, Items.BOWL)
                        .addIngredient(Items.SUGAR)
                        .addIngredient(EnderscapeBlocks.BULB_FLOWER)
                        .addIngredient(EnderscapeBlocks.BULB_FLOWER)
                        .setRecipeBookCategory(CookingPotBookCategory.DRINKS)
                        .unlockedByAnyIngredient(EnderscapeBlocks.BULB_FLOWER)
                        .build(output, EnderscapeDelightItems.ENLIGHTENED_PUNCH + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.BLINKING_PUNCH, 1, 200, 200, Items.BOWL)
                        .addIngredient(Items.SUGAR)
                        .addIngredient(EnderscapeItems.BLINKLIGHT)
                        .addIngredient(EnderscapeItems.BLINKLIGHT)
                        .unlockedByAnyIngredient(EnderscapeItems.BLINKLIGHT)
                        .setRecipeBookCategory(CookingPotBookCategory.DRINKS)
                        .build(output, EnderscapeDelightItems.BLINKING_PUNCH + "_cooking_recipe");
                CookingPotRecipeBuilder.cookingPotRecipe(BuiltInRegistries.ITEM, EnderscapeDelightItems.DRIFT_GUMMY, 2, 200, 200)
                        .addIngredient(Items.SUGAR)
                        .addIngredient(Items.SUGAR)
                        .addIngredient(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedByAnyIngredient(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .setRecipeBookCategory(CookingPotBookCategory.DRINKS)
                        .build(output, EnderscapeDelightItems.DRIFT_GUMMY + "_cooking_recipe");

                nineBlockStorageRecipes(RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.CHORUS_FRUIT_CRATE);
                nineBlockStorageRecipes(RecipeCategory.MISC, EnderscapeItems.PURUBERRY, RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.FLANGER_BERRY_CRATE);
                nineBlockStorageRecipes(RecipeCategory.MISC, EnderscapeItems.MURUBLIGHT_BRACKET_ITEM, RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.MURUBLIGHT_BRACKET_CRATE);


              stairBuilder(EnderscapeDelightBlocks.RUBBLE_CHITIN_STAIRS, Ingredient.of(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .unlockedBy(getHasName(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), has(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                      .group("rubble_chitin_blocks")
                      .save(output);
                slab(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_SLAB, EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);
                wall(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_WALL, EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK);

                stairBuilder(EnderscapeDelightBlocks.RUBBLE_BRICKS_STAIRS, Ingredient.of(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                        .unlockedBy(getHasName(EnderscapeDelightBlocks.RUBBLE_BRICKS), has(EnderscapeDelightBlocks.RUBBLE_BRICKS))
                        .group("rubble_bricks_blocks")
                        .save(output);
                slab(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS_SLAB, EnderscapeDelightBlocks.RUBBLE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS_WALL, EnderscapeDelightBlocks.RUBBLE_BRICKS);

                stairBuilder(EnderscapeDelightBlocks.DUSK_RUBBLE_STAIRS, Ingredient.of(EnderscapeDelightBlocks.DUSK_RUBBLE))
                        .unlockedBy(getHasName(EnderscapeDelightBlocks.DUSK_RUBBLE), has(EnderscapeDelightBlocks.DUSK_RUBBLE))
                        .group("dusk_rubble_blocks")
                        .save(output);
                slab(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_SLAB, EnderscapeDelightBlocks.DUSK_RUBBLE);
                wall(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_WALL, EnderscapeDelightBlocks.DUSK_RUBBLE);

                stairBuilder(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_STAIRS, Ingredient.of(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                        .unlockedBy(getHasName(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS), has(EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS))
                        .group("dusk_rubble_bricks_blocks")
                        .save(output);
                slab(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_SLAB, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS_WALL, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS);

                shaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                        .pattern("RR ")
                        .pattern("RR ")
                        .define('R', EnderscapeItems.RUBBLE_CHITIN)
                        .unlockedBy(getHasName(EnderscapeItems.RUBBLE_CHITIN), has(EnderscapeItems.RUBBLE_CHITIN))
                        .group("rubble_chitin_blocks")
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_BRICKS, 4)
                        .pattern("RR ")
                        .pattern("RR ")
                        .define('R', EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK)
                        .unlockedBy(getHasName(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK), has(EnderscapeDelightBlocks.RUBBLE_CHITIN_BLOCK))
                        .group("rubble_bricks_blocks")
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE, 4)
                        .pattern("SR ")
                        .pattern("RS ")
                        .define('R', EnderscapeItems.RUBBLE_CHITIN)
                        .define('S', EnderscapeItems.SHADOLINE_INGOT)
                        .unlockedBy(getHasName(EnderscapeItems.RUBBLE_CHITIN), has(EnderscapeItems.RUBBLE_CHITIN))
                        .group("dusk_rubble_blocks")
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.DUSK_RUBBLE_BRICKS, 4)
                        .pattern("DD ")
                        .pattern("DD ")
                        .define('D', EnderscapeDelightBlocks.DUSK_RUBBLE)
                        .unlockedBy(getHasName(EnderscapeDelightBlocks.DUSK_RUBBLE), has(EnderscapeDelightBlocks.DUSK_RUBBLE))
                        .group("dusk_rubble_bricks_blocks")
                        .save(output);

                shaped(RecipeCategory.DECORATIONS, EnderscapeDelightBlocks.CELESTIAL_CABINET)
                        .pattern("PPP")
                        .pattern("T T")
                        .pattern("PPP")
                        .define('P', EnderscapeBlocks.CELESTIAL_PLANKS)
                        .define('T', EnderscapeBlocks.CELESTIAL_TRAPDOOR)
                        .unlockedBy(getHasName(EnderscapeBlocks.CELESTIAL_PLANKS), has(EnderscapeBlocks.CELESTIAL_PLANKS))
                        .group("celestial_cabinet")
                        .save(output);
                shaped(RecipeCategory.DECORATIONS, EnderscapeDelightBlocks.MURUBLIGHT_CABINET)
                        .pattern("PPP")
                        .pattern("T T")
                        .pattern("PPP")
                        .define('P', EnderscapeBlocks.MURUBLIGHT_PLANKS)
                        .define('T', EnderscapeBlocks.MURUBLIGHT_TRAPDOOR)
                        .unlockedBy(getHasName(EnderscapeBlocks.MURUBLIGHT_PLANKS), has(EnderscapeBlocks.MURUBLIGHT_PLANKS))
                        .group("murublight_cabinet")
                        .save(output);
                shaped(RecipeCategory.DECORATIONS, EnderscapeDelightBlocks.VEILED_CABINET)
                        .pattern("PPP")
                        .pattern("T T")
                        .pattern("PPP")
                        .define('P', EnderscapeBlocks.VEILED_PLANKS)
                        .define('T', EnderscapeBlocks.VEILED_TRAPDOOR)
                        .unlockedBy(getHasName(EnderscapeBlocks.VEILED_PLANKS), has(EnderscapeBlocks.VEILED_PLANKS))
                        .group("veiled_cabinet")
                        .save(output);
                shapeless(RecipeCategory.FOOD, EnderscapeDelightItems.DOUBLE_GLAZED_FLANGERBERRY)
                        .requires(EnderscapeDelightItems.GLAZED_FLANGERBERRY)
                        .requires(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedBy(getHasName(EnderscapeDelightItems.GLAZED_FLANGERBERRY), has(EnderscapeDelightItems.GLAZED_FLANGERBERRY))
                        .group("double_glazed_puruberry")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightItems.DRIFT_JELLY_SANDWICH)
                        .pattern(" B ")
                        .pattern(" J ")
                        .pattern(" B ")
                        .define('B', Items.BREAD)
                        .define('J', EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedBy(getHasName(EnderscapeItems.DRIFT_JELLY_BOTTLE), has(EnderscapeItems.DRIFT_JELLY_BOTTLE))
                        .group("drift_jelly_sandwich")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightItems.DRIFT_THUMB_COOKIE)
                        .pattern(" B ")
                        .pattern(" J ")
                        .pattern(" B ")
                        .define('B', Items.WHEAT)
                        .define('J', EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedBy(getHasName(EnderscapeItems.DRIFT_JELLY_BOTTLE), has(EnderscapeItems.DRIFT_JELLY_BOTTLE))
                        .group("drift_thumb_cookie")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightItems.DRIFTER_KEBAB)
                        .pattern("  T")
                        .pattern(" C ")
                        .pattern("S  ")
                        .define('T', EnderscapeDelightItems.DRIFTER_TENTACLES)
                        .define('C', Items.CHORUS_FRUIT)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(EnderscapeDelightItems.DRIFTER_TENTACLES), has(EnderscapeDelightItems.DRIFTER_TENTACLES))
                        .group("drifter_kebab")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightBlocks.FLANGER_BERRY_COBBLER)
                        .pattern(" W ")
                        .pattern("PPP")
                        .pattern("SCS")
                        .define('W', Items.WHEAT)
                        .define('P', EnderscapeItems.PURUBERRY)
                        .define('S', Items.SUGAR)
                        .define('C', ModItems.PIE_CRUST.get())
                        .unlockedBy(getHasName(EnderscapeItems.PURUBERRY), has(EnderscapeItems.PURUBERRY))
                        .group("flanger_berry_cobbler")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightBlocks.FLANGER_BERRY_COBBLER)
                        .pattern("SS ")
                        .pattern("SS ")
                        .define('S', EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE)
                        .unlockedBy(getHasName(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE), has(EnderscapeDelightItems.FLANGER_BERRY_COBBLER_SLICE))
                        .group("flanger_berry_cobbler_unsliced")
                        .save(output, "flanger_berry_cobbler_unsliced");
                shapeless(RecipeCategory.FOOD, EnderscapeDelightItems.GLAZED_FLANGERBERRY)
                        .requires(EnderscapeItems.PURUBERRY)
                        .requires(EnderscapeItems.DRIFT_JELLY_BOTTLE)
                        .unlockedBy(getHasName(EnderscapeItems.PURUBERRY), has(EnderscapeItems.PURUBERRY))
                        .group("glazed_puruberry")
                        .save(output);
                shaped(RecipeCategory.FOOD, EnderscapeDelightItems.SHADOLINED_CHORUS_FRUIT)
                        .pattern("SSS")
                        .pattern("SCS")
                        .pattern("SSS")
                        .define('S', EnderscapeItems.SHADOLINE_INGOT)
                        .define('C', Items.CHORUS_FRUIT)
                        .unlockedBy(getHasName(EnderscapeItems.SHADOLINE_INGOT), has(EnderscapeItems.SHADOLINE_INGOT))
                        .group("shadolined_chorus_fruit")
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, EnderscapeDelightBlocks.RUBBLE_LANTERN)
                        .pattern("RMR")
                        .pattern("M M")
                        .pattern("RMR")
                        .define('R', EnderscapeItems.RUBBLE_CHITIN)
                        .define('M', EnderscapeDelightItems.MAGNIA_POPS)
                        .unlockedBy(getHasName(EnderscapeItems.RUBBLE_CHITIN), has(EnderscapeItems.RUBBLE_CHITIN))
                        .group("rubble_lantern")
                        .save(output);
            }
        };

    }

    @Override
    public String getName() {
        return "EDRecipes";
    }
}
