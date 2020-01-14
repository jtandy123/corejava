package com.ssy.jdk5;

public class ObjectFoo {

    private Object foo;

    public Object getFoo() {
        return foo;
    }

    public void setFoo(Object foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        ObjectFoo foo1 = new ObjectFoo();
        ObjectFoo foo2 = new ObjectFoo();

        foo1.setFoo(false);
        Boolean b = (Boolean)foo1.getFoo();

        foo2.setFoo(2);
        Integer i = (Integer)foo2.getFoo();

        ObjectFoo foo33 = new ObjectFoo();
        foo33.setFoo(false);

        String str = (String) foo33.getFoo();
    }
}
