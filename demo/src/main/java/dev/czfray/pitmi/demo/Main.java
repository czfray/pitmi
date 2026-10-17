package dev.czfray.pitmi.demo;

import dev.czfray.pitmi.Engine;

import static org.lwjgl.glfw.GLFW.*;

public class Main {

    public static void main(String[] args) {
        Engine.start();
        Engine.run();
        Engine.terminate();
    }
}