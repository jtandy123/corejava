package com.ssy.io3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src/com/ssy/io3/FileReader1.java");

        BufferedReader br = new BufferedReader(fr);

        String str;

        while(null != (str = br.readLine())) {
            System.out.println(str);
        }

        br.close();
    }
}
