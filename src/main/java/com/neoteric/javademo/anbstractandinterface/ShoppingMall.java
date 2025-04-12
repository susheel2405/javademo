package com.neoteric.javademo.anbstractandinterface;

public abstract class ShoppingMall  implements Billable{

    public void logCustomer(String customerName){
        System.out.println("Customer: " + customerName);
    }
}
