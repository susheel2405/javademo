package com.neoteric.javademo.banktransfer;

import java.util.Scanner;

public class BankTransferMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create demo accounts
       BankAccount bankAccount  =  new BankAccount("12345", 600000);
       BankAccount bankAccount1 =  new BankAccount("67890", 100000);

        System.out.print("From Account: ");
        String fromAcc = sc.nextLine();

        System.out.print("To Account: ");
        String toAcc = sc.nextLine();

        System.out.print("Amount to transfer: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Choose Payment Method:");
        System.out.println("1. IMPS (Limit: ₹1,00,000)");
        System.out.println("2. NEFT (Limit: ₹7,00,000)");
        System.out.println("3. RTGS (Limit: ₹5,00,000)");
        System.out.println("4. Same Bank (No Limit)");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        PaymentType payment;
        if (choice == 1) {
            payment = new IMPSPayment();
        } else if (choice == 2) {
            payment = new NEFTPayment();
        } else if (choice == 3) {
            payment = new RTGSPayment();
        } else if (choice == 4) {
            payment = new SameBankPayment();
        } else {
            System.out.println(" Invalid payment method.");
            return;
        }

        // Transfer logic
        boolean success = BankTransferService.transferAmount(fromAcc, toAcc, amount, payment);

        System.out.println("\n----- Transfer Summary -----");
        System.out.println("From: " + fromAcc);
        System.out.println("To: " + toAcc);
        System.out.printf("Amount: ₹%.2f%n", amount);
        System.out.println("Payment Method: " + payment.getPaymentName());
        System.out.println("Status: " + (success ? " Transfer successful." : " Transfer failed."));
    }
}