package com.neoteric.javademo.bookmyshow;

public class RefundService {


    // Concrete Method


    public void processRefund(PaymentMethod paymentMethod, String orderID, double amount, String merchatID){

        System.out.println("\n====Refund Processing====");
        System.out.println("Initiating refund...");
        paymentMethod.refund(orderID, amount, merchatID);
        System.out.println("Refund Processed Successfuly");

    }


}
