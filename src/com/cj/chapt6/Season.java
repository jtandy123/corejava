package com.cj.chapt6;

public class Season {

    private final String name;

    private final String desc;

    private static final Season SPRING = new Season("Spring", "Spring");

    private static final Season SUMMER = new Season("Summer", "Summer");

    private static final Season FALL = new Season("Fall", "Fall");

    private static final Season WINTER = new Season("Winter", "Winter");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static Season getSeason(int seasonNum) {
        switch (seasonNum) {
            case 1:
                return SPRING;
            case 2:
                return SUMMER;
            case 3:
                return FALL;
            case 4:
                return WINTER;
            default:
                return null;
        }
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
