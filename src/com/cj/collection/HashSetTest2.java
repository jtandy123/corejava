package com.cj.collection;

import java.util.HashSet;
import java.util.Iterator;

class R {
    int count;

    R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            R r = (R)obj;
            return this.count == r.count;
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }
}

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);

        Iterator it = hs.iterator();
        R first = (R)it.next();
        first.count = -3;
        System.out.println(hs);

        hs.remove(new R(-3));
        // 当试图删除count为-3的R对象时，HashSet会计算出该对象的hashCode值，从而找出该对象在集合中的保存位置，
        // 然后把此处的对象与count为-3的R对象通过equals()方法进行比较，如果相等则删除该对象
        System.out.println(hs);

        System.out.println(hs.contains(new R(-3))); // false
        System.out.println(hs.contains(new R(-2))); // false
    }
}
