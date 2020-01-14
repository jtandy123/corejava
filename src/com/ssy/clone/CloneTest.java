package com.ssy.clone;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student();

        student.setAge(20);
        student.setName("zhangsan");

        Student student2 = (Student)student.clone();

        System.out.println(student2.getAge());
        System.out.println(student2.getName());

        System.out.println("-----------------------");

        student2.setName("lisi");

        System.out.println(student.getName());
        System.out.println(student2.getName());
    }
}

class Student implements Cloneable {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Object object = super.clone();

        return object;
    }
}
