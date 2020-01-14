package com.cj.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        books.add("疯狂Ajax讲义");
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂iOS讲义");

        System.out.println(calAll(books, ele -> (((String)ele).contains("疯狂"))));
        System.out.println(calAll(books, ele -> (((String)ele).contains("Java"))));
        System.out.println(calAll(books, ele -> (((String)ele).length() > 10)));

        System.out.println("-----------------------------------------------");

        System.out.println(books.stream().filter(ele -> ((String)ele).contains("疯狂")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).length() > 10).count());

        System.out.println("-----------------------------------------------");

        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);

    }

    public static int calAll(Collection books, Predicate predicate) {
        int total = 0;
        for (Object obj : books) {
            if (predicate.test(obj)) {
                total++;
            }
        }
        return total;
    }
}
