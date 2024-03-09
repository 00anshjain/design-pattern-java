package com.designpattern.observerdesignpattern;

public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
