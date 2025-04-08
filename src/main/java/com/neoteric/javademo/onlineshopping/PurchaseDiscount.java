package com.neoteric.javademo.onlineshopping;

public class PurchaseDiscount extends Discount{

    @Override
    public double apply(double totalAmount) {     // Implements the abstractMethod apply()




        double discountRate = 0.0;
        if (totalAmount >= 50000) { // Applies 10% discount if total is above ₹50000
            discountRate = 0.10;

        } else if (totalAmount >= 20000) {  //5% if above ₹20000
            discountRate = 0.05;
        }

        return totalAmount - (totalAmount * discountRate);
    }

    }

