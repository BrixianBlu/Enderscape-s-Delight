package net.brixian.enderscapesdelight;
// This code belongs to Storage Delight! Please give the creator, Axperty credit for the code. If requested by Axperty I will remove the code.
import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.block.entity.CabinetBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntityTypesRegistry {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(EnderscapesDelight.MOD_ID, path), blockEntityType);
    }
    public static final BlockEntityType<CabinetBlockEntity> CABINET = register(
            "cabinet", FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
                            EnderscapeDelightBlocks.CELESTIAL_CABINET,
                            EnderscapeDelightBlocks.MURUBLIGHT_CABINET,
                            EnderscapeDelightBlocks.VEILED_CABINET)
                    .build()
    );

    public static void register() {
        EnderscapesDelight.LOGGER.info("Registering block entity types for " + EnderscapesDelight.MOD_ID);
    }
}