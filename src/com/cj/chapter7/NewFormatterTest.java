package com.cj.chapter7;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter[] formatters = new DateTimeFormatter[] {
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL),
                DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
        };
        LocalDateTime date = LocalDateTime.now();
        for (DateTimeFormatter formatter : formatters) {
            System.out.println(date.format(formatter));
            System.out.println(formatter.format(date));

            Format format = formatter.toFormat();
            System.out.println(format.format(date));
        }

        System.out.println("----------------------------------");
        String str1 = "2018==08==01 23时13分09秒";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        LocalDateTime dt1 = LocalDateTime.parse(str1, formatter1);
        System.out.println(dt1);

        String str2 = "2018$$$八月$$$01 20小时";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH小时");
        LocalDateTime dt2 = LocalDateTime.parse(str2, formatter2);
        System.out.println(dt2);
    }
}
