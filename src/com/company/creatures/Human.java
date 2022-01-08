package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.LPG;



public class Human {
    String firstName;
    String lastName;
    public Phone phone;
    public Animal pet;
    private double salary = 5000.0;
    public int cash = 1000.0;
    private Double weight;
    public Car[] garage;

    public Human(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.garage = new Car[4];
        this.garage[0] = (new LPG("126p","Fiat","1992","600",));
        this.garage[1] = (new LPG("Bravo","Fiat","1999","500"));
        this.garage[0].carOwners.add(this);
        this.garage[1].carOwners.add(this);

    }
    public Human(String firstName, String lastName, double salary, int garageSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        Car[] garage = new Car[garageSize];
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }


    public Double getSalary() {
        Double salary = this.salary;
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("sorry, I don't work for free");
        } else {
         //   System.out.println("Your salary is now: " + salary);
          //  System.out.println("Data was sent to accounting system");
          //  System.out.println("Go to mrs Hania for annex to contract");
           // System.out.println("Don't hide your salary - ZUS and US know about your new salary");
           // this.salary = salary;
        }
    }


    public Car getCar(int parkingSpace) {
        return garage[parkingSpace];
    }

    public void setCar(Car car,int parkingSpace) {
        this.garage.[parkingSpace] = car;

     //   if (Car.value <= this.salary)
     //         System.out.println("You bought a car");
     //      // this.Car = Car;
     //   } else if (Car.value <= this.salary * 12) {
     //       System.out.println("You will pay for car credit for next 10 years");
     //       this.Car = Car;
     //   } else {
     //       System.out.println("Sorry, go to better work and earn more money ");
        }
    public void PrintAllCars()
    {
        for (Car car: garage
        ) {
            if(car == null)
            {
                continue;
            }
            System.out.println(car.toString());

        }
    public void CarsValue() {
        double sum = 0;
        for (Car car : this.garage){
            sum += car.value;
        }

        System.out.println("Cars value = "  + sum);
    }

    Comparator<Car> compareByYear= new Comparator<Car>(){
        @Override
        public int compare(Car car,Car t1) {
            if (t1 ==null || car == null){
                return 0;
            }
            return
        car.getYearOfProduction().compareTo(t1.getYearOfProduction());

        }
    };

    public void sell() throws Exception {
        throw new Exception("Human trafficking is prohibited");
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    public void feed() {
        System.out.println("dziena");
    }

    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        if (foodWeight > 1.0) {
            System.out.println("nie ?");
        } else {
            System.out.println("dzięki, dzięki, a masz jeszcze?");
        }
    }
}

    public void SortCarsByYearOfProduction() {
        Arrays.sort(this.garage,compareByYear);
    }
    }










