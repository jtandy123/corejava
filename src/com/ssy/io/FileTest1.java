package com.ssy.io;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

    public static void main(String[] args) throws IOException {

        System.out.println(File.separator);

        File file = new File("e:" + File.separator + "text_new.txt");

        System.out.println(file.createNewFile());
    }
}
