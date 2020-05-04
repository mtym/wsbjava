package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;


    static final Double DEFAULT_DOG_WEIGHT = 30.0;
    static final Double DEFAULT_CAT_WEIGHT = 3.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species =="Cat") {
            weight = DEFAULT_CAT_WEIGHT;
        } else{
            weight = DEFAULT_OTHER_WEIGHT;
        }
    }


    void feed() {
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
            System.out.println("You cannot walk with dead dog you bastard!");
        }
    }


}
