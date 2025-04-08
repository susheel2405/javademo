package com.neoteric.javademo.banktransfer;

public class SameBankPayment extends PaymentType{

    public SameBankPayment(){
        super(Double.MAX_VALUE);
    }

    @Override
    public boolean validateLimit(double amount) {
        return true;
    }
}
