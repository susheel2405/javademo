package com.neoteric.javademo.abstracandinterface;

public class ClothingBrandDiscountFactory implements BrandAndDiscountFactory {



    private static String brand = "USPA";
    @Override
    public String getBrandName() {
        return brand;
    }

    @Override
    public double getDiscountedPrice(double amount) {
        return amount - (amount * 0.20);
    }
}
