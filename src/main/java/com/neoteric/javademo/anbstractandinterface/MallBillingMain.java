package com.neoteric.javademo.anbstractandinterface;

import java.util.Scanner;

public class MallBillingMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Total Amount: ₹");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nChoose Category");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("Enter Choice:");

        int categoryChoice = scanner.nextInt();

        scanner.nextLine();

        ShoppingMall mall;

        if (categoryChoice == 1){
            mall = new ElectronicsShop();
        } else if (categoryChoice == 2) {
            mall = new ClothingShop();

        }else {
            System.out.println("Invalid Category select");
            return;
        }

        System.out.println("\n Select Payment Method");
        System.out.println("1. UPI");
        System.out.println("2.Card");
        System.out.println("3. Net banking");
        System.out.println("Enter Choice");

        int paymentChoice = scanner.nextInt();

        PaymentStrategy paymentStrategy;

        if (paymentChoice == 1){
            paymentStrategy = new UPIPayment();
        } else if (paymentChoice == 2) {
            paymentStrategy = new CardPayment();
        } else if (paymentChoice == 3) {
            paymentStrategy = new NetBankingPayment();
        }else {
            System.out.println("Invalid Payment Method");

            return;
        }
        System.out.println("-------BILL-------");
        mall.generateBill(name, amount, paymentStrategy);
    }
}
