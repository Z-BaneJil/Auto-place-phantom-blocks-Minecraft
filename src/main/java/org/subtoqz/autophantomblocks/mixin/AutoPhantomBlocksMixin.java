package org.subtoqz.autophantomblocks.mixin;

import org.subtoqz.autophantomblocks.AutoPhantomBlocks;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AutoPhantomBlocksMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		AutoPhantomBlocks.LOGGER.info("Mixin successfully initialized!");
	}
}