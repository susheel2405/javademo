package com.neoteric.javademo.payment;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService paymentService = new PaymentService(500.00); // Initial balance

        System.out.println(" Payment Service");
        System.out.println(" Your current balance: ₹" + paymentService.getBalance());

        int maxAttempts = 1; // ✅ Default to 3 attempts

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter amount for payment #" + i + ": ₹");
            double amount = scanner.nextDouble();

            try {
                paymentService.makePayment(amount);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println( e.getMessage());
            }

            System.out.println("-----------------------------------");
        }

        System.out.println("✅ Final Balance: ₹" + paymentService.getBalance());
        scanner.close();
    }
}
