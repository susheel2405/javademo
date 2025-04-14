package com.neoteric.javademo.bookmyshow;

import java.util.Scanner;

public class CardPayment implements PaymentMethod{

    private String bank;


    @Override
    public double applyCharges(double amount, String orderID, String merchantID) {
        return amount * 0.025;
    }

    @Override
    public void chooseBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Bank (SBI, HDFC, AXIS, ICICI, Central Bank:");
        bank = scanner.nextLine();
    }


    @Override
    public void refund(String orderId, double amount, String merchantID) {
        System.out.println("Refund of ₹" + amount + " initiated for Order ID: " + orderId + " Initiated from Merchant ID: " + merchantID);
    }


    public String getBank(){
        return bank;
    }
}
