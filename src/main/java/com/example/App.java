package com.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello CI/CD V2!");
        System.out.println("Version: 1.0-SNAPSHOT");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
