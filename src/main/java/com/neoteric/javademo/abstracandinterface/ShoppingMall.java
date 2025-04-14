package com.neoteric.javademo.abstracandinterface;

public abstract class ShoppingMall {

    public final void shop(String customerName, double amount) {
        greetCustomer(customerName);

        BrandAndDiscountFactory factory = getBrandAndDiscountFactory();
        String brand = factory.getBrandName();
        double finalAmount = factory.getDiscountedPrice(amount);

        System.out.println("Brand: " + brand);
        System.out.println("Original Price: ₹" + amount);
        System.out.println("Discounted Price: ₹" + finalAmount);

        makePayment(finalAmount);
        thankCustomer();
    }

    protected void greetCustomer(String name) {
        System.out.println("\nWelcome, " + name + "!");
    }

    protected abstract BrandAndDiscountFactory getBrandAndDiscountFactory();
    protected abstract void makePayment(double amount);

    protected void thankCustomer() {
        System.out.println("Thank you for shopping with us!\n");
    }
}
