package com.cj.chapt6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

// 成员内部类分为两种：静态内部类和非静态内部类
public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class InClass {
        private String prop = "内部类的实例变量";

        public void info() {
            String prop = "局部变量";
            System.out.println("外部类的实例变量值：" + DiscernVariable.this.prop);
            System.out.println("内部类的实例变量值：" + this.prop);
            System.out.println("局部变量的值：" + prop);
        }
    }

    public void test() {
        InClass in = new InClass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
        System.out.println(UUID.randomUUID().toString().length());
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("andy");
        System.out.println(list.toString());
        System.out.println(list.toArray());
        System.out.println(Arrays.toString(list.toArray()));
    }
}
