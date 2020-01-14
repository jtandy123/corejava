package com.design.pattern.strategy;

public class MultipleStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
