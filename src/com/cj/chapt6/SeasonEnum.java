package com.cj.chapt6;

public enum SeasonEnum {
    SPRING, SUMMER, FALL, WINTER;

    private String name;

    public static void main(String[] args) throws Exception {
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s.ordinal());
            System.out.println(s.name());
            System.out.println(s);
            System.out.println("------------");
        }
        System.out.println(SeasonEnum.SPRING.compareTo(SeasonEnum.SPRING));
        System.out.println(SeasonEnum.SPRING.compareTo(SeasonEnum.SUMMER));
        System.out.println(SeasonEnum.SPRING.compareTo(SeasonEnum.FALL));
        System.out.println(Enum.valueOf(SeasonEnum.class, "FALL") == SeasonEnum.FALL);

        System.out.println("--------------------");
        SeasonEnum s1 = SeasonEnum.SPRING;
        System.out.println(s1.name); // null
        s1.name = "spring";
        System.out.println(s1.name); // spring
        SeasonEnum s2 = SeasonEnum.valueOf("SPRING");
        SeasonEnum s3 = Enum.valueOf(SeasonEnum.class, "SPRING");
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // true
        SeasonEnum s4 = Enum.valueOf((Class<SeasonEnum>)SeasonEnum.SPRING.getClass(), "SPRING");
        System.out.println(s3 == s4); // true
        SeasonEnum s5 = Enum.valueOf((Class<SeasonEnum>)Class.forName("com.cj.chapt6.SeasonEnum"), "SPRING");
        System.out.println(s4 == s5); // true
        System.out.println(SeasonEnum.class);
        System.out.println(SeasonEnum.SPRING.getClass() == SeasonEnum.class); // true

        System.out.println("-----------------");

        int i = 5;
        System.out.println(((Integer)i).getClass()); // class java.lang.Integer
        System.out.println(int.class); // int
        System.out.println(Integer.TYPE); // int
        System.out.println(Integer.class); // class java.lang.Integer
    }
}
