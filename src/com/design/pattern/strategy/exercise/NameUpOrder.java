package com.design.pattern.strategy.exercise;

import java.util.Comparator;

public class NameUpOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        int num = (p1.getName()).compareTo(p2.getName());
        if (num == 0) {
            return p1.getId() - p2.getId();
        }
        return (p1.getName()).compareTo(p2.getName());
    }
}
