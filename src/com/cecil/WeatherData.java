package com.cecil;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by cecillee on 27/3/16.
 */
public class WeatherData extends Observable {
    private ArrayList observers;

    private String params;

    public WeatherData()
    {
    }

    /*@Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(params);
        }
    }*/

    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(String params)
    {
        this.params = params;
        measurementsChanged();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
