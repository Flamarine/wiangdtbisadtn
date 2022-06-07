package io.github.pkstdev.wiangdtbisadtn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WiangdtbisadtnClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Wait I Am Not Gonna Do This But I Somehow Accidentally Did This Nooooooooooooooooooooooo");

    public static KeyBinding useKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.wiangdtbisadtn.use",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "category.wiangdtbisadtn.only"
    ));;

    @Override
    public void onInitializeClient() {
        LOGGER.info("NoooooooooooooooooooooooOOOOOOOOOOOOOooooooOOOOOO");
    }
}
