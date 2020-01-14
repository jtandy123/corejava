package com.cj.chapt6;

import com.cj.chpt5.Person;

public class Student extends Person {

    public String name;

    private static int eyes;

    public void myIntroduce() {
//        Person p = new Person();
        System.out.println(super.name);
        System.out.println(this.name);
        introduce();
        System.out.println(eyes);
    }

//    public static void introduce() {
//        System.out.println("student static introduce");
//    }

    public static void main(String[] args) throws InterruptedException  {
        Person p = new Person();
//        System.out.println(p.name);
        p.introduce();
        p.staticIntroduce();
        Person.staticIntroduce();
        Student.staticIntroduce();

        Person s = new Student();
        System.out.println(((Student)s).name);
        s.introduce();
        s.staticIntroduce();

        System.out.println("-----------------------");
        Student s1 = new Student();
        s1.name = "andy";
        s1.myIntroduce();
//        s1.introduce();
//        s.staticIntroduce();
    }
}
