package com.neoteric.javademo.onlineshopping;

public class PurchaseDiscount extends Discount{

    @Override
    public double apply(double totalAmount) {
        double discountRate = 0.0;
        if (totalAmount >= 50000) {
            discountRate = 0.10;
        } else if (totalAmount >= 20000) {
            discountRate = 0.05;
        }

        return totalAmount - (totalAmount * discountRate);
    }

    }

