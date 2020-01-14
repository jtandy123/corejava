package com.ssy.io2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest1 {

    public static void main(String[] args) throws IOException {

        String temp = "abcdefg";

        byte[] b = temp.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i = 0; i < temp.length(); i++) {

            int c;

            while(-1 != (c = in.read())) {
                if (0 == i) {
                    System.out.println((char)c);
                } else {
                    System.out.println(Character.toUpperCase((char)c));
                }
            }

            System.out.println();

            in.reset();
        }

        in.close();
    }
}
