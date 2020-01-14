package com.ssy.jdk5;

public interface ParentInterface<T1, T2> {

    void setFoo1(T1 foo1);

    void setFoo2(T2 foo2);

    T1 getFoo1();

    T2 getFoo2();
}
