package com.neoteric.javademo.bookmyshow;

public class KABooking extends TicketBooking{


    // calculating the tax
    public KABooking(double basePrice){
        super(basePrice);
    }

    @Override
    public double calculateTax() {
        return baseprice * 0.09;
    }


}
