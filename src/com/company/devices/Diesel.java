package com.company.devices;

public class Diesel extends Car {
    Double DieselVolume;



    public Diesel(String model, String producer, Integer yearOfProduction, Double DieselVolume) {
        super(model, producer, yearOfProduction, DieselVolume);
        this.model = model ;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.DieselVolume = DieselVolume;

    }
    public String toString() {
        return this.producer + " " + this.model;
    }



    @Override
    public void refuel() {
    System.out.println(toString() + " Refueled by Diesel" );

    }
}
