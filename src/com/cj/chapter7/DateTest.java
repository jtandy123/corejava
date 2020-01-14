package com.cj.chapter7;

import static java.util.Calendar.*;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.joda.time.DateTime;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("---------------Date----------------");
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 1000);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2)); // -1
        System.out.println(d1.before(d2)); // true

        System.out.println("---------------Calendar------------");
        Calendar c1 = Calendar.getInstance();
        Date d3 = c1.getTime();

        Calendar c2 = Calendar.getInstance();
        c2.setTime(d3);

        Calendar c3 = Calendar.getInstance();
        System.out.println(c3.get(YEAR));
        System.out.println(c3.get(MONTH));
        System.out.println(c3.get(DATE));
        c3.set(2018, Calendar.JULY, 27, 22, 11, 0);
        System.out.println(c3.getTime());
        System.out.println(c3.getTimeInMillis());
        System.out.println(c3.getTimeZone().getID());

        c3.add(YEAR, -1);
        System.out.println(c3.getTime()); // Thu Jul 27 22:11:00 CST 2017
        c3.roll(MONTH, -7);
        System.out.println(c3.getTime()); // Wed Dec 27 22:11:00 CST 2017, 不会进位

        Calendar c4 = Calendar.getInstance();
        c4.set(2003, Calendar.JULY, 31, 22, 11, 0);
        c4.add(MONTH, 7);
        System.out.println(c4.getTime()); // Sun Feb 29 22:11:00 CST 2004

        Calendar c5 = Calendar.getInstance();
        c5.set(2003, Calendar.JULY, 31, 22, 11, 0);
        c5.roll(MONTH, 7);
        System.out.println(c5.getTime()); // Fri Feb 28 22:11:00 CST 2003

        // set延迟设置
        Calendar c6 = Calendar.getInstance();
        c6.set(2003, 7, 31);
        c6.set(MONTH, 8);
        c6.set(MONTH, 10);
//        System.out.println(c6.getTime()); // Mon Dec 01 22:51:14 CST 2003
        c6.set(DATE, 5);
        System.out.println(c6.getTime()); // Wed Nov 05 22:52:20 CST 2003

        System.out.println("-------------------java.time----------------");
        System.out.println(DayOfWeek.MONDAY.getValue()); // 1
        System.out.println(Month.JANUARY.getValue()); // 1
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md); // --07-27
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println(md2); // --05-23


        System.out.println("-------------------Joda-----------------");
        // Joda Time
        DateTime dateTime = new DateTime(2018, 7, 27, 20, 45, 0);
        System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
        DateTime dateTime1 = new DateTime();
        System.out.println(dateTime1);
    }
}
