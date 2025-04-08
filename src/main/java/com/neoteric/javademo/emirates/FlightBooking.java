package com.neoteric.javademo.emirates;

import java.util.ArrayList;
import java.util.List;

public abstract class FlightBooking  {


    protected String passengername;
    protected String classname;
    protected List<String> service = new ArrayList<>();


    public FlightBooking(String passengername, String classname){
        this.passengername = passengername;
        this.classname = classname;
    }

    // Template Method

    public void bookFlight(){
        System.out.println("\n Booking Flight " + passengername + "[" + classname + "]");
        selectSeat();
        offerMeal();
        offerEntertainment();
        addExtras();
        confirmBooking();
    }

    protected abstract void selectSeat();
    protected abstract void offerMeal();
    protected abstract void offerEntertainment();
    protected abstract void addExtras();
    protected  void confirmBooking(){
        System.out.println(" Service for " + passengername + ":");
        for (String service : service){
            System.out.println(" ," + service);
        }

        System.out.println(" *Booking Confirmed:\n");

    }

}
