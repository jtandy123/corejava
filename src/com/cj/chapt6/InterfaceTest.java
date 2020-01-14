package com.cj.chapt6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

interface InterfaceA {
    public static final int A = 2;
    public static void test() {
        System.out.println("test interface A");
    }

    default void info() {
        System.out.println("info interface A");
    }
}

interface InterfaceB {
    public static final int A = 3;

    public static final int B = 4;
}

interface InterfaceC extends InterfaceA, InterfaceB {
    public static final int C = 5;

//    public static void test() {
//        System.out.println("test");
//    }
//
//    public default void test2() {
//        System.out.println("test2");
//    }
}

public class InterfaceTest implements InterfaceC {
    public static void main(String[] args) {
//        System.out.println(InterfaceC.A); //error: 对A的引用不明确
        System.out.println(InterfaceC.B);
        System.out.println(InterfaceC.C);
//        InterfaceC.test();
        InterfaceTest it = new InterfaceTest();
        it.info();
        InterfaceA.test();
    }
}
