package com.ssy.network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlConnection2 {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.infoq.com");

//        URLConnection conn = url.openConnection();
//        InputStream is = conn.getInputStream();

        InputStream is = url.openStream();

        OutputStream os = new FileOutputStream("infoq.html");

        byte[] buffer = new byte[2048];

        int length = 0;

        while(-1 != (length = is.read(buffer, 0, buffer.length))) {
            os.write(buffer, 0, length);
        }

        is.close();
        os.close();
    }
}
