package com.cj.chapter7;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();
        Locale[] locales = {Locale.CHINA, Locale.US};
        DateFormat[] df = new DateFormat[16];
        for (int i = 0; i < locales.length; i++) {
            df[i * 8] = DateFormat.getDateInstance(DateFormat.SHORT, locales[i]);
            df[i * 8 + 1] = DateFormat.getDateInstance(DateFormat.MEDIUM, locales[i]);
            df[i * 8 + 2] = DateFormat.getDateInstance(DateFormat.LONG, locales[i]);
            df[i * 8 + 3] = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
            df[i * 8 + 4] = DateFormat.getTimeInstance(DateFormat.SHORT, locales[i]);
            df[i * 8 + 5] = DateFormat.getTimeInstance(DateFormat.MEDIUM, locales[i]);
            df[i * 8 + 6] = DateFormat.getTimeInstance(DateFormat.LONG, locales[i]);
            df[i * 8 + 7] = DateFormat.getTimeInstance(DateFormat.FULL, locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String[] tips = {"----中国日期格式----", "----美国日期格式----"};
            System.out.println(tips[i]);
            System.out.println(df[i * 8].format(dt));
            System.out.println(df[i * 8 + 1].format(dt));
            System.out.println(df[i * 8 + 2].format(dt));
            System.out.println(df[i * 8 + 3].format(dt));
            System.out.println(df[i * 8 + 4].format(dt));
            System.out.println(df[i * 8 + 5].format(dt));
            System.out.println(df[i * 8 + 6].format(dt));
            System.out.println(df[i * 8 + 7].format(dt));
        }

        String str1 = "2018-08-01";
        String str2 = "2018年8月1日";
        System.out.println(DateFormat.getDateInstance().parse(str1));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).parse(str2));

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年中第D天");
        System.out.println(sdf.format(d));

        String str = "18###八月##1";
        SimpleDateFormat sdf1 = new SimpleDateFormat("y###MMM##d");
        System.out.println(sdf1.parse(str));
        System.out.println(sdf.format(sdf1.parse(str)));
    }
}
