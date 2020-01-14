package com.design.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object obj) {
        this.proxyObj = obj;
    }

    public static Object factory(Object obj) {
        Class<?> classType = obj.getClass();

        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), new VectorProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling: " + method);

        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }

        Object obj = method.invoke(proxyObj, args);

        System.out.println("after calling: " + method);

        return obj;
    }

    public static void main(String[] args) {
        List list = (List)VectorProxy.factory(new Vector<>());

        System.out.println(list.getClass().getName());

        list.add("New");
        list.add("York");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
