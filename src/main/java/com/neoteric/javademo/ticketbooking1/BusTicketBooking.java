package com.neoteric.javademo.ticketbooking1;

public class BusTicketBooking {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("TS234476", "Sushee Reddy", "Hyderabad", "Goa", "2025-03-15", "B45", "12A", "Credit Card", true, 30, "123-456-7890");

        System.out.println("Passenger Ticket Details:");
        passenger.displayPassengerDetails();
    }
}
