package com.neoteric.javademo.appointement2;

public class Doctor {

    private String name;
    private String Specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        Specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return Specialization;
    }
}
