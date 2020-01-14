package com.ssy.io3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

    public static void main(String[] args) throws IOException {

        String str = "hello world welcome nihao hehe";

        char[] buffer = new char[str.length()];

        str.getChars(0, str.length(), buffer, 0);

        FileWriter fw = new FileWriter("file2.txt");

        for (int i = 0; i < buffer.length; i++) {
            fw.write(buffer[i]);
        }

        fw.close();
    }
}
