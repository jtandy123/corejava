package com.ssy.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

public class MyFrame2 {

    public static void main(String[] args) {
        Frame frame = new Frame("My Frame 2");

        Button button = new Button("click me");

        button.addActionListener(new MyListener());

        frame.add(button);

        frame.setSize(500, 500);

        frame.addWindowListener(new MyWindowListener());

        frame.setVisible(true);
    }
}

class MyListener implements ActionListener {

    @Override
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent e) {
        Date date = new Date(e.getWhen());

        System.out.println(date.toLocaleString());
    }
}

class MyWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("窗口打开了");
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("关闭窗口");

        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("窗口已关闭");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}