package com.neoteric.javademo.bookmyshow;

public class APBooking extends TicketBooking{


    // calculating the tax
    public APBooking(double basePrice){
        super(basePrice);
    }

    @Override
    public double calculateTax() {
        return baseprice * 0.12;
    }
}
