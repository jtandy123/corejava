package com.ssy.jdk5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("aa");
        set.add("bb");
        set.add("cc");

        for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
            String value = iter.next();
            System.out.println(value);
        }

        System.out.println("------------------");

        Set<People> set2 = new HashSet<>();

        set2.add(new People("zhangsan", 20, "beijing"));
        set2.add(new People("lisi", 30, "shanghai"));
        set2.add(new People("wangwu", 40, "tianjin"));

        for (Iterator<People> iter = set2.iterator(); iter.hasNext();) {
            People people = iter.next();

            String name = people.getName();
            int age = people.getAge();
            String address = people.getAddress();

            System.out.println(name + "," + age + "," + address);
        }
    }
}

class People {
    private String name;

    private int age;

    private String address;

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                Objects.equals(name, people.name) &&
                Objects.equals(address, people.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}
