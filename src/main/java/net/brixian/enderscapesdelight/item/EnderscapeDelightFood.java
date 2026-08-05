package net.brixian.enderscapesdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import vectorwing.farmersdelight.common.registry.ModEffects;
import net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect;

import java.util.List;

public class EnderscapeDelightFood {
    public static final FoodProperties DRIFTER_TENTACLES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.15f).build();
    public static final FoodProperties RUSTLE_SLICE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.30f).build();
        public static final Consumable RUSTLE_SLICE_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 100, 0))).build();
    public static final FoodProperties COOKED_RUSTLE_SLICE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.5f).build();
        public static final Consumable  COOKED_RUSTLE_SLICE_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 80, 0))).build();
    public static final FoodProperties GLAZED_FLANGERBERRY = new FoodProperties.Builder().nutrition(6).saturationModifier(1.4f).build();
    public static final FoodProperties DOUBLE_GLAZED_GLANGERBERRY = new FoodProperties.Builder().nutrition(8).saturationModifier(1.5f).build();
    public static final FoodProperties FLANGERBERRY_COBBLER = new FoodProperties.Builder().nutrition(7).saturationModifier(1.6f).build();
    public static final FoodProperties DRIFT_TENTACLE_SPAGHETTI = new FoodProperties.Builder().nutrition(6).saturationModifier(1).build();
    public static final Consumable  DRIFT_TENTACLE_SPAGHETTI_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.NOURISHMENT, 1300, 0))).build();
    public static final FoodProperties DRIFT_JELLY_SANDWICH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.4f).build();
        public static final Consumable  DRIFT_JELLY_SANDWICH_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0))).build();
    public static final FoodProperties DRIFTER_KEBAB = new FoodProperties.Builder().nutrition(8).saturationModifier(0.3f).build();
        public static final Consumable  DRIFTER_KEBAB_EFFECT = Consumables.defaultFood().onConsume(new TeleportRandomlyConsumeEffect()).build();
    public static final FoodProperties DRIFT_JELLY_THUMB_COOKIE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f).alwaysEdible().build();
    public static final FoodProperties SHADOWLINED_CHORUS_FRUIT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f).build();
        public static final Consumable  SHADOWLINED_CHORUS_FRUIT_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.SPEED, 400, 0), new MobEffectInstance(MobEffects.INVISIBILITY, 600, 0)))).build();
    public static final FoodProperties RUSTLE_SOUP = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).build();
        public static final Consumable  RUSTLE_SOUP_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.POISON, 60, 0), new MobEffectInstance(MobEffects.HUNGER, 80, 0)))).build();
    public static final FoodProperties MURUBLIGHT_SOUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f).build();
        public static final Consumable  MURUBLIGHT_SOUP_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 40, 0))).build();
    public static final FoodProperties SUBMERGED_TENTACLES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.44f).build();
    public static final FoodProperties VEILED_CHIPS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
        public static final Consumable  VEILED_CHIPS_EFFECT = Consumables.defaultFood().consumeSeconds(0.7f).build();
    public static final FoodProperties MAGNIA_POPS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
        public static final Consumable  MAGNIA_POPS_EFFECT = Consumables.defaultFood().consumeSeconds(0.6f).build();
    public static final FoodProperties HATRED_SOUP = new FoodProperties.Builder().nutrition(1).saturationModifier(0.01f).build();
        public static final Consumable  HATRED_SOUP_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.POISON, 400, 0), new MobEffectInstance(MobEffects.WEAKNESS, 400, 1), new MobEffectInstance(MobEffects.NAUSEA, 400, 0), new MobEffectInstance(MobEffects.BLINDNESS, 400, 0)))).build();
    public static final FoodProperties RUBBLEMITE_ESCARGOT = new FoodProperties.Builder().nutrition(6).saturationModifier(1.3f).build();
        public static final Consumable  RUBBLEMITE_ESCARGOT_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600, 1))).build();
   public static final FoodProperties DRIFT_GELATIN = new FoodProperties.Builder().nutrition(8).saturationModifier(1f).build();
        public static final Consumable  DRIFT_GELATIN_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 800, 1))).build();
    public static final FoodProperties ENDER_ESCAPE = new FoodProperties.Builder().nutrition(12).saturationModifier(1f).build();
    public static final FoodProperties FLANGER_BERRY_COBBLER_SLICE = new FoodProperties.Builder().nutrition(7).saturationModifier(1.4f).build();
    public static final FoodProperties STUFFED_FLANGER_BERRY = new FoodProperties.Builder().nutrition(14).saturationModifier(0.75f).build();
        public static final Consumable  STUFFED_FLANGER_BERRY_EFFECT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.COMFORT, 1200, 0 ))).build();






}