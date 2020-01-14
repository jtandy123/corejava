package com.ssy.jdk5;

public class GenericFoo<T> {
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericFoo<Boolean> foo1 = new GenericFoo<>();
        GenericFoo<Integer> foo2 = new GenericFoo<>();

        foo1.setFoo(true);
        foo2.setFoo(3);

        Boolean b = foo1.getFoo();
        Integer i = foo2.getFoo();

        System.out.println(b);
        System.out.println(i);

        // foo1 = foo2;

        GenericFoo a = new GenericFoo();

        a.setFoo("hello");

        String str = (String)a.getFoo();

        System.out.println(str);
    }
}
