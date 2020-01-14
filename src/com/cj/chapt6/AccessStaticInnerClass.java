package com.cj.chapt6;

public class AccessStaticInnerClass {

    private int prop = 2;

    private static int prop3 = 3;

    static class StaticInnerClass {
        private static int prop1 = 5;

        private int prop2 = 9;

        public void accessOuterProp() {
            System.out.println(prop3);
            System.out.println(new AccessStaticInnerClass().prop);
        }
    }

    public static void accessInnerProp() {
        System.out.println(StaticInnerClass.prop1);
        System.out.println(new StaticInnerClass().prop2);
    }

    public void test() {
        StaticInnerClass sic = new StaticInnerClass();
        sic.accessOuterProp();
    }

    public static void main(String[] args) {
        StaticInnerClass sic = new AccessStaticInnerClass.StaticInnerClass();
        sic.accessOuterProp();

        AccessStaticInnerClass asic = new AccessStaticInnerClass();
        asic.test();

        asic.accessInnerProp();
    }
}
