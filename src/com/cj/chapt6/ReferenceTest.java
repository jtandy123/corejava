package com.cj.chapt6;

import java.lang.ref.WeakReference;

public class ReferenceTest {
    public static void main(String[] args) {
//        String str = "java";
        String str = new String("java");

        WeakReference wr = new WeakReference(str);

        str = null;

        System.out.println(wr.get());

        System.gc();
        System.runFinalization();

        System.out.println(wr.get());
    }
}
