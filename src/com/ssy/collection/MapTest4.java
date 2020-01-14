package com.ssy.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (String arg : args) {
            if (map.get(arg) != null) {
                map.put(arg, (Integer)map.get(arg) + 1);
            } else {
                map.put(arg, 1);
            }
            // map.merge(arg, 1, (a, b) -> (Integer) a + (Integer)b);
        }

        Set set = map.keySet();

        for (Iterator iter = set.iterator(); iter.hasNext();) {
            String key = (String)iter.next();
            Integer value = (Integer)map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
