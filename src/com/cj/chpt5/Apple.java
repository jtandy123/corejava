package com.cj.chpt5;

import java.util.HashMap;
import java.util.Map;

public class Apple extends Fruit {
    public Apple() {
        super();
        super.info("test");
    }

//    public static void info(String name) {
//        System.out.println(name);
//    }

    public static void main(String[] args) {
        Apple a = new Apple();
        a.weight = 56;
        a.info("apple");

        int i = 0;
        while(i++ < 10) {
            if (i == 1) {
                continue;
            }
            System.out.println(i);
        }

        Map<String, String> map = new HashMap<>();
        System.out.println(map.get(null));
    }
}
