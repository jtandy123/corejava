package com.ssy.awt;

import java.awt.*;

public class MyFrame extends Frame
{

    public MyFrame(String title)
    {
        super(title);
    }

    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame("First GUI app");

        frame.setSize(500, 500);
        frame.setBackground(Color.CYAN);

        frame.setVisible(true);
    }
}
