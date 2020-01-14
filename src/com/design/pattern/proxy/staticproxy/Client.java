package com.design.pattern.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ProxySubject();

        subject.request();
    }
}
