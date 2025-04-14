package com.neoteric.javademo.abstracandinterface;

public class UPIPayment  implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }

}
