package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {

    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public Double value = 4000.0;




    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;

    }





    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract void turnON();

    public void sell() {
        System.out.println("You sold " + this.toString());
    }

}



