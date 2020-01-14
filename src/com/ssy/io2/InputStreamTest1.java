package com.ssy.io2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 读数据的逻辑：
 * open a stream
 * while more information
 * read information
 * close the stream
 */
public class InputStreamTest1 {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("e:/hello.txt");

        byte[] buffer = new byte[1];

        int length = 0;

        while(-1 != (length = is.read(buffer, 0, 1))) {
            String str = new String(buffer, 0, length);
            System.out.print(str);
        }

        is.close();
    }
}
