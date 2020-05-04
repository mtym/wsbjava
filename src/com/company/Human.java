package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public Car setCar;
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car Car;

    private Double salary = 1000.0;




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
        if(Car.value <= this.salary){
            System.out.println("Great, you bought car by cash");
            this.Car = Car;
        } else if (Car.value <= this.salary * 12){
            System.out.println("Not so great, you bought car on credit");
            this.Car = Car;
        }else {
            System.out.println("Sorry, find cheaper car");
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
	}










