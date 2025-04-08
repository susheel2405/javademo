package com.neoteric.javademo.onlineshopping;

public class Clothing extends Product{

    private String size;

    // Constructor that calls super class and initializes warranty Methods
    public Clothing(String name, double price, String size){
        super(name,price);
        this.size = size;
    }


    // Implementation of super class
    @Override
    public void displayDetails() {
        System.out.println("Clothing ->" + name + ": ₹" + price + ": Size" + size);

    }
}
