package com.cj.chapt6;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {
        Integer inObj = 5;
        Object boolObj = true;

        int it = inObj;
        if (boolObj instanceof Boolean) {
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }

        System.out.println(it);
        System.out.println(String.valueOf(2.34f));

        Integer i1 = new Integer(2);
        Integer i2 = new Integer(2);
        System.out.println("i1 == i2:" + (i1 == i2)); // false
        System.out.println(i1 == 2); // true

        Integer i3 = 2;
        Integer i4 = 2;
        System.out.println(i1 == i3); // false
        System.out.println(i3 == 2); // true
        System.out.println(i3 == i4); // true

        int i5 = 2;
        System.out.println(i1 == i5); // true
        System.out.println(i3 == i5); // true

        int i6 = Integer.valueOf(2);
        System.out.println("i5 == i6: " + (i5 == i6)); // true

        System.out.println("----------------------------");
//        System.out.println(Integer.toUnsignedString(2, 2));
//        System.out.println(Integer.toUnsignedString(-1));

        System.out.println("----------------------------");
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello world";
        String str4 = str1 + " world";
        System.out.println(str4 == str3);

        System.out.println(String.class);

        System.out.println(i3);

        System.out.println(Integer.valueOf("127")==Integer.valueOf("127")); // true
        System.out.println(Integer.valueOf("128")==Integer.valueOf("128")); // false
        System.out.println(Integer.parseInt("128")==Integer.valueOf("128")); // true
    }
}
