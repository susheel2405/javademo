package com.neoteric.javademo.anbstractandinterface;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + "Completed via Card");
    }
}
