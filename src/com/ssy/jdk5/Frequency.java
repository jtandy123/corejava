package com.ssy.jdk5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frequency {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : args) {
            Integer freq = map.get(word);
            map.put(word, null == freq ? 1 : freq + 1);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
