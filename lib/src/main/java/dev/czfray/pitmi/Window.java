package dev.czfray.pitmi;

import static org.lwjgl.glfw.GLFW.*;

public class Window {

    public static void initialize() {
        if (!glfwInit()) {
            throw new IllegalStateException(
                    "Failed to initialize GLFW"
            );
        }

        System.out.println("LWJGL initialized!");
    }

    public static void terminate() {
        glfwTerminate();
    }
}