package com.neoteric.javademo.abstractandinterface1;

import java.util.Scanner;

public class ElectronicsShop extends ShoppingMall{
    @Override
    public void generateBill(String customerNAme, double amount) {
        logCustomer(customerNAme);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Category: Electronics");
        double discountAmount = amount - (amount * 0.10);
        System.out.println("Original amount: ₹" + amount);
        System.out.println("Discouned Amount (10%): ₹" + discountAmount);

        handlePayment(scanner);
    }

    private void  handlePayment(Scanner scanner){
        System.out.println("\n Select Payment");
    }
}
