package com.cj.chapter7;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle.getBundle("test", myLocale);
        System.out.println(bundle.getString("test"));

        Locale currentLocale;
        if (args.length == 2) {
            currentLocale = new Locale(args[0], args[1]);
        } else {
            currentLocale = Locale.getDefault(Locale.Category.FORMAT);
        }

//        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("mess", currentLocale);
        String msg = rb.getString("msg");
        System.out.println(MessageFormat.format(msg, "andy", new Date()));
        System.out.println(rb.getString("test"));
    }
}
