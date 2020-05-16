package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        double screenSize;

    }


    @Override
    public void turnON() {
        System.out.println("Hello");
    }
    public String getProducer() {
        return producer;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Go earn money");
        }
        if(seller.phone != this){
            throw new Exception(("You can't sell" + this.toString()));
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = this;
            System.out.println("Successful transaction");

        }
    }
}




