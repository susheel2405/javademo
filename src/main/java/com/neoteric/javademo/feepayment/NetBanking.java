package com.neoteric.javademo.feepayment;

public class NetBanking extends StudentFeePayment {

    public NetBanking(Student student){
        super(student);
    }

    @Override
    public double getExtraCharges(){
        return 0.0;
    }

    @Override
    public String getPaymentMethod(){
        return "NetBanking";
    }

}
