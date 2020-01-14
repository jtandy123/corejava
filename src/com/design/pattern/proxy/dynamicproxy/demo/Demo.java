package com.design.pattern.proxy.dynamicproxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        CommonInvocationHandler handler = new CommonInvocationHandler();

        Foo foo;

        handler.setTarget(new FooImpl1());

        foo = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);

        foo.doAction();

        System.out.println("----------------");

        handler.setTarget(new FooImpl2());

        foo.doAction();
    }
}
