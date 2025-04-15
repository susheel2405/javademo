package com.neoteric.javademo.bookmyshow;

public class TSBooking extends TicketBooking {


    // calculating the tax
    public TSBooking(double basePrice) {
        super(basePrice);
    }

    @Override
    protected double calculateTax(double price) {
        return price * 0.12;
    }

    @Override
    protected double addServiceCharge(double price) {
        return price * 0.05;
    }
}

