package net.brixian.enderscapesdelight;

import net.brixian.enderscapesdelight.data.ModelDatagen;
import net.brixian.enderscapesdelight.data.RecipeDatagen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EnderscapesDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RecipeDatagen::new);
		pack.addProvider(ModelDatagen::new);

	}
}
