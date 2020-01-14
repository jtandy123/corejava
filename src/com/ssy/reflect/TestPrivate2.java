package com.ssy.reflect;

import java.lang.reflect.Field;

public class TestPrivate2 {

    public static void main(String[] args) throws Exception {

        Class<?> classType = Private2.class;

        Private2 private2 = (Private2) classType.newInstance();

        Field field = classType.getDeclaredField("name");

        field.setAccessible(true);

        field.set(private2, "lisi");

        System.out.println(private2.getName());
    }
}
