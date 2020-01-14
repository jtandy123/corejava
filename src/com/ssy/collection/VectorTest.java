package com.ssy.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("hello");
        vector.add("world");
        vector.add("hello world");

        for (Iterator iter = vector.iterator(); iter.hasNext();) {
            String value = (String)iter.next();
            System.out.println(value);
        }
    }
}
