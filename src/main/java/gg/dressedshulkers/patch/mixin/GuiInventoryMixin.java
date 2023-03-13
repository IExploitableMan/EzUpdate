package gg.dressedshulkers.patch.mixin;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiInventory.class)
public class GuiInventoryMixin extends GuiScreen {
    private static final ResourceLocation SHULK_BACKGROUND = new ResourceLocation("ezupdate", "textures/gui/in_shulker_box.png");


    @Inject(at = @At("HEAD"), method = "drawGuiContainerBackgroundLayer")
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY, CallbackInfo ci) {
        int w = 122;
        int h = 96;

        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(SHULK_BACKGROUND);
        this.drawTexturedModalRect((width - w) / 2 - 150, (height - h) / 2 + 35, 0, 0, w, h);
    }
}
