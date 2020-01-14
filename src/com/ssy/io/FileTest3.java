package com.ssy.io;

import java.io.File;

public class FileTest3 {

    public static void main(String[] args) {

        File file = new File("e:/abc/xyz/hello");

        System.out.println(file.mkdirs());

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
