package com.ssy.network;

import java.io.IOException;
import java.net.*;
import java.net.DatagramPacket;

public class UdpTest1 {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket();

        String str = "hello world 测试";

        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("localhost"), 7000);

        socket.send(packet);

        byte[] buffer = new byte[1000];

        DatagramPacket packet2 = new DatagramPacket(buffer, 100);

        socket.receive(packet2);

        System.out.println(new String(buffer, 0, packet2.getLength()));

        socket.close();
    }
}
