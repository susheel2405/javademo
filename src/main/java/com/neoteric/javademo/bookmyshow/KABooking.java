package com.neoteric.javademo.bookmyshow;

public class KABooking extends TicketBooking{

    public KABooking(double basePrice) {
        super(basePrice);
    }


    @Override
    protected double calculateTax(double price) {
        return price * 0.15;
    }

    @Override
    protected double addServiceCharge(double price) {
        return price * 0.06;
    }
}
