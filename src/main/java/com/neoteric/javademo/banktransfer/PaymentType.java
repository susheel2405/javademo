package com.neoteric.javademo.banktransfer;

public abstract class PaymentType {

    protected double limit;

    public PaymentType(double limit){
        this.limit = limit;
    }

    public double getLimit(){
        return limit;
    }

    public abstract boolean validateLimit(double amount);

    public String getPaymentName(){
        return this.getClass().getSimpleName();
    }
}
