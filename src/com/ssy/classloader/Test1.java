package com.ssy.classloader;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader()); // 根类加载器返回null

        Class clazz2 = Class.forName("com.ssy.classloader.C");
        System.out.println(clazz2.getClassLoader()); // sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}

class C {

}
