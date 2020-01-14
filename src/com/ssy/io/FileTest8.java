package com.ssy.io;

import java.io.File;
import java.io.IOException;

public class FileTest8 {

    public static void main(String[] args) throws IOException {
        File file = new File("e:" + File.separator + "hello.txt");

        file.createNewFile();

        File file2 = new File(File.separator);

        File file3 = new File(file2, "abc.text");

        System.out.println(file3.createNewFile());
    }
}
