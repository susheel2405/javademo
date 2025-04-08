package com.neoteric.javademo.emirates;

public class Residency extends FlightBooking{

    public Residency(String passengername){
        super(passengername, "Residency Suite");
    }


    @Override
    protected void selectSeat() {
        service.add("Private Room with King Size Bed to take some rest");

    }

    @Override
    protected void offerMeal() {
        service.add(" Unlimited Gourment Dining & Personal Chef");

    }

    @Override
    protected void offerEntertainment() {
        service.add(" Private Cinem Experience");

    }

    @Override
    protected void addExtras() {
        service.add("Personal Butler");
        service.add("Chauffer Pickup and Drop");
        service.add("Unlimited Top Notch 5-star food");
        service.add("Seperate seat with attached Bedroom ");
        service.add("Separate BathRoom ");

    }
}
