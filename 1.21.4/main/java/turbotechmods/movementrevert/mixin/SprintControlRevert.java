package turbotechmods.movementrevert.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerEntity.class)
public class SprintControlRevert {

	@Inject(method = "shouldStopSprinting", at = @At("HEAD"), cancellable = true)
	private void shouldStopSprinting(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
