package com.neoteric.javademo.onlineshopping;

public abstract class Product { // Base class for all products

    // Shared Attributes
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails(); // Abstract Method //
                                          //  Must Implemented by sub classes

    // Getter method to retrive the product price
    public double getPrice(){
        return price;
    }
}
