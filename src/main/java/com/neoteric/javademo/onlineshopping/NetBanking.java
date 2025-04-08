package com.neoteric.javademo.onlineshopping;

public class NetBanking extends PaymentMethod{

    public NetBanking(double amount){
        super(amount);

    }

    @Override
    public void pay() {
        System.out.println("Paid ₹" + amount + "Using NetBanking");
    }

}
