package com.cecil;

/**
 * Created by cecillee on 27/3/16.
 */
public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements("1709");
    }
}
