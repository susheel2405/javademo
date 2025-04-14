package com.neoteric.javademo.bookmyshow;

public class UPIPayment implements PaymentMethod {
    @Override
    public double applyCharges(double amount, String orderID, String merchantID) {
        return 0;
    }


    @Override
    public void refund(String orderId, double amount, String merchantID) {
        System.out.println("Refund of ₹" + amount + " initiated for Order ID: " + orderId + " Initiated from Merchant ID: " + merchantID);
    }

    @Override
    public void chooseBank() {
        // No bank selection needed
    }
}

