package com.neoteric.javademo.bookmyshow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // object created and for reading user ainput
        double basePrice = 200.0;     // Base Ticket price for all bookings

        // User Input for seat number and state
        System.out.print("Enter Seat Number to Book: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter your state (TS/AP/MP/KA): ");
        String state = sc.next();

        // Based on the State, assign appropriate TicketBooking subclass
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
            return;    // exit if invalid state
        }

        // List of the movies and with ratings
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Avatar-2", "10:00 AM", 4.0));
        movies.add(new Movies("MAD 2", "1:00 PM", 4.5));
        movies.add(new Movies("Interstellar", "4:30 PM", 4.5));
        movies.add(new Movies("Inception", "7:30 PM", 4.9));
        movies.add(new Movies("Conjuring-2", "12:00 AM", 4.8));


        // Display Mobies
        System.out.println("Available Movies:");

        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + "_" + movies.get(i));
        }

        // Ask user to select a movie
        System.out.println("Select Movie (1-" + movies.size() + "):");
        int movieChoice = sc.nextInt();   // Get user movie choice


        Movies selectedMovie = movies.get(movieChoice - 1);     // Get movie object

        // Display selected Movie info
        System.out.println("\n===== Movie Details =====");
        System.out.println("You selected: " + selectedMovie.getName() + " at " + selectedMovie.getTiming());
        System.out.println("Current Rating: ⭐ " + selectedMovie.getRating() + "/5");

        // Proceed to Payment Method
        PaymentMethod payment;

        // Payment Method Selection
        System.out.println("Choose Payment Method:");
        System.out.println("1. Net Banking");
        System.out.println("2. Card Payment");
        System.out.println("3. UPI");
        System.out.println("4. Foreign Credit Card");
        int paymentChoice = sc.nextInt();    // Proceeds to next line


        // Generate Order and Merchant IDs
        String orderId = UUID.randomUUID().toString();
        String merchantId = UUID.randomUUID().toString();
        ForeignCardPayment foreignCard = null;

        // Choose Payment Methods
        if (paymentChoice == 1) {
            payment = new NetBanking();
            payment.chooseBank();
        } else if (paymentChoice == 2) {
            payment = new CardPayment();
            payment.chooseBank();
        } else if (paymentChoice == 3) {
            payment = new UPIPayment(); // No bank selection needed
        } else if (paymentChoice == 4) {
            foreignCard = new ForeignCardPayment();   // Special handiling for USD
            payment = foreignCard;
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        // Total Payment and Charges Calculation
        double totalBeforePayment = booking.calculateTotalPrice(); // Total amount before TAX

        double extraCharges = payment.applyCharges(totalBeforePayment, orderId, merchantId);  // Application of charges
        double finalAmount = totalBeforePayment + extraCharges;

        // Booking Output Summary
        System.out.println("\n===== BOOKING SUMMARY =====");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("State: " + state.toUpperCase());   // state selection and seat selection

        booking.printBrakdown();      // Print Base, Tax, service charge breakdown

        System.out.printf("Payment Method Charges: ₹%.2f\n", extraCharges);
        System.out.printf("Final Amount to Pay: ₹%.2f\n", finalAmount);     // Total amount after taxes to be paid

        // Conversion to USD for Foreign Card Payment
        if (foreignCard != null) {
            double usdAmount = foreignCard.convertUSD(finalAmount);
            System.out.printf("Amount in USD: $%.2f\n", usdAmount);   // amount wiil be displayed in dollars
        }

        // Payment Details and genertaes orderID, MerchatID
        System.out.println("\n===== PAYMENT DETAILS =====");
        System.out.println("Order ID: " + orderId);
        System.out.println("Merchant ID: " + merchantId);


        // Refund process logic
        System.out.print("\nDo you want to initiate a refund? (yes/no): ");
        String refundChoice = sc.next();
        if (refundChoice.equalsIgnoreCase("yes")) {
            RefundService refundService = new RefundService();
            refundService.processRefund(payment, orderId, finalAmount, merchantId);
        } else {
            System.out.println("Booking completed successfully!");
        }


    }



}
