package com.neoteric.javademo.exception;

import java.util.Scanner;

public class MovieBookingMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeatBookingSystem bookingSystem = new SeatBookingSystem();
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            bookingSystem.showAvailableSeats();

            try {
                System.out.print("Enter seat number to book (1-10): ");
                int seat = Integer.parseInt(scanner.nextLine());

                bookingSystem.bookSeat(seat);

            } catch (SeatNotAvailable e) {
                System.out.println( e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ " + e.getMessage());
            }

            System.out.print("Do you want to book another seat? (yes/no): ");
            choice = scanner.nextLine();
        }

        System.out.println("🎉 Thank you for booking!");
        scanner.close();
    }

}
