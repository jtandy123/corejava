package com.ssy.io;

import java.io.File;
import java.io.IOException;

public class FileTest5 {

    public static void main(String[] args) throws IOException {

        File file = new File("e:/abc/xyz/hello/abc.txt");

        // file.createNewFile();

        file.delete();
    }
}
