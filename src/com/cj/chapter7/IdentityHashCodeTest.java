package com.cj.chapter7;

public class IdentityHashCodeTest {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        String s3 = "Java";
        String s4 = "Java";
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        String s5 = s3.intern();
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
    }
}
