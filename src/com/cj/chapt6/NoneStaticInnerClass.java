package com.cj.chapt6;

public class NoneStaticInnerClass {

    private String prop1 = "test";

    private static int prop2 = 2;

    class InnerClass {
        private int prop3 = 3;

        public void accessOuterClass() {
            System.out.println(prop1);
            System.out.println(prop2);
            System.out.println(prop3);

            System.out.println(NoneStaticInnerClass.this.prop1);
            System.out.println(NoneStaticInnerClass.this.prop2);
            System.out.println(NoneStaticInnerClass.prop2);
            System.out.println(NoneStaticInnerClass.InnerClass.this);
            System.out.println(this.prop3);
        }
    }

    public void accessInnerClass() {
        InnerClass ic = this.new InnerClass();
        System.out.println(ic.prop3);
    }

    public static void staticTest() {
        InnerClass ic = new NoneStaticInnerClass().new InnerClass();
    }

    public static void main(String[] args) {
        NoneStaticInnerClass nsi = new NoneStaticInnerClass();
        InnerClass ic = nsi.new InnerClass();
        ic.accessOuterClass();
    }
}
