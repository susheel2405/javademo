package com.neoteric.javademo.ticketbooking1;

public class Passenger extends Booking {
    int age;
    String contactNumber;

    public Passenger(String ticketNumber, String passengerName, String departure, String destination, String travelDate, String busNumber, String seatNumber, String paymentMethod, boolean isConfirmed, int age, String contactNumber) {
        super(ticketNumber, passengerName, departure, destination, travelDate, busNumber, seatNumber, paymentMethod, isConfirmed);
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public void displayPassengerDetails() {
        displayBookingDetails();
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
    }
}
