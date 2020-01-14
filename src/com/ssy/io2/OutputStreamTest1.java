package com.ssy.io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 写数据的逻辑：
 * open a stream
 * while more information
 * write information
 * close the stream
 */

public class OutputStreamTest1 {

    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("e:/out.txt");

        String str = "hello world";

        byte[] buffer = str.getBytes();

        os.write(buffer);

        os.close();
    }
}
