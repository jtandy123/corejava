package com.cj.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./src/a.txt");
        } catch(FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
            // return;
            System.exit(1);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                    ioe.printStackTrace();
                }
            }
            System.out.println("finally resource collection");
        }
    }
}
