package com.neoteric.javademo.abstracandinterface;

public class NetBankingPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }


}
