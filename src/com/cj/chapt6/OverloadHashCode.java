package com.cj.chapt6;

import java.util.Collection;
import java.util.HashSet;

public class OverloadHashCode {
    public static void main(String[] args) {
        Name n1 = new Name("01");
        Name n2 = new Name("01");

        Collection<Name> c = new HashSet<>();
        c.add(n1);
        System.out.println("----------------");
        c.add(n2);
        System.out.println("----------------");
        System.out.println(n1.equals(n2));
        System.out.println("----------------");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(c);
    }
}

class Name {
    private String id;

    Name(String id) {
        this.id = id;
    }

    public String toString() {
        return this.id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name)obj;
            System.out.println("equal " + name.id);
            return this.id.equals(name.id);
        }
        return super.equals(obj);
    }

//    public int hashCode() {
//        Name name = this;
//        System.out.println("Hash " + name.id);
//        return this.id.hashCode();
//    }
}

/*
hashCode 方法的常规协定，该协定声明相等对象必须具有相等的哈希码
(1)当obj1.equals(obj2)为true时，obj1.hashCode() == obj2.hashCode()必须为true
(2)当obj1.hashCode() == obj2.hashCode()为false时，obj1.equals(obj2)必须为false

为啥重写equals方法，都要重写hashCode?
hashCode用于散列数据的快速存取，如利用HashSet、HashMap、HashTable类来存储数据时，都是根据存储对象的hashcode值进行判断是否相同的
上述代码中，对equals进行了重写，未对hashCode方法进行重写，导致equals结果为true，但是hashCode不一样，导致集合c中存在两个01的对象，[01, 01]
 */