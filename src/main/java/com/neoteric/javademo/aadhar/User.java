package com.neoteric.javademo.aadhar;

public class User {


    private String name;
    private String fatherName;
    private String gender;
    private String dob;
    private String relation;
    private String address;
    private String aadhaarNumber;

    public User(String name, String fatherName, String gender, String dob, String relation, String address, String aadhaarNumber) {
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.relation = relation;
        this.address = address;
        this.aadhaarNumber = aadhaarNumber;
    }

    public void displayAadhaarCard() {
        System.out.println("\n===== Aadhaar Card =====");
        System.out.println("Name       : " + name);
        System.out.println("Relation   : " + relation);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Gender     : " + gender);
        System.out.println("DOB        : " + dob);
        System.out.println("Address    : " + address);
        System.out.println("Aadhaar No : " + aadhaarNumber);
        System.out.println("========================\n");
    }
}
