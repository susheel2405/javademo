package com.neoteric.javademo.bookmyshow;

public abstract class TicketBooking {

    protected double baseprice = 200;
    protected double serviceCharge = 50;

    public TicketBooking(double baseprice){
        this.baseprice = baseprice;
    }

    public abstract double calculateTax();

    public double calculateTotalPrice(){
        return baseprice + serviceCharge + calculateTax();
    }

    public void printBrakdown(){
        System.out.printf("Base Price:  ₹%.2f\\n", baseprice);
        System.out.printf("Service Charge:  ₹%.2f\\n", serviceCharge);
        System.out.printf("State Tax:  ₹%.2f\\n", calculateTax());
        System.out.printf("Total Before Payment Charges:  ₹%.2f\\n", calculateTotalPrice());

    }
}