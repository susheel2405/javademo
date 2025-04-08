package com.neoteric.javademo.bookmyshow;

public class UPIPayment extends PaymentMethod{


    @Override
    public double applyCharges(double amount) {
        return 0;
    }

    @Override
    public void chooseBank() {

    }


}
