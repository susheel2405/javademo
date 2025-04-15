package com.neoteric.javademo.bill;

public class DomesticPlan extends Plan{


    @Override
    public double getRate() {
        return rate;
    }

    public void calculateBill(int units) {
        System.out.println("Bill amount for Domestic: " + (getRate() * units));
    }
}
