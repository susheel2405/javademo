package com.neoteric.javademo.onlineshopping;

public class HomeDecor extends Product{

    private String material;

    public HomeDecor(String name, double price, String material){
        super(name,price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Home Decor -> " + name + ": ₹" + price + ": Material" + material);
    }
}
