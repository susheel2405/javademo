package com.neoteric.javademo.bankaccount;

public class BankService {
    public BankAccount1 createAccount(String accountId, Customer customer, double initialDeposit, Bank bank){
        BankAccount1 account = new BankAccount1(customer, initialDeposit,bank);
        bank.addAccount(accountId, account);
        return account;
    }
}
