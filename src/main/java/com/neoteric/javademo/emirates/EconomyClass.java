package com.neoteric.javademo.emirates;

public class EconomyClass extends FlightBooking{

    public EconomyClass(String passengername){
        super(passengername, "Economy Class");
    }

    @Override
    protected void selectSeat() {
        service.add(" Standard Economy Seat");

    }

    @Override
    protected void offerMeal() {
        service.add(" Regular Meal with soft drink");

    }

    @Override
    protected void offerEntertainment() {
        service.add(" Basic In-Flight Entertainment");

    }

    @Override
    protected void addExtras() {
        service.add("1 Checked Bag");

    }
}
