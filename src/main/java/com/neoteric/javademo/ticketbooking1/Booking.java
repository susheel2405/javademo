package com.neoteric.javademo.ticketbooking1;

public class Booking extends BusTicket{
    String paymentMethod;
    boolean isConfirmed;

    public Booking(String ticketNumber, String passengerName, String departure, String destination, String travelDate, String busNumber, String seatNumber, String paymentMethod, boolean isConfirmed) {
        super(ticketNumber, passengerName, departure, destination, travelDate, busNumber, seatNumber);
        this.paymentMethod = paymentMethod;
        this.isConfirmed = isConfirmed;
    }

    public void displayBookingDetails() {
        displayTicketDetails();
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Booking Confirmed: " + isConfirmed);
    }
}
