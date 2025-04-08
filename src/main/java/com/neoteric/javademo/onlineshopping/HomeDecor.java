package com.neoteric.javademo.onlineshopping;

public class HomeDecor extends Product{

    private String material;

    // Constructor that calls super class and initializes warranty Methods
    public HomeDecor(String name, double price, String material){
        super(name,price);
    }


    // Implementation of super class
    @Override
    public void displayDetails() {
        System.out.println("Home Decor -> " + name + ": ₹" + price + ": Material" + material);
    }
}
