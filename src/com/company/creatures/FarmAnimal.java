package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);

    }

    @Override
    public void beEaten() {
        System.out.println("Very good meal");

    }

    @Override
    public void Feed() {

    }

    @Override
    public void Feed(Double foodWeight) {

    }
}
