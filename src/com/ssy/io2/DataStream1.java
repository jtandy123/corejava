package com.ssy.io2;

import java.io.*;

/**
 * 使用数据文件流的一般步骤：
 * 1）建立字节文件流对象；
 * 2）基于字节文件流对象建立数据文件流对象；
 * 3）用数据文件流对象的方法对基本类型的数据进行输入/输出。
 *
 *
 */

public class DataStream1 {

    public static void main(String[] args) throws IOException {

        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));

        // DataOutputStream写入的为二进制信息，所以无法使用记事本查看内容
        byte b = 3;
        int i = 12;
        char ch = 'a';
        float f = 3.3f;

        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(ch);
        dos.writeFloat(f);

        dos.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));

        // 读和写的顺序要保持一致，否则会发生错误
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();

        System.out.println("-----------------------------------");

        BufferedInputStream bis = new BufferedInputStream(new DataInputStream(new FileInputStream("data.txt")));

        byte[] buffer = new byte[100];

        int length = bis.read(buffer);

        System.out.println(new String(buffer, 0, length));

        bis.close();
    }
}
