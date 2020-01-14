package com.ssy.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest7 {

    public static void main(String[] args) {

        File file = new File("e:/abc/xyz/hello");

        String[] names = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        for (String name : names) {
            System.out.println(name);
        }
    }
}
