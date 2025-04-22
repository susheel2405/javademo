package com.neoteric.javademo.mysqlconnector;

public class Employee {





    // try{
    // }cathch(){
    // }


    // try{
    // }cathch(){
    // }finallu{
    // }



    // try{
    // }finally{
    // }



    private int id;
    private String name;
    private String departement;
    private double salary;


    public Employee(String departement, int id, String name, double salary) {
        this.departement = departement;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getDepartement() {
        return departement;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "departement='" + departement + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}