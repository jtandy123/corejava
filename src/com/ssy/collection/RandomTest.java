package com.ssy.collection;

import java.util.*;

public class RandomTest {
    public static void main(String[] args) {
        Map map = new TreeMap(); // 存储数字及其出现的次数（key为数字，value为数字出现的次数）

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            Integer number = random.nextInt(41) + 10;
            if (map.get(number) == null) {
                map.put(number, 1);
            } else {
                map.put(number, (Integer)map.get(number) + 1);
            }
        }

        List list = new ArrayList(); // 存储出现次数最大的数字

        Integer maxOccurs = (Integer) Collections.max(map.values());

        Set set = map.entrySet();

        for (Iterator iter = set.iterator(); iter.hasNext();) {
            Map.Entry entry = (Map.Entry)iter.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();

            if (value.equals(maxOccurs)) {
                list.add(key);
            }

            System.out.println(key + " : " + value);
        }

        System.out.println("出现的最多次数为：" + maxOccurs);

        System.out.println("这些数字分别是：");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
