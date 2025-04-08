package com.neoteric.javademo.emirates;

import java.util.ArrayList;
import java.util.List;

public abstract class BookingTest {

    public static void main(String[] args) {
        FlightBooking economy = new EconomyClass("Susheel Reddy");
        FlightBooking premium = new PremiumEconomyClass("Honey Reddy");
        FlightBooking firstClass = new FirstClass("Venkat Reddy");
        FlightBooking residency = new Residency("Shailaja Reddy");


        economy.bookFlight();
        premium.bookFlight();
        firstClass.bookFlight();
        residency.bookFlight();
    }


}
