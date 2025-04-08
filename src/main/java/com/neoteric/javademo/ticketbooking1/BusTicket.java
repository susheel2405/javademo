package com.neoteric.javademo.ticketbooking1;

public class BusTicket {

    String ticketNumber;
    String passengerName;
    String departure;
    String destination;
    String travelDate;
    String busNumber;
    String seatNumber;

    public BusTicket(String ticketNumber, String passengerName, String departure, String destination, String travelDate, String busNumber, String seatNumber) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.departure = departure;
        this.destination = destination;
        this.travelDate = travelDate;
        this.busNumber = busNumber;
        this.seatNumber = seatNumber;
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Departure: " + departure);
        System.out.println("Destination: " + destination);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Seat Number: " + seatNumber);
    }
}
