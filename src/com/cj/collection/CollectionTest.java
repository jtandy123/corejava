package com.cj.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        c.remove(6);
        System.out.println("c集合的元素个数为：" + c.size());
        System.out.println("c集合是否包含\"孙悟空\"字符串：" + c.contains("孙悟空"));
        c.add("Java");
        System.out.println(c);

        Collection books = new HashSet();
        books.add("Java");
        books.add("Python");
        System.out.println("c集合是否完全包含books集合" + c.contains(books));

        c.removeAll(books);
        System.out.println("c集合的元素：" + c);

        c.clear();
        System.out.println("c集合的元素：" + c);

//        books.retainAll(c);
        System.out.println("books集合的元素：" + books);

        System.out.println("books集合的元素个数为：" + books.size());

        books.forEach(obj -> System.out.println(obj));

        books.removeIf(obj -> ((String)obj).length() < 6);
        System.out.println(books);
    }
}
