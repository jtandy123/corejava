package com.ssy.jdk5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");

        for (int element : arr) {
            System.out.println(element);
        }

        System.out.println("--------------------");

        String[] names = {"hello", "world", "welcome"};

        for (String element : names) {
            System.out.println(element);
        }

        System.out.println("--------------------");

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : arr2) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        System.out.println("---------------------");

        Collection<String> col = new ArrayList<>();

        col.add("one");
        col.add("two");
        col.add("three");

        for (String str : col) {
            System.out.println(str);
        }

        System.out.println("---------------------");

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------");

        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        System.out.println("----------------------");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
