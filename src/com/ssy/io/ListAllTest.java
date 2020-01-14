package com.ssy.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListAllTest {

    // 用于判断目录或文件所处的层次
    private static int level;

    // 递归的方法
    public static void deepList(File file) {
        if (file.isFile() || 0 == file.listFiles().length) {
            // level = 0;
            return;
        } else {
            File[] files = file.listFiles();
            files = sort(files);
            for (File f : files) {
                StringBuffer output = new StringBuffer();

                if (f.isFile()) {
                    output.append(getTabs(level)).append(f.getName());
                } else {
                    output.append(getTabs(level)).append(f.getName()).append("\\");
                }

                System.out.println(output);

                if (f.isDirectory()) {
                    level++;
                    deepList(f);
                    level--;
                }
            }
        }
    }

    // 整理文件数组，使得目录排在文件之前
    private static File[] sort(File[] files) {
        List<File> sorted = new ArrayList<>();

        for (File file : files) {
            if (file.isDirectory()) {
                sorted.add(file);
            }
        }

        for (File file : files) {
            if (file.isFile()) {
                sorted.add(file);
            }
        }

        return sorted.toArray(new File[files.length]);
    }

    // 获取对应层次的缩进
    private static String getTabs(int level) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < level; i++) {
            buffer.append("\t");
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        File file = new File("e:/data");
        deepList(file);
    }
}
