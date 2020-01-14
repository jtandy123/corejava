package com.ssy.io2;

import java.io.*;

public class BufferedOutputStreamTest1 {

    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("1.txt");

        BufferedOutputStream bos = new BufferedOutputStream(os); // 即具备了对文件输出的功能，有具备了缓冲输出的功能

        bos.write("http://www.google.com".getBytes());

        bos.close();
        os.close();
    }
}
