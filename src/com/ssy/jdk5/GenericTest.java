package com.ssy.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T> {

    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericTest<? extends List> ge = null;

        ge = new GenericTest<ArrayList>();

        ge = new GenericTest<LinkedList>();

        GenericTest<? super List> ge2 = null;

        ge2 = new GenericTest<Object>();

        GenericTest<String> ge3 = new GenericTest<>();

        ge3.setFoo("hello world");

        GenericTest<?> ge4 = ge3;

        System.out.println(ge4.getFoo());

        ge4.setFoo(null);

        System.out.println(ge4.getFoo());

        // ge4.setFoo("welcome");
    }
}
