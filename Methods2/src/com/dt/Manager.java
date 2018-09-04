package com.dt;

public class Manager extends Employee{
    private double bonus;

    public Manager(String first, String skill, double salary){
        super(first, skill, salary);
        bonus = 0;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
        salary = salary + bonus;
    }

    public double getSalary(){
        return salary;
    }
}