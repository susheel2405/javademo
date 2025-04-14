package com.neoteric.javademo.bookmyshow;

public class ForeignCardPayment implements PaymentMethod {

    private static final double CONVERSION_RATE = 0.012; // INR to USD
    private static final double FOREIGN_FEE = 0.03; // 3%

    @Override
    public double applyCharges(double amount, String orderID, String merchantID) {
        System.out.println("Foreign Credit Card Payment Applied.");
        return amount * FOREIGN_FEE;
    }

    public double convertUSD(double inrAmount) {
        return inrAmount * CONVERSION_RATE;
    }


    @Override
    public void refund(String orderId, double amount, String merchantID) {
        System.out.println("Refund of ₹" + amount + " initiated for Order ID: " + orderId + " Initiated from Merchant ID: " + merchantID);
    }

    @Override
    public void chooseBank() {
        System.out.println("Foreign Credit Card: No bank selection needed.");
    }
}
