package com.ssy.awt;

import java.awt.*;

public class ExGUI3 {

    private Frame frame;

    private Panel panel;

    private Button btn1, btn2, btn3, btn4;

    public void go() {
        frame = new Frame("Complex Layout");

        btn1 = new Button("West");
        btn2 = new Button("hello");

        frame.add(btn1, BorderLayout.WEST);
        frame.add(btn2, BorderLayout.CENTER);

        panel = new Panel();

        btn3 = new Button("world");
        btn4 = new Button("welcome");

        panel.add(btn3);
        panel.add(btn4);

        frame.add(panel, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExGUI3 gui = new ExGUI3();

        gui.go();
    }
}
