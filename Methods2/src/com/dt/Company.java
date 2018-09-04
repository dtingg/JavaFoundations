package com.dt;

public class Company {
    public static void main(String[] args){

        Employee harry = new Employee("Harry", "programmer", 50000);
        harry.raiseSalary(5);
        System.out.println(harry.toString());

        Manager frank = new Manager("Frank", "manager", 90000);
        frank.setBonus(5000);
        frank.raiseSalary(5);
        System.out.println(frank.toString());
    }
}