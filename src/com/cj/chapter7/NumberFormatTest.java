package com.cj.chapter7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        double db = 1234000.567;
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN, Locale.US};
        NumberFormat[] nf = new NumberFormat[12];
        for (int i = 0; i < locales.length; i++) {
            nf[i * 3] = NumberFormat.getNumberInstance(locales[i]);
            nf[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            nf[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String[] tips = {"----中国的格式----", "----日本的格式----", "----德国的格式----", "----美国的格式----"};
            System.out.println(tips[i]);
            System.out.println(nf[i * 3].format(db));
            System.out.println(nf[i * 3 + 1].format(db));
            System.out.println(nf[i * 3 + 2].format(db));
        }
    }
}
