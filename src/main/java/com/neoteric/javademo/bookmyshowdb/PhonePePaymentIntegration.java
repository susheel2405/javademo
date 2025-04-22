package com.neoteric.javademo.bookmyshowdb;

import java.util.UUID;

public class PhonePePaymentIntegration extends PaymentProcessor{
    @Override
    protected String getPaymentTable() {
        return "phone_pe";
    }

    @Override
    protected String generatePaymentId() {
        return "PHONEPE-PAY-" + UUID.randomUUID();
    }
}
