package com.ssy.reflect;

import java.lang.reflect.Method;

public class InvokeTester {

    public int add(int param1, int param2) {
        return param1 + param2;
    }

    public String echo(String message) {
        return "hello: " + message;
    }

    public static void main(String[] args) throws Exception {
//        InvokeTester test = new InvokeTester();
//        System.out.println(test.add(1, 2));
//        System.out.println(test.echo("Tom"));

//        Class<?> classType = Class.forName("com.ssy.reflect.InvokeTester");
        Class<?> classType = InvokeTester.class;

        Object invokeTester = classType.newInstance();
        // System.out.println(invokeTester instanceof InvokeTester);
        // System.out.println(((InvokeTester)invokeTester).add(1, 2));
        Method addMethod = classType.getMethod("add", int.class, int.class); // 因为方法可以重载，所以光靠第一个参数无法确定具体是哪个方法

        Object result = addMethod.invoke(invokeTester, 1, 2);

        System.out.println(result);

        System.out.println("----------------");

        Method echoMethod = classType.getMethod("echo", String.class);

        Object result2 = echoMethod.invoke(invokeTester, "Tom");

        System.out.println(result2);
    }
}
