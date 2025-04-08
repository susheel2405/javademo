package com.neoteric.javademo.appointement2;

public class Patient {

    private String name;
    private int age;

    public Patient( String name,int age ) {
        this.age = age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age;
    }
}
