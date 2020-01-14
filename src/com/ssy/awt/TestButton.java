package com.ssy.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton {

    public static void main(String[] args) {

        Frame frame = new Frame("Test Button");

        Button button = new Button("Press me!");

        button.addActionListener(new ButtonHandler());

        frame.add(button);

        frame.pack();

        frame.setVisible(true);

    }
}

class ButtonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is pressed");

        String label = e.getActionCommand();

        System.out.println(label);

        System.out.println(e.getWhen());

        System.out.println(e.paramString());

        System.out.println(e.getSource());

        System.out.println(e);
    }
}
