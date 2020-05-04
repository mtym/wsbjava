package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car Car;

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
        }








