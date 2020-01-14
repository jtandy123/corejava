package com.cj.chapt6;

public class InnerClassSubClass extends Out.In {
    public InnerClassSubClass(Out out) {
        out.super("hello");
    }

    public static void main(String[] args) {
        Out out = new Out();
        InnerClassSubClass is = new InnerClassSubClass(out);
        System.out.println(is);
        System.out.println(InnerClassSubClass.class);
        System.out.println(is.getClass());

        Object obj = new InnerClassSubClass(new Out());
        System.out.println(obj.getClass());

    }
}
