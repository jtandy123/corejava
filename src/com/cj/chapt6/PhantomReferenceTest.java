package com.cj.chapt6;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        String str = new String("java");

        ReferenceQueue rq = new ReferenceQueue();
        PhantomReference pr = new PhantomReference(str, rq);
        str = null;
        System.out.println(pr.get()); // null
        System.gc();
        System.runFinalization();
        System.out.println(rq.poll() == pr); // true
    }
}
