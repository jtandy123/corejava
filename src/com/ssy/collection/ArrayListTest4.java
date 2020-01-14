package com.ssy.collection;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer
        // Integer[] in = (Integer[])list.toArray();
        Object[] in = list.toArray();

        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
