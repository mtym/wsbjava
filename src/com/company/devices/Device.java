package com.company.devices;

public abstract class Device {

    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public Double value = 5000.0;




    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;

    }





    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract void turnON();

}



