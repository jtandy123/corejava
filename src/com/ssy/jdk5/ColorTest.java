package com.ssy.jdk5;

public class ColorTest {
    public static void main(String[] args) {
        Color myColor = Color.Blue;

        System.out.println(myColor.ordinal());
        System.out.println(myColor);

        System.out.println("---------------");

        for (Color color : Color.values()) {
            System.out.println(color);
        }

        System.out.println("---------------");

        System.out.println(Color.valueOf("White"));
    }
}
