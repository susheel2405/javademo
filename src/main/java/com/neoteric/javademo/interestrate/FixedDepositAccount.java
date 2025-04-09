package com.neoteric.javademo.interestrate;

import java.time.LocalDate;



// Extends means it inherits properties and methods from super class
public class FixedDepositAccount extends BankAccount{


    // Static means mathods shared by all instances
    private static double INTEREST_RATE = 6.5;


    // Call Parent constructor and sets acoount type
    public FixedDepositAccount(double balance,Customer customer,String nominee){
        super("Fixed Deposit", balance,customer,nominee);
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
