package com.ssy.io3;

import java.io.*;

public class SerializableTest1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person2 p1 = new Person2(20, "zhangsan", 4.55);
        Person2 p2 = new Person2(50, "lisi", 4.67);
        Person2 p3 = new Person2(10, "wangwu", 17.78);

        FileOutputStream fos = new FileOutputStream("person.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();

        System.out.println("---------------------");

        FileInputStream fis = new FileInputStream("person.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Person2 p = null;

        for (int i = 0; i < 3; i++) {
            p = (Person2) ois.readObject();

            System.out.println(p.getId() + ", " + p.getName() + ", " + p.getHeight());
        }

        ois.close();
    }
}

class Person2 implements Serializable {

    private int id;

    private transient String name;

    private double height;

    public Person2() {

    }

    public Person2(int id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
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

