package com.neoteric.javademo.feepayment;

public class Student {

    int rollNumber;
    String name;
    double totalFees;

    public Student(int rollNumber, String name, double totalFees){
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalFees = totalFees;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getTotalFees() {
        return totalFees;
    }
}
