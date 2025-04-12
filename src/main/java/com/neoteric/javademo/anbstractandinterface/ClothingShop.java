package com.neoteric.javademo.anbstractandinterface;

import java.util.Scanner;

public class ClothingShop extends ShoppingMall{
    @Override
    public void generateBill(String customername, double amount, PaymentStrategy paymentStrategy) {
        logCustomer(customername);

        Scanner scanner = new Scanner(System.in);

        String brand = "USPA";
        System.out.println("Category: Clothing");
        System.out.println("Brand: " + brand);
        System.out.println("Enter clothing type(T-Shirt, Jeans, Shirts, Trousers: ");
        String type = scanner.nextLine();


        double discountAmount = amount - (amount * 0.20);
        System.out.println("Clothing Type: " + type);
        System.out.println(" Original Amount: " + amount);
        System.out.println("Discount Amount (20%): ₹" + discountAmount);



        paymentStrategy.pay(discountAmount);
    }
}
