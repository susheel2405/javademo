package com.neoteric.javademo.bankaccount;

public class Nominee {

    private String name;
    private Address address;

    public Nominee(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

    public String getName() {
        return name;
    }





}
