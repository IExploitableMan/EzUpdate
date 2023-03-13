package gg.dressedshulkers.patch.mixin;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ContainerPlayer.class)
public abstract class ContainerPlayerMixin extends Container {

    @Inject(at = @At("TAIL"), method = "<init>")
    public void newI(InventoryPlayer playerInventory, boolean localWorld, EntityPlayer playerIn, CallbackInfo ci) {
        for (int l = 0; l < 4; ++l) {
            for (int j1 = 0; j1 < 6; ++j1) {
                this.addSlotToContainer(new Slot(playerInventory, (j1 + (l + 1) * 6) + 34, j1 * 18 - 100, l * 18 + 88));
            }
        }
    }
}
