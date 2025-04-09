package com.neoteric.javademo.interestrate;

import java.time.LocalDate;

public class PPFAccount extends BankAccount{


    // Static means mathods shared by all instances
    private static  double INTEREST_RATE = 7.1;
    private LocalDate openingDate;


    // Call Parent constructor and sets acoount type
    public PPFAccount(double balance, Customer customer,String nominee, LocalDate openingDate) {
        super("PPF", balance, customer, nominee);
        this.openingDate = openingDate;
    }


    public boolean canBeClosed(LocalDate today) {
        return today.isAfter(openingDate.plusYears(15));
    }


    // abstarct methods implementations
    @Override
    public double calculateInterestRate() {
        return (balance * INTEREST_RATE)/100;
    }

    @Override
    public LocalDate getMAturityDate(LocalDate startDate) {
        return startDate.plusYears(1);
    }
}
