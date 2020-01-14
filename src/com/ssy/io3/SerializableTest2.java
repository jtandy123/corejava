package com.ssy.io3;

import java.io.*;

public class SerializableTest2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person3 p1 = new Person3(20, "zhangsan", 4.55);
        Person3 p2 = new Person3(50, "lisi", 4.67);
        Person3 p3 = new Person3(10, "wangwu", 17.78);

        FileOutputStream fos = new FileOutputStream("person2.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();

        System.out.println("---------------------");

        FileInputStream fis = new FileInputStream("person2.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Person3 p = null;

        for (int i = 0; i < 3; i++) {
            p = (Person3) ois.readObject();

            System.out.println(p.getId() + ", " + p.getName() + ", " + p.getHeight());
        }

        ois.close();
    }
}

class Person3 implements Serializable {

    private int id;

    private transient String name;

    private double height;

    public Person3() {

    }

    public Person3(int id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    // 当提供了这两个方法后，序列化和反序列化变成自定义逻辑，需要自己实现
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);

        System.out.println("write object");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = in.readUTF();

        System.out.println("read object");
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


