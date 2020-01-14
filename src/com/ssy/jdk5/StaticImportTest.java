package com.ssy.jdk5;

import static com.ssy.common.Common.AGE;
import static com.ssy.common.Common.output;

public class StaticImportTest {
    public static void main(String[] args) {
        int age = AGE;

        System.out.println(age);

        output();
    }
}
