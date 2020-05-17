package com.company.devices;


import com.company.creatures.Human;
import com.company.Saleable;
import sun.awt.SunHints;

public abstract class Car extends Device implements Saleable {

     public  Double Value;
     public String color;


     public Car(String model, String producer, Integer yearOfProduction,Double Value) {
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
     abstract public void refuel();
}