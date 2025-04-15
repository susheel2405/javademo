package com.neoteric.javademo.bill;

public abstract class Plan {

    int rate;



    public abstract double getRate();

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void calculateBill(int calculateBill){

        System.out.println("Bill Amount: " + (getRate() + calculateBill));

    }

}
