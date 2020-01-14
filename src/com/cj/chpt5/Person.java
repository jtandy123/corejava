package com.cj.chpt5;

public class Person {
    {
//        name = "andy";
    }
    protected final String name = "jiang";
    @SuppressWarnings("unused")
    public int age;

    @SuppressWarnings("unused")
    public void say(String content) {
        System.out.println(content);
    }

    public void test(String... books) {
        System.out.println(books);
    }

    protected static void introduce() {
        System.out.println("protected method introduce in parent");
    }

    protected static void staticIntroduce() {
        System.out.println("static protected method introduce in parent");
    }
/*
    public static void main(String[] args) {
        {
            int a = 2;
        }
        int a = 1;
        System.out.println(a);
        Person p = new Person();
        p.name = "Andy";
        p.say("hello");
        p.test(new String[]{"1"});
    }
    */
}
