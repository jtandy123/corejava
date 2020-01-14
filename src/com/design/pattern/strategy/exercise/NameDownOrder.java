package com.design.pattern.strategy.exercise;

import java.util.Comparator;

public class NameDownOrder implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        int num = (p2.getName()).compareTo(p1.getName());
        if (num == 0) {
            return p1.getId() - p2.getId();
        }
        return (p2.getName()).compareTo(p1.getName());
    }
}
