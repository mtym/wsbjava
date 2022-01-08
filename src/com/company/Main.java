package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;


import java.net.MalformedURLException;

public class Main {



    public static <phone> void main(String[] args) throws MalformedURLException {

            Animal dog = new Pet("Dog");
            dog.name = "Tunia";

            dog.Feed();

            System.out.println("Hi, I'm " + dog.name);

            Human me = new Human("Maciej", "Nowak", 5000.00);
            me.cash = 5000;

            Human myWife = new Human("Julia", "Nowak", 4000.0);
            Human myBrother = new Human("Bartek", "Nowak", 4500.00);
            myWife.setSalary(2500.00);
            myWife.cash = 6000;
            me.setSalary(3000.00);
            myBrother.setSalary(5000.00);
            myWife.phone = new Phone("Samsung","A51",2011);
            myBrother.phone = new Phone("Xiaomi","XYZ",2015);
            me.phone = new Phone("Apple","XS",2019);


            Phone szajomi = new Phone("Xiaomi", "xxlxxs",2021);

            myBrother.phone = szajomi;
            Application fejsbuk = new Application("fejsbuk","1.0",15);
            Application livescore = new Application("livescore","2.0",20);
            Application twitch = new Application("twitch", "3.0",10);
            Application gmail = new Application("gmail","1.2",5);

            myBrother.phone.installAnApp(fejsbuk,myBrother);
            myBrother.phone.installAnApp(livescore, myBrother);
            myBrother.phone.installAnApp(twitch, myBrother);

            myBrother.phone.AppsByName();
            myBrother.phone.AppsByPrice();
            myBrother.phone.appsValue();
            myBrother.phone.FreeApps();
            myBrother.phone.checkIfAppIsInstalled(twitch);
            myBrother.phone.checkIfAppIsInstalled(fejsbuk);
            myBrother.phone.checkIfAppIsInstalled(gmail);








            Pet Jasiu = new Pet("cat");
            Pet Molly = new Pet("Hamster");

            Phone iphone = new Phone("Apple","8",2007);


            /*  try {
                me.phone.sell(me,myWife,10.00);
               }    catch (Exception e) {
                e.printStackTrace();
            } */










        //Car uno = new Car("Uno", "Fiat", 1999,1.2 );
            Phone phone = new Phone ("Apple", "Iphone 7", 2019);
         //   uno.color = "White";

          //  me.setCar(uno);


           // myBrother.setCar(uno);

           // System.out.println(me.getCar());
           // System.out.println(myBrother.getCar());




          // System.out.println(new Car("Uno", "Fiat", 1989, 1.2));


            System.out.println("I earn " + me.getSalary());
           // me.setSalary(1000.0);
            // me.setCar(uno);

            System.out.println(dog);
            System.out.println(me);
           // System.out.println(uno);
            System.out.println(myBrother);

            System.out.println(me.cash);




         //  uno.turnON();

            phone.turnON();
            System.out.println(new Phone("Apple", "Iphone 7", 2018 ));




        Molly.Feed();
        Molly.Feed(30.00);

            FarmAnimal boar = new FarmAnimal("boar");

            boar.Feed();
            boar.Feed();



          //  try {
          //      boar.beEaten();
          //  } catch (Exception e) {
          //     e.printStackTrace();
            // }


            try {
                iphone.installAnApp("mBank");
                iphone.installAnApp("Calculator","1.1.1");
                String[] appNames = {"Flight simulator", "Facebook",};
                iphone.installAnApp(appNames);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        Electric EcoCar = new Electric("Model S","Tesla",2019, 54.25);
        LPG LPGCar = new LPG("Golf", "Volkswagen",1999, 28.00);
        Diesel DieselCar = new Diesel("Touareg", "Volkswagen",2015,30000.00);

        me.PrintAllCars();
        me.SortCarsByYearOfProduction();

        me.PrintAllCars();

        me.getCar(0).sell(me,myWife,400);



        System.out.println("me cars:");
        me.PrintAllCars();
        System.out.println("myWife cars:");
        myWife.PrintAllCars();

        myWife.SortCarsByYearOfProduction();
        System.out.println(myWife.getCar(1));
        myWife.getCar(2).CountTransactions();


        myWife.getCar(1).TransactionHIstory(myWife,me);






        EcoCar.refuel();
        LPGCar.refuel();
        DieselCar.refuel();









    }


}