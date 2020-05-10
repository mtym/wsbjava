package com.company.devices;

public class Phone extends Device {
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


    @Override
    public void turnON() {
        System.out.println("Hello");
    }
}



