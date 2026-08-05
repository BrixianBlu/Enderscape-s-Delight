package net.brixian.enderscapesdelight;
// This code belongs to Storage Delight! Please give the creator, Axperty credit for the code. If requested by Axperty I will remove the code.
import net.brixian.enderscapesdelight.block.EnderscapeDelightBlocks;
import net.brixian.enderscapesdelight.block.entity.CabinetBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;


public class EntityTypesRegistry {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(EnderscapesDelight.MOD_ID, path), blockEntityType);
    }
    public static final BlockEntityType<CabinetBlockEntity> CABINET = register(
            "cabinet", FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
                          EnderscapeDelightBlocks.VEILED_CABINET,
                            EnderscapeDelightBlocks.MURUBLIGHT_CABINET,
                                EnderscapeDelightBlocks.CELESTIAL_CABINET)
                    .build()
    );


    public static void register() {
        EnderscapesDelight.LOGGER.info("Registering block entity types for " + EnderscapesDelight.MOD_ID);
    }
}