package com.company.devices;


public class Car extends Device {

     public final Double engineVolume;
     public String color;


     public Car(String model, String producer, Integer yearOfProduction, Double engineVolume) {
          super(model, producer, yearOfProduction);
          this.engineVolume = engineVolume;


     }




     public String toString() {
          return "Car " + super.toString() + " " + this.color;
     }

     @Override
     public void turnON() {
          System.out.println("Engine started");

     }








}