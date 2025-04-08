package com.neoteric.javademo.onlineshopping;


// Base class For all payments
public abstract class PaymentMethod {

    protected double amount;


    // Constructor
    public PaymentMethod(double amount){
        this.amount = amount;
    }


    // Abstract Method
    public abstract void pay();
}
