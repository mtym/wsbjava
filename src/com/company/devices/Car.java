package com.company.devices;

public class Car {
     final String model;
     final String producer;
     String  color;

     public Car(String model, String producer, String color) {
          this.model = model;
          this.producer = producer;
          this.color = color;

     }
     public Double value;

     {
          value = 50000.0;
     }
    	    public String toString() {
                 return "Car " + this.producer + " " + this.model + " " + this.color;
            }



}