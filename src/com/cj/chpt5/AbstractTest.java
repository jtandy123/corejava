package com.cj.chpt5;

abstract class AbstractTest {
    public static void main(String[] args) {
        Shape shape = new Triangle(3, 4);
        System.out.println(shape.calArea());
    }
}

abstract class Shape {
    public Shape() {
        System.out.println("abstract class constructor");
    }

    public abstract double calArea();

    public void info() {
        System.out.println("abstract class concrete method info()");
    }

    private void test() {
        System.out.println("abstract class private method test()");
    }
}

class Triangle extends Shape {
    private double width;

    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
        super.info();
    }

    public double calArea() {
        return this.width * this.height / 2;
    }
}
