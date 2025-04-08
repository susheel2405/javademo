package com.neoteric.javademo.appointment;

public class Patient {

    private String name;
    private int age;

    public Patient(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
