package com.neoteric.javademo.abstracandinterface;

public class CardPayment implements PaymentMethod{


    @Override
    public void pay(double amount) {
        System.out.println("Paid: ₹" + amount + "Using Card");

    }
}
