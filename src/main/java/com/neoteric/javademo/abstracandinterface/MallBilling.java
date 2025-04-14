package com.neoteric.javademo.abstracandinterface;

import java.util.Scanner;

public class MallBilling {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Shop: 1. Electronics  2. Clothing");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

         ShoppingMall mall = MallFactory.createMall(choice);
        if (mall != null) {
            mall.shop(name, amount);
        } else {
            System.out.println("Invalid shop choice.");
        }
    }
}
