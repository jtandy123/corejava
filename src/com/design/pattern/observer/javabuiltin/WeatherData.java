package com.design.pattern.observer.javabuiltin;

import java.util.Observable;

/**
 * We don't need to keep track of our observers anymore, or manage their registration and removal(the superclass will handle that)
 * Nerver depend on order of evaluation of the Observer notifications.
 * Observable中使用Object[]来存储注册的Observer, 当状态发生变化，notifyObservers()的通知顺序为add的倒序，即最后加入的Observer先通知
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {} // Constructor no longer needs to create a data structure to hold Observers.

    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // We aren't sending a data object with the notifyObservers() call. That means we're using the PULL model.
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // we are going to use "pull". The Observers will use them to get at the WeatherData object's state
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
