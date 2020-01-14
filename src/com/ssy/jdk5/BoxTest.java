package com.ssy.jdk5;

import java.util.ArrayList;
import java.util.Collection;

public class BoxTest {
    public static void main(String[] args) {
        int a = 3;

        Collection<Integer> c = new ArrayList<>();

        c.add(a);
        c.add(3 + 3);

        for (Integer i : c) {
            System.out.println(i);
        }
    }
}
