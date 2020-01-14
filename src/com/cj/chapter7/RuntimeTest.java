package com.cj.chapter7;

import java.io.File;

public class RuntimeTest {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors());
        System.out.println("JVM中空闲内存数：" + rt.freeMemory() + " bytes");
        System.out.println("JVM中总内存数：" + rt.totalMemory() + " bytes");
        System.out.println("JVM将尝试使用的最大内存数：" + rt.maxMemory() + " bytes");

        File dir = new File("C:/Windows/System32");
        String[] cmdArr = {"calc.exe", "notepad.exe"};
        rt.exec(cmdArr, null, dir);
    }
}
