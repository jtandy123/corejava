package com.ssy.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);

        Comparator r = Collections.reverseOrder();

        Collections.sort(list, r);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        System.out.println();

        Collections.shuffle(list);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        System.out.println("minimum value: " + Collections.min(list));
        System.out.println("maximum value: " + Collections.max(list));
    }
}
