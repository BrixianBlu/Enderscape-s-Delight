package net.brixian.enderscapesdelight;

import net.brixian.enderscapesdelight.data.*;
import net.brixian.enderscapesdelight.registry.EDTrimMaterial;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EnderscapesDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RecipeDatagen::new);
		pack.addProvider(ModelDatagen::new);
		pack.addProvider(ItemTagDatagen::new);
		pack.addProvider(LootTableDatagen::new);
		pack.addProvider(BlockTagDatagen::new);
	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, EDTrimMaterial::bootstrap);
	}
}
