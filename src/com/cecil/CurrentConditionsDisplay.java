package com.cecil;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by cecillee on 27/3/16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String params;
    private Subject weatherData;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions:" + params);
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) observable;
            this.params = weatherData.getParams();
            display();
        }
    }
}
