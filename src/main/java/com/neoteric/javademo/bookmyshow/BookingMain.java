package com.neoteric.javademo.bookmyshow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basePrice = 200.0;



        // User Input for seat number and state
        System.out.print("Enter Seat Number to Book: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter your state (TS/AP/MP/KA): ");
        String state = sc.next();


        // Booking object Creation Based on the State
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



        // List of the movies and selection
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Avatar-2", "10:00 AM"));
        movies.add(new Movies("MAD 2", "1:00 PM"));
        movies.add(new Movies("Interstellar", "4:30 PM"));
        movies.add(new Movies("Inception", "7:30 PM"));
        movies.add(new Movies("Conjuring-2", "12:00 AM"));

        System.out.println("Available Movies");

        for (int i = 0; i<movies.size(); i++){
            System.out.println((i+1) + "_" + movies.get(i)) ;
        }

        System.out.println("Select Movie (1-" + movies.size() + "):");
        int movieChoice = sc.nextInt();
        Movies selectMovie = movies.get(movieChoice-1);


        // Payment Method Selection
        System.out.println("Choose Payment Method:");
        System.out.println("1. Net Banking");
        System.out.println("2. Card Payment");
        System.out.println("3. UPI");
        System.out.println("4. Foreign Credit Card");
        int paymentChoice = sc.nextInt();

        PaymentMethod payment;
        String orderId = UUID.randomUUID().toString();
        String merchantId = UUID.randomUUID().toString();
        ForeignCardPayment foreignCard = null;

        if (paymentChoice == 1) {
            payment = new NetBanking();
            payment.chooseBank();
        } else if (paymentChoice == 2) {
            payment = new CardPayment();
            payment.chooseBank();
        } else if (paymentChoice == 3) {
            payment = new UPIPayment(); // No bank selection needed
        } else if (paymentChoice == 4) {
            foreignCard = new ForeignCardPayment();
            payment = foreignCard;
        } else {
            System.out.println("Invalid payment method.");
            return;
        }


        // Total Payment Calculation
        double totalBeforePayment = booking.calculateTotalPrice();
        double extraCharges = payment.applyCharges(totalBeforePayment, orderId, merchantId);
        double finalAmount = totalBeforePayment + extraCharges;


        // Output Summary
        System.out.println("\n===== BOOKING SUMMARY =====");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("State: " + state.toUpperCase());


        booking.printBrakdown();
        System.out.printf("Payment Method Charges:    " + " ₹%.2f\n", extraCharges);
        System.out.printf("Final Amount to Pay:     " + "   ₹%.2f\n", finalAmount);



        // Conversion to USD for credit Card
        if (foreignCard != null) {
            double usdAmount = foreignCard.convertUSD(finalAmount);
            System.out.printf("Amount in USD: $%.2f\n", usdAmount);
        }

        // Payment Details

        System.out.println("\n===== PAYMENT DETAILS =====");
        System.out.println("Order ID: " + orderId);
        System.out.println("Merchant ID: " + merchantId);


        // refund Process
//        System.out.print("\nDo you want to initiate a refund? (yes/no): ");
//        String refundChoice = sc.next();
//        if (refundChoice.equalsIgnoreCase("yes")) {
//            payment.refund(orderId, finalAmount, merchantId);
//        } else {
//            System.out.println("Booking completed successfully!");
//        }

    }
}
