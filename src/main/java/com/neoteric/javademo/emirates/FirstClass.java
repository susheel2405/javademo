package com.neoteric.javademo.emirates;

public class FirstClass extends FlightBooking{

    public FirstClass(String passengername){
        super(passengername, " First Class ");
    }


    @Override
    protected void selectSeat() {
        service.add(" Private Suite with Recliner");

    }

    @Override
    protected void offerMeal() {
        service.add(" Five-Star Dining with Premium Dishes");

    }

    @Override
    protected void offerEntertainment() {
        service.add("HD Touchscreen with Noise_Canceling HeadPhones");

    }

    @Override
    protected void addExtras() {
        service.add("Onboard Shower Access");
        service.add("Lounge Access");
        service.add("3 Checked Bags");


    }
}
