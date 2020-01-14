package com.design.pattern.strategy.exercise.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Tom", 20);
        Person p2 = new Person(2, "Tonny", 50);
        Person p3 = new Person(5, "Tom", 30);
        Person p4 = new Person(8, "ABC", 10);
        Person p5 = new Person(9, "Xyz", 15);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        Environment env = new Environment(new UpNameSort());
        env.sort(list);

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println("id: " + p.getId() + ", name: " + p.getName() + ", age: " + p.getAge());
        }

        System.out.println("-------------------------");

        env.setSorter(new DownNameSort());
        env.sort(list);

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println("id: " + p.getId() + ", name: " + p.getName() + ", age: " + p.getAge());
        }
    }
}
