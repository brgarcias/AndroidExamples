package com.example.cars.entities;

public class Car {

    public int id, horsePower;
    public String model;
    public Double price;

    public Car(int id, String model, int horsePower, Double price) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }


}
