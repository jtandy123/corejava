package com.ssy.network;

import java.io.IOException;
import java.net.Socket;

public class MainClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 4000);

        // 启动读写线程
        new ClientInputThread(socket).start();
        new ClientOutputThread(socket).start();
    }
}
