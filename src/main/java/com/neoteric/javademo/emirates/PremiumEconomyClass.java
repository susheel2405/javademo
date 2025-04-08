package com.neoteric.javademo.emirates;

public class PremiumEconomyClass extends FlightBooking{

    public PremiumEconomyClass(String passengernname){
        super(passengernname, " Premium Economy Class");
    }

    @Override
    protected void selectSeat() {
        service.add("Wider Reclining Seat with Extra Legroom");;

    }

    @Override
    protected void offerMeal() {
        service.add("Premium Meal with Wine");

    }

    @Override
    protected void offerEntertainment() {
        service.add("Upgraded Entertainment System");

    }

    @Override
    protected void addExtras() {
        service.add("2 Checked Bags");
        service.add("Prioroty Boarding");

    }
}
