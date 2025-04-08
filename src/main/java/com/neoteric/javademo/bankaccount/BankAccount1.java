package com.neoteric.javademo.bankaccount;

public class BankAccount1 {
    private double Min_Balance = 5000;
    private Customer customer;
    private double balance;
    private Bank bank;

    public BankAccount1(Customer customer, double initialDeposit, Bank bank){
        if (initialDeposit < Min_Balance){
            throw new IllegalArgumentException("Initial Deposit must be at least" + Min_Balance);
        }

        this.customer = customer;
        this.balance = initialDeposit;
        this.bank = bank;
    }

    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
            System.out.println("Deposited: " + amount + "New Balance: " + balance);
        }
    }

    public void withdraw(double amount){
        if (balance - amount < Min_Balance){
            System.out.println("Withdrawl declined! Minimum Balance of" + Min_Balance + "Must be maintained");
        }else {
            balance -= amount;
            System.out.println("Withdraw: " + amount + ", New Balance: " + balance);
        }
    }
    public double getBalance(){
        return balance;
    }

    public void printPassbook() {
        System.out.println("===== Passbook Details =====");
        System.out.println("Bank Address: " + bank.getAddress());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Account Balance: " + balance);

        if (customer.getNominee() != null) {
            System.out.println("Nominee Name: " + customer.getNominee().getName());
            System.out.println("Nominee Address: " + customer.getNominee().getAddress());
        } else {
            System.out.println("No nominee assigned.");
        }
    }


}
















