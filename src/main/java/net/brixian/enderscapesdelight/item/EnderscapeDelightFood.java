package net.brixian.enderscapesdelight.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.TeleportRandomlyConsumeEffect;

import java.util.List;

public class EnderscapeDelightFood {
    public static final FoodComponent DRIFTER_TENTACLES = new FoodComponent.Builder().nutrition(4).saturationModifier(0.15f).build();
    public static final FoodComponent RUSTLE_SLICE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.30f).build();
        public static final ConsumableComponent RUSTLE_SLICE_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0))).build();
    public static final FoodComponent COOKED_RUSTLE_SLICE = new FoodComponent.Builder().nutrition(7).saturationModifier(0.5f).build();
        public static final ConsumableComponent COOKED_RUSTLE_SLICE_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 80, 0))).build();
    public static final FoodComponent GLAZED_FLANGERBERRY = new FoodComponent.Builder().nutrition(6).saturationModifier(1.4f).build();
    public static final FoodComponent DOUBLE_GLAZED_GLANGERBERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(1.5f).build();
    public static final FoodComponent FLANGERBERRY_COBBLER = new FoodComponent.Builder().nutrition(7).saturationModifier(1.6f).build();
    public static final FoodComponent DRIFT_TENTACLE_SPAGHETTI = new FoodComponent.Builder().nutrition(6).saturationModifier(1).build();
    public static final FoodComponent DRIFT_JELLY_SANDWICH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();
        public static final ConsumableComponent DRIFT_JELLY_SANDWICH_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 300, 0))).build();
    public static final FoodComponent DRIFTER_KEBAB = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
        public static final ConsumableComponent DRIFTER_KEBAB_EFFECT = ConsumableComponents.food().consumeEffect(new TeleportRandomlyConsumeEffect()).build();
    public static final FoodComponent DRIFT_JELLY_THUMB_COOKIE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).alwaysEdible().build();
    public static final FoodComponent SHADOWLINED_CHORUS_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).build();
        public static final ConsumableComponent SHADOWLINED_CHORUS_FRUIT_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.SPEED, 400, 0), new StatusEffectInstance(StatusEffects.INVISIBILITY, 600, 0)))).build();
    public static final FoodComponent RUSTLE_SOUP = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8f).build();
        public static final ConsumableComponent RUSTLE_SOUP_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.POISON, 60, 0), new StatusEffectInstance(StatusEffects.HUNGER, 80, 0)))).build();
    public static final FoodComponent MURUBLIGHT_SOUP = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f).build();
        public static final ConsumableComponent MURUBLIGHT_SOUP_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 40, 0))).build();
    public static final FoodComponent SUBMERGED_TENTACLES = new FoodComponent.Builder().nutrition(6).saturationModifier(0.44f).build();
    public static final FoodComponent VEILED_CHIPS = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
        public static final ConsumableComponent VEILED_CHIPS_EFFECT = ConsumableComponents.food().consumeSeconds(0.7f).build();
    public static final FoodComponent MAGNIA_GUSHERS = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
        public static final ConsumableComponent MAGNIA_GUSHERS_EFFECT = ConsumableComponents.food().consumeSeconds(0.6f).build();
    public static final FoodComponent HATRED_SOUP = new FoodComponent.Builder().nutrition(1).saturationModifier(0.01f).build();
        public static final ConsumableComponent HATRED_SOUP_EFFECT = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.POISON, 400, 0), new StatusEffectInstance(StatusEffects.WEAKNESS, 400, 1), new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0), new StatusEffectInstance(StatusEffects.BLINDNESS, 400, 0)))).build();



}