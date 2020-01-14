package com.ssy.io2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ByteArrayOutputStream的write方法不是指将数据写到某个字节数组中，而是将参数的字节数组的数据写入到字节数组输出流中。
 * 字节数组输出流是用字节数组来实现的，所以通过toByteArray()方法可以获取流中的数据。
 */

public class ByteArrayOutputStreamTest1 {

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream f = new ByteArrayOutputStream();

        String str = "hello world welcome";

        byte[] buffer = str.getBytes();

        f.write(buffer);

        byte[] result = f.toByteArray();

        for (int i = 0; i < result.length; i++) {
            System.out.println((char)result[i]);
        }

        OutputStream os = new FileOutputStream("text.txt");

        // f.writeTo(os);
        os.write(result);

        f.close();
        os.close();

    }
}
