package com.neoteric.javademo.onlineshopping;

public class CardPayment extends PaymentMethod {

    public CardPayment(double amount){
        super(amount);

    }

    @Override
    public void pay() {
        System.out.println("Paid ₹" + amount + "Using card");
    }

}
