package com.neoteric.javademo.onlineshopping;

public class UPIPayment extends PaymentMethod {

    public UPIPayment(double amount){
        super(amount);

    }

    @Override
    public void pay() {
        System.out.println("Paid ₹" + amount + "Using UPI");
    }

}
