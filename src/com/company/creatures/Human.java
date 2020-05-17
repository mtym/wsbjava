package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;


public class Human {
    String firstName;
    String lastName;
    public Phone phone;
    public Animal pet;
    public Car Car;
    private Double salary = 5000.0;
    public Double cash = 100.0;
    private Double weight;

    public Human(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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
            System.out.println("Your salary is now: " + salary);
            System.out.println("Data was sent to accounting system");
            System.out.println("Go to mrs Hania for annex to contract");
            System.out.println("Don't hide your salary - ZUS and US know about your new salary");
            this.salary = salary;
        }
    }


    public Car getCar() {
        return Car;
    }

    public void setCar(Car Car) {
        if (Car.value <= this.salary) {
            System.out.println("You bought a car");
            this.Car = Car;
        } else if (Car.value <= this.salary * 12) {
            System.out.println("You will pay for car credit for next 10 years");
            this.Car = Car;
        } else {
            System.out.println("Sorry, go to better work and earn more money ");
        }
    }

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










