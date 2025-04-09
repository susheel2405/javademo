package com.neoteric.javademo.interestrate;

import java.time.LocalDate;
import java.util.UUID;

public abstract class BankAccount {     // Abstract class cannot be instantiated directly


    // ProPerties of Bank account
    protected String accountNumber;
    protected String accountType;
    protected double balance;
    protected String nominee;
    protected Customer customer;


    // Constructor is Used to Initialize the abstract class
    public BankAccount(String accountType, double balance,Customer customer, String nominee){
        this.accountNumber = UUID.randomUUID().toString();
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
        this.nominee = nominee;
    }


    // Abstract Methods, Sub classe must implement them
    public abstract double calculateInterestRate();

    // returns maturity date based on starting date
    public abstract LocalDate getMAturityDate(LocalDate startDate);



    //
    public void displayAccountDetails(){
        System.out.println("\n Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance:  ₹" + balance);
        System.out.println("Owner: " + customer.getName());
        System.out.println("Nominee: " + nominee);

    }



    // Getter methods used to access variables in abstract methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Customer getOwner() {
        return customer;
    }

    public String getNominee() {
        return nominee;
    }

}
