package com.neoteric.javademo.anbstractandinterface;

public interface Billable {

    void generateBill(String customername, double amount, PaymentStrategy paymentStrategy);


}
