package com.neoteric.javademo.accountsummary;

import java.util.*;

public class AccountDBService {

    public static Map<String, List<Transaction>> accountTransactionMap = new HashMap<>();

    public AccountDBService(){

        this.populateData();

    }

    public void populateData(){

        List<Transaction> transactionList = new ArrayList<>();

        Transaction transaction = new Transaction("193122010002099", "111111111", new Date(), "DEBIT", 10000.0);

        Transaction transaction1 = new Transaction("19312201000", "22222222", new Date(), "CREDIT", 5000.0);

        transactionList.add(transaction);
        transactionList.add(transaction1);

        accountTransactionMap.put("193122010002099", transactionList); // putting in account transaction map
    }

    public List<Transaction> getAccountData(String accountNumber){
        List<Transaction> transactionList = accountTransactionMap.get(accountNumber);

        return transactionList;

        }


}
