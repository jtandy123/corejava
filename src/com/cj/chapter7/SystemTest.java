package com.cj.chapter7;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + " ---> " + env.get(name));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Properties props = System.getProperties();
        Set<Object> propsKeySet = props.keySet();
        for (Object key : propsKeySet) {
            System.out.println(key + " -> " + props.get(key));
        }
        props.store(new FileOutputStream("props.txt"), "System Properties");
        System.out.println();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}
