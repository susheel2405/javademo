package com.neoteric.javademo.anbstractandinterface;

public class ElectronicsShop extends ShoppingMall{
    @Override
    public void generateBill(String customername, double amount, PaymentStrategy paymentStrategy) {
        logCustomer(customername);

        System.out.println("Category: Electronics");

        double discountAmount = amount - (amount *0.10);

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Discount Amount (10%): ₹" + discountAmount);

        paymentStrategy.pay(discountAmount);
    }
}

