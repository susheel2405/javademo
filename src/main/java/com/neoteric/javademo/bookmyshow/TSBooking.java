package com.neoteric.javademo.bookmyshow;

public class TSBooking extends TicketBooking{

    public TSBooking(double basePrice){
        super(basePrice);
    }

    @Override
    public double calculateTax() {
        return baseprice * 0.10;
    }


}
