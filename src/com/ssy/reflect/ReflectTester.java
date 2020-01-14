package com.ssy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    Class类是Reflection API中的核心类，它有一下方法：
    - getName(): 获得类的完整名字
    - getFields(): 获得类的public类型的属性
    - getDeclaredFields(): 获得类的所有属性
    - getMethods(): 获得类的public类型的方法
    - getDeclaredMethods(): 获得类的所有方法
    - getMethod(String name, Class[] parameterTypes): 获得类的特定public方法，name参数指定方法的名字，parameterTypes参数指定方法的参数类型
    - getConstructors(): 获得类的public类型的构造方法
    - getConstructor(Class[] parameterTypes): 获得类的特定public构造方法，parameterTypes参数指定构造方法的参数类型
    - newInstance(): 通过类的不带参数的构造方法创建这个类的一个对象
 */

public class ReflectTester {

    // 该方法实现对Customer对象的拷贝操作
    public Object copy(Object object) throws Exception {
        Class<?> classType = object.getClass(); // 获得对象的类型

        Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{}); // 通过默认构造方法创建一个对象

        // 获得对象的所有成员变量
        Field[] fields = classType.getDeclaredFields();

        for (Field field : fields) {
            String name = field.getName();

            String firstLetter = name.substring(0, 1).toUpperCase();

            String getMethodName = "get" + firstLetter + name.substring(1);
            String setMethodName = "set" + firstLetter + name.substring(1);

            Method getMethod = classType.getMethod(getMethodName);
            Method setMethod = classType.getMethod(setMethodName, field.getType());
//            System.out.println(field.getType());
//            System.out.println(field.getDeclaringClass());

            Object value = getMethod.invoke(object);
            setMethod.invoke(objectCopy, value);
        }
        return objectCopy;
    }

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Tom", 20);
        customer.setId(1L);

        ReflectTester reflectTester = new ReflectTester();
        Customer customer2 = (Customer)reflectTester.copy(customer);
        System.out.println(customer2.getId());
        System.out.println(customer2.getName());
        System.out.println(customer2.getAge());
    }
}

class Customer {

    private Long id;

    private String name;

    private int age;

    public Customer() {}

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
