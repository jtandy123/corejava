package com.ssy.jdk5;

public class TestVarargs {

    private static int sum(int num) {
        System.out.println("int num: " + num);
        return num;
    }

    private static int sum(int... nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = sum(1, 2);

        System.out.println(result);

        int result2 = sum(new int[]{1, 2});

        System.out.println(result2);

        result = sum(1, 2, 3, 4);

        System.out.println(result);
    }
}
