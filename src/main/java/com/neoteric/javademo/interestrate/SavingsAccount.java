package com.neoteric.javademo.interestrate;

import java.time.LocalDate;



// Extends means it inherits properties and methods from super class
public class SavingsAccount extends BankAccount{


    // Static means mathods shared by all instances
    private static double INTEREST_RATE = 4.0;


    // Call Parent constructor and sets acoount type
    public SavingsAccount(double balance, Customer customer,String nominee){
        super("Savings", balance,customer,nominee);
    }



    // abstarct methods implementations
    @Override
    public double calculateInterestRate() {
        return (balance * INTEREST_RATE) / 100/ 4; //quaterly Interest
    }

    @Override
    public LocalDate getMAturityDate(LocalDate startDate) {
        return startDate.plusMonths(3);
    }
}
