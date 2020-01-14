package com.cj.chapter7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
    public static void main(String[] args) {
        if (!Pattern.matches("[A-Za-z0-9_.-]{1,50}", "")) {
            System.out.println("not match");
        } else {
            System.out.println("match");
        }

        String str = "hello, java!";
        System.out.println(str.replaceFirst("\\w*", "-"));
        System.out.println(str.replaceFirst("\\w*?", "-"));
        System.out.println(str.replaceAll("\\w*", "-")); // --,- --!-
        System.out.println(str.replaceAll("\\w*?", "-")); // -h-e-l-l-o-,- -j-a-v-a-!-

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        System.out.println(m.matches());
        System.out.println(Pattern.matches("a*b", "aaaaaab"));

        String s = "afafwefwefsfs, 13500006666ssdfsafdfafa13611125565fsafsfsafafadfas15899903312";
        Matcher matcher = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        String regStr = "Java is very easy!";
        System.out.println("target string: " + regStr);
        Matcher m1 = Pattern.compile("\\w+").matcher(regStr);
        while(m1.find()) {
            System.out.println(m1.group() + "子串的起始位置: " + m1.start() + ", 其结束位置: " + m1.end());
        }

        String[] mails = {"kongyeeku@163.com", "kongyeeku@gmail.com", "test@163.com2", "wawa@abc.xx"};
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher m2 = null;
        for (String mail : mails) {
            if (m2 == null) {
                m2 = mailPattern.matcher(mail);
            } else {
                m2.reset(mail);
            }
            String result = mail + (m2.matches() ? "是" : "不是") + "一个有效的邮件地址！";
            System.out.println(result);
        }

        System.out.println("------------------------------------");

        String[] msgs = {
                "Java has regular expressions in 1.4",
                "regular expressions now expressing in Java",
                "Java represses oracular expressions"
        };
        Pattern pattern = Pattern.compile("re\\w*");
        Matcher m3 = null;
        for (String msg : msgs) {
            if (m3 == null) {
                m3 = pattern.matcher(msg);
            } else {
                m3.reset(msg);
            }
            System.out.println(m3.replaceAll("哈哈:)"));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for (String msg : msgs) {
            System.out.println(msg.replaceFirst("re\\w*", "呵呵:)"));
            System.out.println(Arrays.toString(msg.split(" ")));
        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int[] iarr = new int[8];
        String[] sarr = new String[8];
        int i = 0;
        String s1 = "A1B2C3D4E5F6G7H8";
        Matcher matcher1 = Pattern.compile("\\d").matcher(s1);
        while(matcher1.find()) {
            iarr[i++] = Integer.valueOf(matcher1.group());
        }
        System.out.println(Arrays.toString(iarr));
        i = 0;
        Matcher matcher2 = Pattern.compile("[\\w&&[^0-9_]]").matcher(s1);
        while(matcher2.find()) {
            sarr[i++] = matcher2.group();
        }
        System.out.println(Arrays.toString(sarr));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(containSpace("ab "));
    }

    public static boolean containSpace(String phone) {
        Pattern pattern = Pattern.compile("[0-9a-zA-Z\u4E00-\u9FA5]{1,64}");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
