package com.cj.collection;

import java.util.HashMap;

public class MapTest2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        // 为什么map的键和值的返回类型是不一样的，keySet()返回的是Set，values()返回的是Collection
        map.put("a", "zhangsan");
        map.put("b", "zhangsan");

        System.out.println(map);
    }
}
