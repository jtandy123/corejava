package com.cj.chapt6;

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("test information");
        Out.StaticIn sin = new Out.StaticIn("static test information");

        StaticSubClass ssc = new StaticSubClass();
    }
}

class Out {
    class In {
        public In(String msg) {
            System.out.println(msg);
        }
    }

    static class StaticIn {
        public StaticIn(String msg) {
            System.out.println(msg);
        }
    }
}

class StaticSubClass extends Out.StaticIn {
    public StaticSubClass() {
        super("test");
    }
}
