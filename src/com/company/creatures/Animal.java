package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable,Feedable {
    final String species;
    public String name;
    File pic;
    protected Double weight;


    static final Double DEFAULT_DOG_WEIGHT = 25.0;
    static final Double DEFAULT_CAT_WEIGHT = 3.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;



    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Cat")) {
            weight = DEFAULT_CAT_WEIGHT;
        } else{
            weight = DEFAULT_OTHER_WEIGHT;
        }
    }

    @Override
    public void Feed (Double foodWeight) {
        if (weight<=0.0){
            System.out.println("Sorry bro, dead pet cannot eat");
        }
        weight ++;
        System.out.println("Thx , my weight is now " + weight);

    }

    void takeForWalk() {
        if (weight != 0) {
            weight--;
            System.out.println("My new weight" + weight);
        } else {
            System.out.println("You cannot walk with dead animal you bastard!");
        }
    }
    public String toString() {
        return this.species + " " + this.name;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Go earn money");
        }
        if(seller.pet != this){
            throw new Exception(("You can't sell" + this.toString()));
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println("Successful transaction");

        }

    }


    public abstract void beEaten() throws Exception;

}



