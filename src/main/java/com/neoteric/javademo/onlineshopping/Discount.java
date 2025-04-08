package com.neoteric.javademo.onlineshopping;



// Base class for all discount types.
public abstract class Discount {
    public abstract double apply(double totalAmount);

}
