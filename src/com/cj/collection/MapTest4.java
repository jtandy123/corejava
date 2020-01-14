package com.cj.collection;
import java.util.HashMap;
public class MapTest4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String arg : args) {
            map.putIfAbsent(arg, 0);
            map.put(arg, map.get(arg) + 1);
        }
        System.out.println(map);
    }
}