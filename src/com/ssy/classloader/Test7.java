package com.ssy.classloader;

class CL {

    static {
        System.out.println("Class CL");
    }
}

public class Test7 {

    public static void main(String[] args) throws Exception {

        // 获得系统类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("com.ssy.classloader.CL");

        System.out.println("--------------------------------");

        clazz = Class.forName("com.ssy.classloader.CL");
    }
}
