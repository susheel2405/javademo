package com.neoteric.javademo.banktransfer;

public class IMPSPayment extends PaymentType {

    public IMPSPayment(){
        super(100000);
    }


    @Override
    public boolean validateLimit(double amount) {
        return amount <= limit;
    }
}
