package com.ssy.io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

    public static void main(String[] args) throws IOException {

        File file = new File("e:/abc");

        File file2 = new File(file, "hello.text");

        File file3 = new File("e:/abc", "xyz/hello.txt");

        file2.createNewFile();

        file3.createNewFile();
    }
}
