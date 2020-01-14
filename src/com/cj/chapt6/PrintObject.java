package com.cj.chapt6;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class PrintObject {
    public static void main(String[] args) {
        Person p = new Person("Karry Jiang");
        System.out.println(p); // com.cj.chapt6.Person@4554617c  hashCode 自我描述
        // class[field=value1, field2=value2, ...]
    }
}
