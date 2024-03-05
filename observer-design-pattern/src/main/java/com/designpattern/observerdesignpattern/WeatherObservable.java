package com.designpattern.observerdesignpattern;

public interface WeatherObservable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
