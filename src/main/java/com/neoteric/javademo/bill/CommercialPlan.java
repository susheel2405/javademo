package com.neoteric.javademo.bill;

public class CommercialPlan extends Plan{


    @Override
    public double getRate() {
        return rate;
    }

    public void calculateBill(int units) {
        System.out.println("Bill amount for " + getClass().getSimpleName() + ": " + (getRate() * units));
    }
}
