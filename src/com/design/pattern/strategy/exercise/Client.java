package com.design.pattern.strategy.exercise;

import java.util.*;

/**
 * 假如有若干个类Person对象存在一个List当中，对它们进行排序，分别按照名字、年龄、id进行排序（要有正序与倒序两种排序方式）。
 * 假如年龄或者姓名重复，按照id的正序进行排序。要求使用策略模式进行。
 * @author tao.jiang
 */
public class Client {
    public static void main(String[] args) {
        Comparator comparator = new NameUpOrder();

        List list = new ArrayList<>();

        list.add(new Person(1, "zhangsan", 20));
        list.add(new Person(2, "lisi", 21));
        list.add(new Person(3, "wangwu", 25));
        list.add(new Person(4, "zhaoliu", 26));
        list.add(new Person(5, "chenqi", 28));
        list.add(new Person(6, "dongba", 10));
        list.add(new Person(7, "zhansan", 15));
        list.add(new Person(8, "liujiu", 26));

//        list.sort(comparator);
        Collections.sort(list, comparator);

        for (Object aList : list) {
            Person person = (Person) aList;
            System.out.println(person.say());
        }
    }
}
