package org.subtoqz.autophantomblocks.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.subtoqz.autophantomblocks.AutoPhantomBlocks;

public class ModKeyBindings {
    public static final KeyBinding PASTE_BLOCK = registerKeyBinding(
            "key.autophantomblocks.paste_block",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_KP_8,
            "category.autophantomblocks.main"
    );

    public static KeyBinding registerKeyBinding(String translationKey, InputUtil.Type type, int code, String category) {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(translationKey, type, code, category));
    }

    public static void register() {
        AutoPhantomBlocks.LOGGER.info("Registering key bindings for: " + AutoPhantomBlocks.MOD_ID);
    }
}