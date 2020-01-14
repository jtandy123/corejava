package com.cj.chapt6;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "5");
        map.put(2, "2");
        map.put(4, "4");
        map.put(1, "1");
        map.put(3, "3");
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterable = set.iterator();
        while(iterable.hasNext()) {
            System.out.println(iterable.next());
        }
        System.out.println("---------------------------");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
