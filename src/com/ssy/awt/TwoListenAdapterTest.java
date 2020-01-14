package com.ssy.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TwoListenAdapterTest {
    private Frame frame;

    private TextField textField;

    public void go() {
        frame = new Frame("Two Listeners Adapter Example");

        frame.add(new Label("click"), BorderLayout.NORTH);

        textField = new TextField(30);

        frame.add(textField, BorderLayout.SOUTH);

        frame.addMouseListener(new MyAdapter());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TwoListenAdapterTest test = new TwoListenAdapterTest();

        test.go();
    }
}

class MyAdapter extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("The mouse has entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("The mouse has exited the Frame");
    }
}
