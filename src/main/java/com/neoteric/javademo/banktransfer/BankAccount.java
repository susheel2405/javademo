package com.neoteric.javademo.banktransfer;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    private static Map<String, BankAccount> accounts = new HashMap<>();

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accounts.put(accountNumber, this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean hasSufficientBalance(double amount) {

        return true;
    }
}
