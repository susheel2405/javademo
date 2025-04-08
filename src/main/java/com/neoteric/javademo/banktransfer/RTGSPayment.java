package com.neoteric.javademo.banktransfer;

public class RTGSPayment extends PaymentType{

    public RTGSPayment(){
        super(500000);
    }

    @Override
    public boolean validateLimit(double amount) {
        return amount <= limit;
    }
}
