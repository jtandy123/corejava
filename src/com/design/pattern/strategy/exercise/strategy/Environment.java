package com.design.pattern.strategy.exercise.strategy;

import java.util.List;

public class Environment {

    private Sorter sorter;

    public Environment(Sorter sorter) {
        this.sorter = sorter;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sort(List<Person> list) {
        this.sorter.sort(list);
    }
}
