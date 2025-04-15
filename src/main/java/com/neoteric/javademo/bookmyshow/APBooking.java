package com.neoteric.javademo.bookmyshow;

public class APBooking extends TicketBooking{

    public APBooking(double basePrice) {
        super(basePrice);
    }


    @Override
    protected double calculateTax(double price) {
        return price * 0.14;
    }

    @Override
    protected double addServiceCharge(double price) {
        return price * 0.09;
    }
}
