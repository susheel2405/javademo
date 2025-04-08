package com.neoteric.javademo.bookmyshow;

import java.util.Scanner;

public class NetBanking extends PaymentMethod{

    private String bank;

    @Override
    public double applyCharges(double amount) {
        return 0;
    }

    @Override
    public void chooseBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Bank(SBI, AXIS, HDFC, ICICI, Cental Bank):");
        bank = scanner.nextLine();
    }

    public String getBank(){
        return bank;
    }
}
