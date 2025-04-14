package com.neoteric.javademo.abstracandinterface;

public class ElectronicsBrandDiscountFactory implements BrandAndDiscountFactory{

    private static String brand = "Sony";
    @Override
    public String getBrandName() {
        return brand;
    }

    @Override
    public double getDiscountedPrice(double amount) {
        return amount - (amount * 0.10);
    }
}
