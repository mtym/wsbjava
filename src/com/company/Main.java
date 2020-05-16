package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {



    public static void main(String[] args) {

        Animal dog = new Pet("Dog");
        dog.name = "Tunia";

        dog.Feed();

        System.out.println("Hi, I'm " + dog.name);


        Human me = new Human("Maciej", "Nowak", 5000.00);


        Pet Jasiu = new Pet("cat");
        Pet Molly = new Pet("Hamster");






        Car uno = new Car("Uno", "Fiat", 1999,1.2 );
        Phone phone = new Phone ("Apple", "Iphone 7", 2019);
        uno.color = "White";

        me.setCar(uno);

        Human myBrother = new Human("Bartek", "Nowak", 4500.00);
        myBrother.setCar(uno);

        System.out.println(me.getCar());
        System.out.println(myBrother.getCar());




       System.out.println(new Car("Uno", "Fiat", 1989, 1.2));


        System.out.println("I earn " + me.getSalary());
        me.setSalary(1000.0);
        me.setCar(uno);

        System.out.println(dog);
        System.out.println(me);
        System.out.println(uno);
        System.out.println(myBrother);



        uno.turnON();

        phone.turnON();
        System.out.println(new Phone("Apple", "Iphone 7", 2018 ));



        Molly.Feed();
        Molly.Feed(30.00);

        FarmAnimal boar = new FarmAnimal("boar");

        try {
            boar.beEaten();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}