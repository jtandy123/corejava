package com.ssy.reflect;

import java.lang.reflect.Method;

public class TestPrivate {

    public static void main(String[] args) throws Exception {

        Class<?> classType = Private.class;

        Private p = (Private)classType.newInstance();

        Method method = classType.getDeclaredMethod("sayHello", String.class);

        method.setAccessible(true); // 压制Java的访问控制检查

        String str = (String)method.invoke(p, "Andy");

        System.out.println(str);
    }
}
