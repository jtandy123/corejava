package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer, DisplayElement {

    private List<Float> temperatures;

    private List<Float> humidities;

    private List<Float> pressures;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
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
        System.out.println("Forecast: coming soon");
    }
}
