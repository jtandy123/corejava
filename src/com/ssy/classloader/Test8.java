package com.ssy.classloader;

/*
output:
sun.misc.Launcher$AppClassLoader@18b4aac2
sun.misc.Launcher$ExtClassLoader@677327b6
null
 */
public class Test8 {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        System.out.println(classLoader);

        while(null != classLoader) {

            classLoader = classLoader.getParent();

            System.out.println(classLoader);
        }
    }
}
