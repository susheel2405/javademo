package com.neoteric.javademo.abstracandinterface;

public class ElectronicsShop extends ShoppingMall {



    @Override
    protected BrandAndDiscountFactory getBrandAndDiscountFactory() {
        return new ElectronicsBrandDiscountFactory();
    }

    @Override
    protected void makePayment(double amount) {
        PaymentMethod payment = new NetBankingPayment();
        payment.pay(amount);
    }
}
