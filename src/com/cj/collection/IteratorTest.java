package com.cj.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java");
        books.add("nodejs");
        books.add("python");

        Iterator it = books.iterator();
        while(it.hasNext()) {
            String book = (String)it.next();
            System.out.println(book);
            if ("nodejs".equals(book)) {
                it.remove();
            }

            book = "test";
        }
        System.out.println(books);
    }
}
