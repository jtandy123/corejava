package com.cj.chapter7;

import java.time.*;

public class NewDatePackageTest {
    public static void main(String[] args) {
        System.out.println("----------------Clock-----------------------");
        Clock clock = Clock.systemUTC();
        System.out.println("当前时刻为: " + clock.instant());
        System.out.println("UTC时区: " + clock.getZone());

        Clock clock1 = Clock.system(ZoneId.systemDefault());
        System.out.println("当前时区: " + clock1.getZone());

        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        System.out.println("-----------------Duration------------------");
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于: " + d.toMinutes() + "分");
        System.out.println("6000秒相当于: " + d.toHours() + "小时");
        System.out.println("6000秒相当于: " + d.toDays() + "天");

        Clock clock2 = Clock.offset(clock, d);
        System.out.println("当前时刻加6000秒为: " + clock2.instant());

        System.out.println("-----------------Instant-------------------");
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);

        Instant instant3 = Instant.parse("2018-07-30T04:12:00.001Z");
        System.out.println(instant3);

        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);

        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);

        System.out.println("-----------------LocalDate------------------");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = LocalDate.ofYearDay(2018, 365); // 获取2018年的146天
        System.out.println(localDate);
        localDate = LocalDate.of(2018, Month.JULY, 30);
        System.out.println(localDate);
        localDate = LocalDate.of(2018, 7, 30);
        System.out.println(localDate);

        System.out.println("-----------------LocalTime-------------------");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = LocalTime.of(22, 0);
        System.out.println(localTime);
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);

        System.out.println("-----------------LocalDateTime----------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println(future);

        System.out.println("----------------Year/YearMonth/MonthDay----------------");
        Year year = Year.now();
        System.out.println(year); // 2018
        year = year.plusYears(5);
        System.out.println(year); // 2023
        YearMonth ym = year.atMonth(5);
        System.out.println(ym); // 2023-05
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println(ym); // 2028-02
        MonthDay md = MonthDay.now();
        System.out.println(md); // --07-30
        md = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println(md); // --05-23
        System.out.println(md.atYear(2020)); // 2020-05-23
    }
}
