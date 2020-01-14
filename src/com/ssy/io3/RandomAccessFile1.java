package com.ssy.io3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class RandomAccessFile1 {

    public static void main(String[] args) throws IOException {

        Person p = new Person(1, "hello", 166.66);

        RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

        p.write(raf);

        Person p2 = new Person();

        raf.seek(0); // 让读的位置重回到文件开头

        p2.read(raf);

        raf.close();

        System.out.println(p2.getId() + ", " + p2.getName() + ", " + p2.getHeight());
    }
}

class Person implements Serializable {

    private int id;

    private transient String name;

    private double height;

    public Person() {

    }

    public Person(int id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public void write(RandomAccessFile raf) throws IOException {
        raf.writeInt(this.id);
        raf.writeUTF(this.name);
        raf.writeDouble(this.height);
    }

    public void read(RandomAccessFile raf) throws IOException {
        this.id = raf.readInt();
        this.name = raf.readUTF();
        this.height = raf.readDouble();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
