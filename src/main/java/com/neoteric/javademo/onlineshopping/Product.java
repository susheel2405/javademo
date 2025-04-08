package com.neoteric.javademo.onlineshopping;

public abstract class Product {  // common structure, reusability, enforces child class to implement
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails(); // Must Implemented by sub classes

    public double getPrice(){
        return price;
    }
}
