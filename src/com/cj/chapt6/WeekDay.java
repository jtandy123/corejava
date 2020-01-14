package com.cj.chapt6;

public enum WeekDay {
    SUN {
        public void vv() {
            System.out.println(++ss);
        }
    },

    MON {
        public void vv() {
            System.out.println(++ss);
        }
    };

    private static int ss = 9;

    WeekDay() {
        System.out.println(this.name() + "被初始化");
    }

    public abstract void vv();

    public static void main(String[] args) {
        WeekDay wd = WeekDay.SUN;
        wd.vv();
        wd = WeekDay.MON;
        wd.vv();
    }
}
