package com.neoteric.javademo.onlineshopping;

public abstract class PaymentMethod {

    protected double amount;

    public PaymentMethod(double amount){
        this.amount = amount;
    }

    public abstract void pay();
}
