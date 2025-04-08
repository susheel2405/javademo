package com.neoteric.javademo.bookmyshow;

import java.util.Scanner;

public class BookingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basePrice = 200.0;

        System.out.print("Enter Seat Number to Book: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter your state (TS/AP/MP/KA): ");
        String state = sc.next();

        TicketBooking booking;

        if (state.equalsIgnoreCase("TS")) {
            System.out.println("You selected Telangana.");
            booking = new TSBooking(basePrice);
        } else if (state.equalsIgnoreCase("AP")) {
            System.out.println("You selected Andhra Pradesh.");
            booking = new APBooking(basePrice);
        } else if (state.equalsIgnoreCase("MP")) {
            System.out.println("You selected Madhya Pradesh.");
            booking = new MPBooking(basePrice);
        } else if (state.equalsIgnoreCase("KA")) {
            System.out.println("You selected Karnataka.");
            booking = new KABooking(basePrice);
        } else {
            System.out.println("Invalid state entered.");
            return;
        }

        System.out.println("Choose Payment Method:");
        System.out.println("1. Net Banking");
        System.out.println("2. Card Payment");
        System.out.println("3. UPI");
        int paymentChoice = sc.nextInt();

        PaymentMethod payment;

        if (paymentChoice == 1) {
            payment = new NetBanking();
            payment.chooseBank();
        } else if (paymentChoice == 2) {
            payment = new CardPayment();
            payment.chooseBank();
        } else if (paymentChoice == 3) {
            payment = new UPIPayment(); // No bank selection needed
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        double totalBeforePayment = booking.calculateTotalPrice();
        double extraCharges = payment.applyCharges(totalBeforePayment);
        double finalAmount = totalBeforePayment + extraCharges;

        // Output Summary
        System.out.println("\n===== BOOKING SUMMARY =====");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("State: " + state.toUpperCase());
        booking.printBrakdown();
        System.out.printf("Payment Method Charges:    " +
                " ₹%.2f\n",
                extraCharges);
        System.out.printf("Final Amount to Pay:     " +
                "   ₹%.2f\n",
                finalAmount);
    }
}
