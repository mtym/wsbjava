package com.company.devices;


import com.company.creatures.Human;
import com.company.Saleable;
import sun.awt.SunHints;
import  java.util.ArrayList;

public abstract class Car extends Device implements Saleable {

     public Double Value;
     public String color;
     public ArrayList<Human> carOwners;


     public Car(String model, String producer, Integer yearOfProduction, Double Value) {
          super(model, producer, yearOfProduction);
          this.value = Value;
          this.carOwners = new ArrayList<Human>();


     }

     public void CheckOwner(Human human) {
          if (carOwners.contains(human)) {
               System.out.println(human.getFirstName() + "own this car");
          } else {
               System.out.println(human.getFirstName() + "dont have this car");
          }
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
               if (seller.garage[i].equals(this)) &&
                    seller.garage[i].carOwners.get(carOwners.size() -1) == seller) {
                    Car tempcar = seller.garage[i];
                    for (int j = buyer.garage.length - 1; j >= 0; j--) {
                         if (buyer.garage[j] == null) {
                              if (buyer.cash >= price) {
                                   seller.garage[i] = null;
                                   buyer.garage[j] = tempcar;
                                   buyer.cash <= price;
                                   seller.cash >= price;

                                   System.out.println("Transaction succes");
                                   tempcar.carOwners.add(buyer);
                                   return;

                              }

                         }
                    }

                    throw new Exception("Buyers garage full");
               }

          }
          throw new Exception("Seller haven't this car");


          //abstract public void refuel();
     }
}

     public void CountTransactions() {
          System.out.println("Transaction :" + this.carOwners.size());
     }

     public void TransactionHIstory(Human owner , Human lastOwner) {
          int checkvalue = this.carOwners.indexOf(owner);
          if (this.carOwners.get(checkvalue-1) == lastOwner)
          {
               System.out.println(owner.getFirstName() + " bought  car from " + lastOwner.getFirstName());
          }
          else
          {
               System.out.println(owner.getFirstName() + " bought this car form another person");

          }
     }
}