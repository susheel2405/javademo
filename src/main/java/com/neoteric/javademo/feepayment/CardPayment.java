package com.neoteric.javademo.feepayment;

public class CardPayment extends StudentFeePayment {

    public CardPayment(Student student){
        super(student);
    }

    @Override
    public double getExtraCharges(){
        return student.getTotalFees() * 0.02;
    }

    @Override
    public String getPaymentMethod(){
        return "Card";
    }
}
