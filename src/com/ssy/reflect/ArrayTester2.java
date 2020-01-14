package com.ssy.reflect;

import java.lang.reflect.Array;

public class ArrayTester2 {

    public static void main(String[] args) {
        int[] dims = new int[] {5, 10, 15};

        Object array = Array.newInstance(Integer.TYPE, dims);
        System.out.println(array);

        Object arrayObj = Array.get(array, 3); // arrayObj是一个二维数组

        Class<?> classType = arrayObj.getClass().getComponentType();
        System.out.println(classType);

        arrayObj = Array.get(arrayObj, 5); // arrayObj是一个一维数组

//        Integer[] arr = (Integer[])arrayObj;
//        arr[10] = 37;
//        System.out.println(arr[10]);

         Array.setInt(arrayObj, 10, 37);

        int[][][] arrayCast = (int[][][])array;

        System.out.println(arrayCast[3][5][10]);

        // System.out.println(Integer.TYPE); // int
        // System.out.println(Integer.class); // class java.lang.Integer
    }
}
