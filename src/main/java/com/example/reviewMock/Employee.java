package com.example.reviewMock;

import java.math.BigDecimal;

/*
Q2: Create a Java class Employee with private fields for name and salary.
Provide public getter and setter methods for these fields.
Include a method giveRaise(double percentage) that increases
the salary by the given percentage.
Write a main method to create an Employee object, set its name and salary,
 give it a raise, and print out the updated details.
 */
public class Employee {

    private String name;
    private BigDecimal salary;



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public BigDecimal getSalary(){
        return salary;
    }

    public void setSalary(BigDecimal salary){
        this.salary = salary;
    }

    public BigDecimal giveRaise(double percentage){
        salary = salary.add(salary.multiply(BigDecimal.valueOf(percentage/100)));
        return salary;
    }

    public static void main(String[] args) {
        Employee employee1 =  new Employee();
        employee1.setName("John");
        employee1.setSalary(BigDecimal.valueOf(120000));
        employee1.giveRaise(20);
        System.out.println(employee1.getSalary());

    }
}
