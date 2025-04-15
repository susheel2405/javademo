package com.neoteric.javademo.bookmyshow;


// template Design Pattern

public abstract class TicketBooking {
    protected double basePrice;

    public TicketBooking(double basePrice) {
        this.basePrice = basePrice;
    }

    public final double calculateTotalPrice() {
        double tax = calculateTax(basePrice);
        double serviceCharge = addServiceCharge(basePrice);
        return basePrice + tax + serviceCharge;
    }

    protected abstract double calculateTax(double price);
    protected abstract double addServiceCharge(double price);

    public void printBrakdown() {
        System.out.printf("Base Price:               ₹%.2f\n", basePrice);
        System.out.printf("Tax:                      ₹%.2f\n", calculateTax(basePrice));
        System.out.printf("Service Charge:           ₹%.2f\n", addServiceCharge(basePrice));
    }
}
