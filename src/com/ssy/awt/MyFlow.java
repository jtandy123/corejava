package com.ssy.awt;

import java.awt.*;

public class MyFlow {

    private Frame frame;

    private Button btn1;

    private Button btn2;

    private Button btn3;

    public void go() {
        frame = new Frame("Flow Layout");

        // 使用FlowLayout替换掉默认的BorderLayout布局管理器
        frame.setLayout(new FlowLayout());

        btn1 = new Button("hello");
        btn2 = new Button("world");
        btn3 = new Button("welcome");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.setSize(100, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyFlow flow = new MyFlow();
        flow.go();
    }
}
