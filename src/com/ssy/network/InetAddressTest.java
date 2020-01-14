package com.ssy.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();

        System.out.println(address);

        address = InetAddress.getByName("www.souhu.com");

        System.out.println(address);
    }
}
