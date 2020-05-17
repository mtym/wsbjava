package com.company.devices;

public class LPG extends Car {
    Double LPGVolume;



    public LPG(String model, String producer, Integer yearOfProduction, Double LPGVolume) {
        super(model, producer, yearOfProduction, LPGVolume);
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.LPGVolume = LPGVolume;
    }
    public String toString() {
        return this.producer + " " + this.model;
    }    @Override
    public void refuel() {
        System.out.println(toString() + " Refueled by LPG")  ;


    }
}
