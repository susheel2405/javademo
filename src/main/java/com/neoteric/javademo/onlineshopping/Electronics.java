package com.neoteric.javademo.onlineshopping;

public class Electronics extends Product{

    private int warrantyMonths;

    // Constructor that calls super class and initializes warranty Methods
    public Electronics (String name, double price, int warrantyMonths){
        super(name,price);
        this.warrantyMonths = warrantyMonths;
    }


    // Implementation of super class
    @Override
    public void displayDetails() {       // Implementation of Product Class (Super Class)
        System.out.println("Electronics ->" + name + ": ₹" + price + ": Warranty: " + warrantyMonths);
    }
}
