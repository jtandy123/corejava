package com.ssy.collection;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int value = (Integer)list.get(i);
            sum += value;
        }

        System.out.println(sum);
    }
}
