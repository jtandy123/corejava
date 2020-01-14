package com.ssy.jdk5;

import com.cj.chapt6.InterfaceTest;

public class BoxTest2 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;

        if (i1 == i2) {
            System.out.println("i1 == i2");
        } else {
            System.out.println("i1 != i2");
        }

        Integer i3 = new Integer(100);
        Integer i4 = new Integer(100);

        if (i3 == i4) {
            System.out.println("i3 == i4");
        } else {
            System.out.println("i3 != i4");
        }

        Integer i5 = Integer.valueOf(3);
        Integer i6 = Integer.valueOf(3);

        if (i5 == i6) {
            System.out.println("i5 == i6");
        } else {
            System.out.println("i5 != i6");
        }

        Integer i7 = 100;
        Integer i8 = new Integer(100);
        if (i7 == i8) {
            System.out.println("i7 == i8");
        } else {
            System.out.println("i7 != i8");
        }

        Integer i9 = Integer.valueOf(100);
        if (i7 == i9) {
            System.out.println("i7 == i9");
        } else {
            System.out.println("i7 != i9");
        }
    }
}
