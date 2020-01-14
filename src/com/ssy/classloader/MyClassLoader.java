package com.ssy.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

public class MyClassLoader extends ClassLoader {

    private String name; // 类加载器的名字

    private String path = "d:\\"; // 加载类的路径

    private final String fileType = ".class"; // class文件的扩展名

    public MyClassLoader(String name) {
        super(); // 让系统类加载器成为该类加载器的父加载器
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent); // 显式指定该类加载器的父加载器
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class<?> findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {

        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            name = name.replaceAll("\\.", "\\\\");
            is = new FileInputStream(new File(this.path + name + this.fileType));

            baos = new ByteArrayOutputStream();

            int ch = 0;
            while(-1 != (ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws Exception {

        MyClassLoader loader1 = new MyClassLoader("loader1");

        loader1.setPath("d:\\myapp\\serverlib\\");

        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");

        loader2.setPath("d:\\myapp\\clientlib\\");

        MyClassLoader loader3 = new MyClassLoader(null, "loader3");

        loader3.setPath("d:\\myapp\\otherlib\\");

//        test(loader2);
//        System.out.println("-----------------------");
//        test(loader3);

        // 不在同一个类加载器命名空间的类无法访问
//        Class clazz = loader3.loadClass("com.ssy.classloader.Sample");
//        Object object = clazz.newInstance(); // 创建一个Sample类的对象
//        Sample sample = (Sample)object;
//        System.out.println(sample.v1);

        // 反射可以跨类加载器命名空间访问
//        Class clazz = loader3.loadClass("com.ssy.classloader.Sample");
//        Object object = clazz.newInstance(); // 创建一个Sample类的对象
//        Field field = clazz.getField("v1");
//        int v1 = field.getInt(object);
//        System.out.println("v1: " + v1);

        Class clazz = loader3.loadClass("com.ssy.classloader.Sample");
        System.out.println(clazz.hashCode());
        Object object = clazz.newInstance();
        loader3 = null;
        clazz = null;
        object = null;

        loader3 = new MyClassLoader(null,"loader3");
        loader3.setPath("d:\\myapp\\otherlib\\");
        clazz = loader3.loadClass("com.ssy.classloader.Sample");
        System.out.println(clazz.hashCode());

    }

    public static void test(ClassLoader loader) throws Exception {
        Class clazz = loader.loadClass("com.ssy.classloader.Sample");
        Object object = clazz.newInstance();
    }
}
