package com.neoteric.javademo.interestrate;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<BankAccount> accounts;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Accounts:");
        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
        }
    }
}
