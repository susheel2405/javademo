package com.neoteric.javademo.onlineshopping;

public class Electronics extends Product{

    private int warrantyMonths;

    public Electronics (String name, double price, int warrantyMonths){
        super(name,price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics ->" + name + ": ₹" + price + ": Warranty: " + warrantyMonths);
    }
}
