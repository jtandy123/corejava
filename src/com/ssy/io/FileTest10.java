package com.ssy.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest10 {

    public static void printAll(File file, int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += '\t';
        }
        System.out.println(indent + (level + 1) + ":" + file.getName());

        if (file.isDirectory() && file.list().length > 0) {
            File[] files = file.listFiles();
            List<File> dirs = new ArrayList<>();
            List<File> documents = new ArrayList<>();

            for (File f : files) {
                if (f.isFile()) {
                    documents.add(f);
                }
                if (f.isDirectory()) {
                    dirs.add(f);
                }
            }

            for (File f : dirs) {
                printAll(f, level + 1);
            }
            for (File f : documents) {
                printAll(f, level + 1);
            }
        }
    }

    public static void main(String[] args) {

        File file = new File("e:/PhpstormProjects");

        printAll(file, 0);
    }
}
