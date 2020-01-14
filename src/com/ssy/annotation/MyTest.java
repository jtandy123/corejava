package com.ssy.annotation;

@MyAnnotation(hello = "beijing", world = "shagnhai")
public class MyTest {

    @MyAnnotation(hello = "nanjing", world = "tianjin")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output() {
        System.out.println("output something!");
    }
}
