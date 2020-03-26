package com.example.cars.data;

import android.app.Activity;


import androidx.core.content.ContextCompat;

import com.example.cars.R;
import com.example.cars.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;

    public CarMock(Activity activity) {
        this.mListCars = getCarMockList(activity);
    }

    public List<Car> getList() {
        return this.mListCars;
    }

    public Car get(int id) {
        return this.mListCars.get(id);
    }

    public List<Car> getCarMockList(Activity activity) {
        List<Car> mMockList = new ArrayList<>();
        int id = 0;
        Car audiR8 = new Car(id, 610, "Audi R8", "Audi", Double.valueOf(1165338.00), ContextCompat.getDrawable(activity, R.drawable.audir8));
        mMockList.add(audiR8);
        Car bugattiChiron = new Car(++id, 1520, "Bugatti Chiron", "Bugatti", Double.valueOf(16663388.00), ContextCompat.getDrawable(activity, R.drawable.bugattichiron));
        mMockList.add(bugattiChiron);
        Car civicTyper = new Car(++id, 310, "Civic Typer", "Honda", Double.valueOf(136000.00), ContextCompat.getDrawable(activity, R.drawable.civictyper));
        mMockList.add(civicTyper);
        Car corolla = new Car(++id, 144, "Corolla", "Toyota", Double.valueOf(161000.00), ContextCompat.getDrawable(activity, R.drawable.corolla));
        mMockList.add(corolla);
        Car ferrari458 = new Car(++id, 670, "Ferrari 458", "Ferrari", Double.valueOf(1506000.00), ContextCompat.getDrawable(activity, R.drawable.ferrari458));
        mMockList.add(ferrari458);
        Car ferrariF60America = new Car(++id, 760, "Ferrari F60 America", "Ferrari", Double.valueOf(2500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrarif60america));
        mMockList.add(ferrariF60America);
        Car jaguarFType = new Car(++id, 340, "Jaguar F Type", "Jaguar", Double.valueOf(500000.00), ContextCompat.getDrawable(activity, R.drawable.jaguarftype));
        mMockList.add(jaguarFType);
        Car jeepRenegade = new Car(++id, 139, "Jeep Renegade", "Jeep", Double.valueOf(79000.00), ContextCompat.getDrawable(activity, R.drawable.jeeprenegade));
        mMockList.add(jeepRenegade);
        Car lamborghiniAventador = new Car(++id, 700, "Lamborghini Aventador", "Lamborghini", Double.valueOf(2860000.00), ContextCompat.getDrawable(activity, R.drawable.lamborghiniaventador));
        mMockList.add(lamborghiniAventador);
        Car mcLarenMp412c = new Car(++id, 625, "McLaren Mp 412c", "McLaren", Double.valueOf(2280000.00), ContextCompat.getDrawable(activity, R.drawable.mclarenmp412c));
        mMockList.add(mcLarenMp412c);
        Car mustang = new Car(++id, 533, "Mustang", "Ford", Double.valueOf(270000.00), ContextCompat.getDrawable(activity, R.drawable.mustang));
        mMockList.add(mustang);
        Car porsche911 = new Car(++id, 435, "Porsche 911", "Porsche", Double.valueOf(565000.00), ContextCompat.getDrawable(activity, R.drawable.porsche911));
        mMockList.add(porsche911);
        Car rangeRover = new Car(++id, 285, "Range Rover", "Range Rover", Double.valueOf(224600.00), ContextCompat.getDrawable(activity, R.drawable.rangerover));
        mMockList.add(rangeRover);
        Car vanquish = new Car(++id, 573, "Vanquish", "Aston Martin", Double.valueOf(1650000.00), ContextCompat.getDrawable(activity, R.drawable.vanquish));
        mMockList.add(vanquish);
        return mMockList;
    }

}
