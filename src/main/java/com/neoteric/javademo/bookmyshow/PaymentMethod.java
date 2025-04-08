package com.neoteric.javademo.bookmyshow;

public abstract class PaymentMethod {

    public abstract double applyCharges(double amount);
    public abstract void chooseBank();
}
