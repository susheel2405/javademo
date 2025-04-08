package com.neoteric.javademo.accountsummary;

import java.util.Date;

public class Transaction {
    private String fromAccount;
    private String toAccount;
    private String transactionType;
    private Date transactionDate;
    private double amount;

    public Transaction( String fromAccount, String toAccount, Date transactionDate, String transactionType,double amount) {
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
