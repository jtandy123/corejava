package com.ssy.io3;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader1 {

    public static void main(String[] args) throws IOException {

        String str = "abcdefg";

        char[] ch = new char[str.length()];

        str.getChars(0, str.length(), ch, 0);

        CharArrayReader car = new CharArrayReader(ch);

        int i;

        while(-1 != (i = car.read())) {
            System.out.println((char)i);
        }

        car.close();
    }
}
