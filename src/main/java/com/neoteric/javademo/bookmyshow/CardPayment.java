package com.neoteric.javademo.bookmyshow;

import java.util.Scanner;

public class CardPayment extends PaymentMethod{

    private String bank;


    @Override
    public double applyCharges(double amount) {
        return amount * 0.025;
    }

    @Override
    public void chooseBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Bank (SBI, HDFC, AXIS, ICICI, Central Bank:");
        bank = scanner.nextLine();
    }

    public String getBank(){
        return bank;
    }
}
