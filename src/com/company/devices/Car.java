package com.company.devices;


import com.company.creatures.Human;
import com.company.Saleable;
import sun.awt.SunHints;

public abstract class Car extends Device implements Saleable {

     public Double Value;
     public String color;


     public Car(String model, String producer, Integer yearOfProduction, Double Value) {
          super(model, producer, yearOfProduction);
          this.value = Value;


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
          //      if (buyer.cash < price) {
          //           throw new Exception("Go earn money");
          //      }
          //      if(seller.getCar() != this){
          //           throw new Exception(("You can't sell" + this.toString()));
          //      } else {
          //           buyer.cash -= price;
          //           seller.cash += price;
          //      buyer.setCar(this);
          //           seller.setCar(null);
          //           System.out.println("Successful transaction");
          for (int i = 0; i <= seller.garage.length - 1; i++) {
               if (seller.garage[i].equals(this)) {
                    Car tempcar = seller.garage[i];
                    for (int j = buyer.garage.length - 1; j >= 0; j--) {
                         if (buyer.garage[j] == null) {
                              if (buyer.cash >= price) {
                                   seller.garage[i] = null;
                                   buyer.garage[j] = tempcar;
                                   buyer.cash <= price;
                                   seller.cash >= price;

                                   System.out.println("Transaction succes");
                                   return;

                              }

                         }
                    }

                    throw new Exception("Buyers garage full");
               }

          }
          throw new Exception("Seller haven't this car");
          // abstract public void refuel();
     }
}