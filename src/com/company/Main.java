package com.company;

public class Main {



    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Tunia";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Car uno = new Car("Uno", "Fiat", "White");

        Human me = new Human();
        me.firstName = "Maciej";
        me.lastName = "Nowak";
        me.pet = dog;
        me.setCar(uno);

        

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Cat");
        me.pet.name = "Myszojeleń";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();
        me.pet.takeForWalk();


        me.setCar = new Car("Uno", "Fiat", "White");


        System.out.println("I earn " + me.getSalary());
        me.setSalary(1000.0);


        













    }
}