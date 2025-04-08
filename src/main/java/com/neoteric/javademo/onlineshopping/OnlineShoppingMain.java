package com.neoteric.javademo.onlineshopping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Entry Point of the application
public class OnlineShoppingMain {

    public static void main(String[] args) {


        // User has to input the values
        Scanner scanner = new Scanner(System.in);

        // initializes a list to hold the products
        List<Product> cart = new ArrayList<>();

        // Adding products to cart
        cart.add(new Electronics("Samsung S23", 38999, 12));
        cart.add(new Clothing("USPA T-Shirt", 2500, "L"));
        cart.add(new HomeDecor("Sofa", 36500, "Wood"));

        // Dispaly each product details and total amount
        double total = 0.0;
        System.out.println("---Your Shopping Cart---");

        for (Product item : cart){
            item.displayDetails();
            total += item.getPrice();
        }

        // Prints total amount before discount
        System.out.println("Total Amount Before Discount: ₹" + total);


        // Applying Discount Using Abstract Class
        Discount discount = new PurchaseDiscount();
        double finalAmount = discount.apply(total);

        // Final amount after discount
        if (finalAmount < total){
            System.out.println("Discount Applied: Final Amount; ₹" + finalAmount );
        }else {
            System.out.println("No Discount Applied");
        }

        // Payment Selection

        System.out.println("\n Select Payment Method");
        System.out.println("1. Card");
        System.out.println("2. Net Banking");
        System.out.println("3. UPI");
        System.out.println("Enter Option(1-3)");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod;

        if (choice == 1){
            paymentMethod = new CardPayment(finalAmount);
        } else if (choice == 2) {
            paymentMethod = new NetBanking(finalAmount);
        } else if (choice == 3) {
            paymentMethod = new UPIPayment(finalAmount);
        }else {
            System.out.println("Invalid Option. defaulting To Upi.");
            paymentMethod = new UPIPayment(finalAmount);
        }

        // Make Payment
        paymentMethod.pay();
        scanner.close();
    }
}
