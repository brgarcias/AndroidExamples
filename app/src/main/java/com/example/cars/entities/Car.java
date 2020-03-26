package com.example.cars.entities;

import android.graphics.drawable.Drawable;

/**
 * Entidade de carros
 */
public class Car {

    public int id, horsePower;
    public String model, manufacturer;
    public Double price;
    public Drawable picture;

    public Car(int id, int horsePower, String model, String manufacturer, Double price, Drawable picture) {
        this.id = id;
        this.horsePower = horsePower;
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.picture = picture;
    }
}
