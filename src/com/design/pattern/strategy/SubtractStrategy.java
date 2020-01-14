package com.design.pattern.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
