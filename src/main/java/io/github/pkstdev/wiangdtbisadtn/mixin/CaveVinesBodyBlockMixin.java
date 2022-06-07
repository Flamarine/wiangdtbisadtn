package io.github.pkstdev.wiangdtbisadtn.mixin;

import io.github.pkstdev.wiangdtbisadtn.WiangdtbisadtnClient;
import net.minecraft.block.BlockState;
import net.minecraft.block.CaveVinesBodyBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CaveVinesBodyBlock.class)
public class CaveVinesBodyBlockMixin {
    @Inject(method = "onUse", at = @At("HEAD"), cancellable = true)
    public void onOnUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
        if (!WiangdtbisadtnClient.useKey.isPressed()) cir.setReturnValue(ActionResult.FAIL);
    }
}
