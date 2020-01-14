package com.cj.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println("rand.nextDouble(): " + rand.nextDouble());
        System.out.println("rand.nextFloat(): " + rand.nextFloat());
        System.out.println("rand.nextGaussian()" + rand.nextGaussian());
        System.out.println("rand.nextInt(): " + rand.nextInt());
        System.out.println("rand.nextInt(26): " + rand.nextInt(26));
        System.out.println("rand.nextLong(): " + rand.nextLong());

        System.out.println("-------------------------------");
        Random r1 = new Random(50);
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextGaussian());

        System.out.println("-----------------------------------");

        Random r2 = new Random(50);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextGaussian());

        System.out.println("----------------------------------");

        Random r3 = new Random(100);
        System.out.println(r3.nextBoolean());
        System.out.println(r3.nextInt());
        System.out.println(r3.nextDouble());
        System.out.println(r3.nextGaussian());

        System.out.println("--------------------------------");
        Random random = new Random(System.currentTimeMillis());
        System.out.println(random.nextInt());

        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int val1 = tlr.nextInt(4,20);
        double val2 = tlr.nextDouble(2.0, 10.0);
        System.out.println(val1);
        System.out.println(val2);
    }
}
