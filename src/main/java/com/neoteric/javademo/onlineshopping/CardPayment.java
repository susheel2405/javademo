package com.neoteric.javademo.onlineshopping;


// Inherits PaymentMethod class (Super Class) it in herits methods from super class
public class CardPayment extends PaymentMethod {

    public CardPayment(double amount){
        super(amount);

    }

    @Override

    // Implements Abstract Method
    public void pay() {
        System.out.println("Paid ₹" + amount + "Using card");
    }

}
