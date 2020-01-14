package com.ssy.annotation;

public class DocumentedTest {

    @DocucmentedAnnotaion(hello = "welcome")
    public void method() {
        System.out.println("method");
    }
}
