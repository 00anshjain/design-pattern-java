package com.designpattern.observerdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new TvDisplay());
        weatherStation.addObserver(new PhoneDisplay());

        weatherStation.setWeather("Sunny");

/*
Output
TV Display: Weather updated - Sunny
Phone Display: Weather updated - Sunny
 */
        SpringApplication.run(ObserverDesignPatternApplication.class, args);
    }

}
