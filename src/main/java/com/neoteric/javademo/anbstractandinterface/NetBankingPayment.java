package com.neoteric.javademo.anbstractandinterface;

public class NetBankingPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + "Completed via NetBanking");
    }
}
