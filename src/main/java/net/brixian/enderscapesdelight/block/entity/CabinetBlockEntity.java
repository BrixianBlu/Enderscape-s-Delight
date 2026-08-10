package net.brixian.enderscapesdelight.block.entity;
// This code belongs to Storage Delight! Please give the creator, Axperty credit for the code. If requested by Axperty I will remove the code.
import net.brixian.enderscapesdelight.EntityTypesRegistry;
import net.brixian.enderscapesdelight.block.CabinetBlock;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.Level;

import java.util.List;

public class CabinetBlockEntity extends RandomizableContainerBlockEntity {
    private static final Component CONTAINER_NAME_TEXT = Component.translatable("container.enderscapesdelight.cabinet");
    private NonNullList<ItemStack> inventory;
    private final ContainerOpenersCounter stateManager;

    public CabinetBlockEntity(BlockPos pos, BlockState state) {
        super(EntityTypesRegistry.CABINET, pos, state);
        this.inventory = NonNullList.withSize(27, ItemStack.EMPTY);
        this.stateManager = new ContainerOpenersCounter() {
            protected void onOpen(Level world, BlockPos pos, BlockState state) {
                CabinetBlockEntity.this.playSound(state, SoundEvents.BARREL_OPEN);
                CabinetBlockEntity.this.setOpen(state, true);
            }

            protected void onClose(Level world, BlockPos pos, BlockState state) {
                CabinetBlockEntity.this.playSound(state, SoundEvents.BARREL_CLOSE);
                CabinetBlockEntity.this.setOpen(state, false);
            }

            protected void openerCountChanged(Level world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
            }

            public boolean isOwnContainer(Player player) {
                if (player.containerMenu instanceof ChestMenu) {
                    Container inventory = ((ChestMenu)player.containerMenu).getContainer();
                    return inventory == CabinetBlockEntity.this;
                } else {
                    return false;
                }
            }
        };
    }

    protected void saveAdditional(ValueOutput view) {
        super.saveAdditional(view);
        if (!this.trySaveLootTable(view)) {
            ContainerHelper.saveAllItems(view, this.inventory);
        }

    }

    protected void loadAdditional(ValueInput view) {
        super.loadAdditional(view);
        this.inventory = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(view)) {
            ContainerHelper.loadAllItems(view, this.inventory);
        }

    }

    public int getContainerSize() {
        return 27;
    }

    protected NonNullList<ItemStack> getItems() {
        return this.inventory;
    }

    protected void setItems(NonNullList<ItemStack> inventory) {
        this.inventory = inventory;
    }

    protected Component getDefaultName() {
        return CONTAINER_NAME_TEXT;
    }

    protected AbstractContainerMenu createMenu(int syncId, Inventory playerInventory) {
        return ChestMenu.threeRows(syncId, playerInventory, this);
    }

    public void startOpen(ContainerUser user) {
        if (!this.remove && !user.getLivingEntity().isSpectator()) {
            this.stateManager.incrementOpeners(user.getLivingEntity(), this.getLevel(), this.getBlockPos(), this.getBlockState(), user.getContainerInteractionRange());
        }

    }

    public void stopOpen(ContainerUser user) {
        if (!this.remove && !user.getLivingEntity().isSpectator()) {
            this.stateManager.decrementOpeners(user.getLivingEntity(), this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public List<ContainerUser> getEntitiesWithContainerOpen() {
        return this.stateManager.getEntitiesWithContainerOpen(this.getLevel(), this.getBlockPos());
    }

    public void tick() {
        if (!this.remove) {
            this.stateManager.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    private void setOpen(BlockState state, boolean open) {
        this.level.setBlock(this.getBlockPos(), (BlockState)state.setValue(CabinetBlock.OPEN, open), 3);
    }

    private void playSound(BlockState state, SoundEvent event) {
        Vec3i direction = ((Direction)state.getValue(CabinetBlock.FACING)).getUnitVec3i();
        double x = (double)this.worldPosition.getX() + (double)0.5F + (double)direction.getX() / (double)2.0F;
        double y = (double)this.worldPosition.getY() + (double)0.5F + (double)direction.getY() / (double)2.0F;
        double z = (double)this.worldPosition.getZ() + (double)0.5F + (double)direction.getZ() / (double)2.0F;
        this.level.playSound((Entity)null, x, y, z, event, SoundSource.BLOCKS, 0.5F, this.level.getRandom().nextFloat() * 0.1F + 0.9F);
    }
}