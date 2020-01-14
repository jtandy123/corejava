package com.ssy.io3;

import java.io.*;

public class StreamTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("file.txt");

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("http://www.google.com");
        bw.write("\n");
        bw.write("http://www.baidu.com");

        bw.close();


        FileInputStream fis = new FileInputStream("file.txt");

        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);

//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine()); // null

        String str;

        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
    }
}
