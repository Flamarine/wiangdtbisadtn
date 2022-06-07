package io.github.pkstdev.wiangdtbisadtn.mixin;

import io.github.pkstdev.wiangdtbisadtn.WiangdtbisadtnClient;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShovelItem.class)
public class ShovelItemMixin {
    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    public void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        if (!WiangdtbisadtnClient.useKey.isPressed()) cir.setReturnValue(ActionResult.FAIL);
    }
}
