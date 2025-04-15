package com.neoteric.javademo.bill;

public class InstitutionalPlan extends Plan{





    @Override
    public double getRate() {
        return rate;
    }

    public void calculateBill(int units) {
        System.out.println("Bill amount for " + getClass().getSimpleName() + ": " + (getRate() * units));
    }
}
