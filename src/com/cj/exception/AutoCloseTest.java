package com.cj.exception;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoCloseTest {
    public static void main(String[] args) throws java.lang.Exception {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/com/cj/exception/AutoCloseTest.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("src/a.txt"))
                )
        {
            System.out.println(br.readLine());
            ps.println("Oops, crap!");
        }
    }
}
