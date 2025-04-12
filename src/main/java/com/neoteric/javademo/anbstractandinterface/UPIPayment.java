package com.neoteric.javademo.anbstractandinterface;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(" Payment of ₹" + amount + "Completed Via UPI");
    }
}
