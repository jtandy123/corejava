package com.ssy.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new PersonComparator());

        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);


        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Object aSet : set) {
            System.out.println(aSet);
        }
    }
}

class Person {

    int score;

    public Person(int score) {
        this.score = score;
    }

    public String toString() {
        return String.valueOf(this.score);
    }
}

class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).score - ((Person)o2).score;
    }
}
