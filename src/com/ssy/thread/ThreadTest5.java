package com.ssy.thread;

public class ThreadTest5 {

    public static void main(String[] args) {

        Example2 e = new Example2();

        TheThread3 t3 = new TheThread3(e);
        TheThread4 t4 = new TheThread4(e);

        t3.start();
        t4.start();
    }
}

class Example2 {

    public void execute() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("hello: " + i);
            }
        }
    }

    public void execute2() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("world: " + i);
            }
        }
    }
}

class TheThread3 extends Thread {

    private Example2 example;

    public TheThread3(Example2 example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.execute();
    }
}

class TheThread4 extends Thread {

    private Example2 example;

    public TheThread4(Example2 example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.execute2();
    }
}
