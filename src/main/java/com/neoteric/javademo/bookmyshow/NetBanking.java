package com.neoteric.javademo.bookmyshow;

import java.util.Scanner;
public class NetBanking implements PaymentMethod {
    private String bank;

    @Override
    public double applyCharges(double amount, String orderID, String merchantID) {
        return 0;
    }

    @Override
    public void chooseBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Bank (SBI, AXIS, HDFC, ICICI, Central Bank):");
        bank = scanner.nextLine();
    }

    @Override
    public void refund(String orderId, double amount, String merchantID) {
        System.out.println("Refund of ₹" + amount + " initiated for Order ID: " + orderId + " Initiated from Merchant ID: " + merchantID);
    }

    public String getBank() {
        return bank;
    }
}

