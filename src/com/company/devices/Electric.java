package com.company.devices;

public class Electric extends Car {
    Double batteryCapacity;




    public Electric(String model, String producer, Integer yearOfProduction, Double batteryCapacity) {
        super(model, producer, yearOfProduction, batteryCapacity);
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this .batteryCapacity = batteryCapacity;
    }
    public String toString() {
        return this.producer + " " + this.model;
    }

    @Override
    public void refuel() {
        System.out.println(toString() + " Battery Charged");

    }
}
