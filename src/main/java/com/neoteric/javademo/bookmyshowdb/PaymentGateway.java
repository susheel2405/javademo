package com.neoteric.javademo.bookmyshowdb;

public interface PaymentGateway {

    String makePayment(String orderId, double amount);

}
