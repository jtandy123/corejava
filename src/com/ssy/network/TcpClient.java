package com.ssy.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("127.0.0.1", 5000);

        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        os.write("hello world".getBytes());

        // 此处不关闭输出流，会导致Server端的InputStream的read无法判断发送的内容是否已结束，导致会阻塞在read方法处，等待client的OutputStream继续发送数据
        // 此处关闭输出流后，socket也会被关闭，导致下面的InputStream的read方法抛socket已关闭的异常
        os.close();

        byte[] buffer = new byte[200];

//        int length = is.read(buffer);
//
//        System.out.println(new String(buffer, 0, length));

//        int length = 0;
//
//        while(-1 != (length = is.read(buffer, 0, buffer.length))) {
//
//            String str = new String(buffer, 0, length);
//
//            System.out.println(str);
//        }
//
//        is.close();
    }
}
