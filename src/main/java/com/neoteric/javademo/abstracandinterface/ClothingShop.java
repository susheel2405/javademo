package com.neoteric.javademo.abstracandinterface;

public class ClothingShop extends ShoppingMall {

    @Override
    protected BrandAndDiscountFactory getBrandAndDiscountFactory() {
        return new ClothingBrandDiscountFactory();
    }

    @Override
    protected void makePayment(double amount) {
        PaymentMethod payment = new CardPayment();
        payment.pay(amount);
    }


}
