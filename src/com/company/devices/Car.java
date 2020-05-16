package com.company.devices;


import com.company.creatures.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {

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
          System.out.println("Start engine");

     }

     @Override
     public void sell(Human seller, Human buyer, Double price) throws Exception {
          if (buyer.cash < price) {
               throw new Exception("Go earn money");
          }
          if(seller.getCar() != this){
               throw new Exception(("You can't sell" + this.toString()));
          } else {
               buyer.cash -= price;
               seller.cash += price;
               buyer.setCar(this);
               seller.setCar(null);
               System.out.println("Successful transaction");

          }


     }
}