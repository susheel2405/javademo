package com.neoteric.javademo.bookmyshowdb;

import java.util.UUID;

public class RazorPayPaymentIntigration extends PaymentProcessor{
    @Override
    protected String getPaymentTable() {
        return "razor_pay";
    }

    @Override
    protected String generatePaymentId() {
        return "RAZORPAY-PAY-" + UUID.randomUUID();
    }
}
