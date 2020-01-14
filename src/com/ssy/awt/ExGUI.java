package com.ssy.awt;

import java.awt.*;

public class ExGUI {

    private Frame frame;

    private Button button1;

    private Button button2;

    public void go() {
        frame = new Frame("GUI example");

        // frame.setLayout(new FlowLayout());

        button1 = new Button("Press me");
        button2 = new Button("Don't press me");

        frame.add(button1);
        frame.add(button2);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExGUI window = new ExGUI();

        window.go();
    }
}
