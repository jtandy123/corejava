package com.cj.chapt6;

//
public class StaticInnerClassTest {

    private int prop1 = 5;

    private static int prop2 = 9;

    static class StaticInnerClass {
        private String name;
        private static int age;

        public void accessOuterProp() {
//            System.out.println(prop1);
            StaticInnerClassTest s = new StaticInnerClassTest();
            System.out.println(s.prop1);
            System.out.println(prop2);
            System.out.println(age);
        }

        public static void test() {
//            System.out.println(name);
        }
    }

    class InnerClass {
        private int age;

        public void accessOuterProp() {
            System.out.println(prop1);
            System.out.println(prop2);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass si = new StaticInnerClass();
        si.accessOuterProp();

        StaticInnerClassTest s = new StaticInnerClassTest();
        InnerClass ic = s.new InnerClass();
        ic.accessOuterProp();
        System.out.println(ic.age);
    }
}

class AnotherClass {
    public void test() {
        StaticInnerClassTest s = new StaticInnerClassTest();
        StaticInnerClassTest.InnerClass ic = s.new InnerClass();
        ic.accessOuterProp();
    }
}
