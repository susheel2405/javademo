package com.neoteric.javademo.bookmyshow;

import java.util.Map;

public class MPBooking extends TicketBooking{


    // calculating the tax
    public MPBooking(double basePrice){
        super(basePrice);
    }

    @Override
    public double calculateTax() {
        return baseprice * 0.08;
    }
}

