package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {



    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Tunia";

        System.out.println("Hi, I'm " + dog.name);


        Human me = new Human();
        me.firstName = "Maciej";
        me.lastName = "Nowak";
        me.pet = dog;




        dog.feed();
        me.pet.feed();
        me.pet.takeForWalk();

        Car uno = new Car("Uno", "Fiat", 1999,1.2 );
        Phone phone = new Phone ("Apple", "Iphone 7", 2019);
        uno.color = "White";





        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Cat");
        me.pet.name = "Myszojeleń";










       ;

       System.out.println(new Car("Uno", "Fiat", 1999, 1.2));


        System.out.println("I earn " + me.getSalary());
        me.setSalary(1000.0);
        me.setCar(uno);

        System.out.println(dog);
        System.out.println(me);
        System.out.println(uno);
        uno.turnON();

        phone.turnON();
        System.out.println(new Phone("Apple", "Iphone 7", 2019 ));














        













    }
}