package dev.czfray.pitmi.demo;

import dev.czfray.pitmi.Window;

import static org.lwjgl.glfw.GLFW.*;

public class Main {

    public static void main(String[] args) {
        Window.initialize();

        System.out.println(
                "GLFW Version: " + glfwGetVersionString()
        );

        Window.terminate();
    }
}