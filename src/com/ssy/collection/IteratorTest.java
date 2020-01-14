package com.ssy.collection;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

//        Iterator iterator = set.iterator();
//
//        while(iterator.hasNext()) {
//            String value = (String)iterator.next();
//            System.out.println(value);
//        }

        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            String value = (String)iterator.next();
            System.out.println(value);
        }

//        for (Object aSet : set) {
//            System.out.println(aSet);
//        }
    }
}
