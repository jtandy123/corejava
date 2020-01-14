package com.ssy.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * 一个组件同类型的监听器最多只能添加2个
 */

public class TwoListen implements MouseListener, MouseMotionListener {

    private Frame frame;

    private TextField textField;

    public void go() {
        frame = new Frame("Two Listeners Example");

        frame.add(new Label("click"), BorderLayout.NORTH);

        textField = new TextField(30);

        frame.add(textField, BorderLayout.SOUTH);

        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);

        frame.addMouseListener(new MyMouseListener());

        frame.addMouseListener(new MyMouseListener2());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TwoListen two = new TwoListen();

        two.go();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        textField.setText("The mouse has entered the Frame self");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        textField.setText("The mouse has exited the Frame self");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String str = "x: " + e.getX() + ", y: " + e.getY();
        textField.setText(str);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class MyMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("The mouse has entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("The mouse has exited the Frame");
    }
}

class MyMouseListener2 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("The mouse has entered the Frame 2");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("The mouse has exited the Frame 2");
    }
}
