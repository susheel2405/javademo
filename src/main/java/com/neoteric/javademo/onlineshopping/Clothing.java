package com.neoteric.javademo.onlineshopping;

public class Clothing extends Product{

    private String size;
    public Clothing(String name, double price, String size){
        super(name,price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing ->" + name + ": ₹" + price + ": Size" + size);

    }
}
