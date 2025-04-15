package com.neoteric.javademo.bookmyshow;

import java.util.Map;

public class MPBooking extends TicketBooking{

    public MPBooking(double basePrice) {
            super(basePrice);
        }

        @Override
        protected double calculateTax(double price) {
            return price * 0.18;  // Example tax
        }

        @Override
        protected double addServiceCharge(double price) {
            return price * 0.05;
        }
    }


