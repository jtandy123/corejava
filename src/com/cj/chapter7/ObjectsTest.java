package com.cj.chapter7;

import java.util.Objects;

public class ObjectsTest {
    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj)); // 0
        System.out.println(Objects.toString(obj)); // null
        System.out.println(Objects.requireNonNull(obj, "obj参数不能是null"));
    }
}
