package org.subtoqz.autoplacephantomblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.block.BlockState;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.subtoqz.autoplacephantomblocks.block.ModBlocks;
import org.subtoqz.autoplacephantomblocks.keybind.ModKeyBindings;

public class AutoPlacePhantomBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (ModKeyBindings.PASTE_BLOCK.isPressed()) {
                Vec3d playerPos = client.player.getPos();
                BlockPos blockPos = new BlockPos(playerPos.x, playerPos.y - 1, playerPos.z);
                BlockState blockState = ModBlocks.FIRST_BLOCK.getDefaultState();
                client.world.setBlockState(blockPos, blockState);
                String msg = Text.translatable("text.autoplacephantomblocks.block_placed").getString() + blockPos.getX() + " " + blockPos.getY() + " " + blockPos.getZ();
                client.player.sendMessage(Text.of(msg), true);
            }
        });
    }
}