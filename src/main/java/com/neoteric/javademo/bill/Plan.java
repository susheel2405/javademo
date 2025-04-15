package com.neoteric.javademo.bill;

public abstract class Plan {

    double rate;



    public abstract double getRate();

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void calculateBill(int calculateBill){

        System.out.println("Bill amount for " + getClass().getSimpleName() + ": " + (getRate() * calculateBill));

    }

}
