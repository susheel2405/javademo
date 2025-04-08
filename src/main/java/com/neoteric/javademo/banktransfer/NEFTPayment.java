package com.neoteric.javademo.banktransfer;

public class NEFTPayment extends PaymentType{

    public NEFTPayment(){
        super(700000);
    }

    @Override
    public boolean validateLimit(double amount) {
        return amount <= limit;
    }
}
