package com.cj.chapter7;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Java" + "String";
        String str2 = "Java".concat("String");
        System.out.println(str1 == str2); // false

        char[] s1 = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a'};
        String s2 = new String("ejb");
        s2.getChars(0,3, s1, 7);
        System.out.println(s1); // I love ejba

        System.out.println(String.valueOf(true));
    }
}
