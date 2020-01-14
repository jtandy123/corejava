package com.design.pattern.strategy;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();

        Environment environment = new Environment(strategy);

        System.out.println(environment.calculate(3, 4));

        environment.setStrategy(new SubtractStrategy());

        System.out.println(environment.calculate(3, 4));

        environment.setStrategy(new MultipleStrategy());

        System.out.println(environment.calculate(3, 4));

        environment.setStrategy(new DivideStrategy());

        System.out.println(environment.calculate(3, 4));
    }
}
