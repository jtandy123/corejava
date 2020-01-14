package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Float> temperatures;

    private List<Float> humidities;

    private List<Float> pressures;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();
        pressures = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg(temperatures) + "/" + max(temperatures) + "/" + min(temperatures) );
    }

    private float avg(List<Float> list) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        float sum = 0;
        for (float item : list) {
            sum += item;
        }
        return sum / list.size();
    }

    private float max(List<Float> list) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        float max = 0;
        for (float item : list) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private float min(List<Float> list) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        float min = list.get(0);
        for (float item : list) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
}
