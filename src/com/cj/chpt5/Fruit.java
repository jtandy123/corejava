package com.cj.chpt5;

public class Fruit {
    public Fruit() {
        System.out.println(this);
    }

    public static double weight;
    public static void info(String name) {
        System.out.println("I am a fruit! My weight is " + weight + " g!");
    }
}
