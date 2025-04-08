package com.neoteric.javademo.bankaccount;

public class Customer {
    private String name;
    private Address address;
    private Nominee nominee;

    public Customer(String name, Address address, Nominee nominee){
        this.name = name;
        this.address = address;
        this.name = name;
    }
    public Nominee getNominee() {
        if (nominee == null) {
            return new Nominee("Venkat Reddy", new Address("1-75", "Suryapet", "Telangana", 508212));
        }
        return nominee;
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }




}
