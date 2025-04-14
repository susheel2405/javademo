package com.neoteric.javademo.bookmyshow;

public interface PaymentMethod {
    double applyCharges(double amount, String orderID, String merchantID);
    void chooseBank();
    void refund(String orderId, double amount, String merchantID);
}
