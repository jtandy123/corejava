package com.cj.exception;

public class FinallyFlowTest {
    public static void main(String[] args) {
        boolean a = test();
        System.out.println(a);
    }

    public static boolean test() {
        //noinspection finally
        try {
            return true;
        } finally {
            return false;
        }
    }
}
