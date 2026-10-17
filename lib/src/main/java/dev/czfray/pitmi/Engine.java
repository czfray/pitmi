package dev.czfray.pitmi;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.opengl.GL11.*;

public class Engine {

    private static long windowId;

    public static void start(){
        if (!glfwInit()) {
            return;
        }
        glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW.GLFW_OPENGL_FORWARD_COMPAT, GLFW_TRUE);
        glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW_FALSE);
        glfwWindowHint(GLFW.GLFW_SCALE_TO_MONITOR, GLFW_FALSE);

        windowId = glfwCreateWindow(800, 600, "Test", NULL, NULL);
        if (windowId == NULL){
            glfwTerminate();
            return;
        }
        glfwMakeContextCurrent(windowId);
        GL.createCapabilities();
        glEnable(GL_DEPTH_TEST);
    }

     public static void run(){
         if (windowId == NULL){
             return;
         }
         glfwMakeContextCurrent(windowId);
         while (!glfwWindowShouldClose(windowId)){
             glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
             glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
             glfwSwapBuffers(windowId);
             glfwPollEvents();
         }
     }

     public static void terminate(){
         if (windowId == NULL){
             return;
         }
         glfwDestroyWindow(windowId);
         glfwTerminate();
     }

}
