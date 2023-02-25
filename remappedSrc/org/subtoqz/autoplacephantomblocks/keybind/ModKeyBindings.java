package org.subtoqz.autoplacephantomblocks.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.subtoqz.autoplacephantomblocks.AutoPlacePhantomBlocks;

public class ModKeyBindings {
    public static final KeyBinding PASTE_BLOCK = registerKeyBinding(
            "key.autoplacephantomblocks.paste_block",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_KP_8,
            "category.autoplacephantomblocks.main"
    );

    public static KeyBinding registerKeyBinding(String translationKey, InputUtil.Type type, int code, String category) {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(translationKey, type, code, category));
    }

    public static void register() {
        AutoPlacePhantomBlocks.LOGGER.info("Registering key bindings for: " + AutoPlacePhantomBlocks.MOD_ID);
    }
}