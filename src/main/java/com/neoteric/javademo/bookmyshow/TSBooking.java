package com.neoteric.javademo.bookmyshow;

public class TSBooking extends TicketBooking{


    // calculating the tax
    public TSBooking(double basePrice){
        super(basePrice);
    }

    @Override
    public double calculateTax() {
        return baseprice * 0.10;
    }


}
