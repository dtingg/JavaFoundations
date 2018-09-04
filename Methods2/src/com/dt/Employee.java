package com.dt;

public class Employee {
    private String first;
    private String skill;
    protected double salary;

    public Employee(String first, String skill, double salary){
        this.first = first;
        this.skill = skill;
        this.salary = salary;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(int raisePercent){
        double raise = salary * raisePercent/100;
        salary += raise;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(first + "\n");
        sb.append(skill + "\n");
        sb.append(salary);
        return sb.toString();
    }
}