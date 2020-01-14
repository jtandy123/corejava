package com.cj.chapter7;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Scanner sc = new Scanner(is);
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            String s = sc.next();
            if ("#".equals(s)) {
                is.close();
            }
            System.out.println(s);
        }

        Scanner sc2 = new Scanner(new File("./src/com/cj/chapter7/ScannerTest.java"));
        while(sc2.hasNextLine()) {
            System.out.println(sc2.nextLine());
        }

        Scanner sc3 = new Scanner("test\nscanner");
        while(sc3.hasNextLine()) {
            System.out.println(sc3.nextLine());
        }
    }
}
