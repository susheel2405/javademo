package com.neoteric.javademo.bookmyshow;

public class ForeignCardPayment extends PaymentMethod{


    private static double USD_CONVERSION_RATE = 0.012;


    @Override
    public double applyCharges(double amount) {
        return amount * 0.03;
    }

    @Override
    public void chooseBank() {

    }

    public double convertUSD(double amountINR){
        return amountINR * USD_CONVERSION_RATE;

    }
}
