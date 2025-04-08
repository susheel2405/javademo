package com.neoteric.javademo.accountsummary;

import java.util.List;
import java.util.Map;

public abstract class AccountSummaryService {

    public AccountFile getAccountSummary(String account){

        AccountDBService dbService = new AccountDBService();
        List<Transaction> transactionList = dbService.getAccountData(account);

        String fileName = write(transactionList);

        AccountFile accountFile = new AccountFile(fileName);
        return accountFile;
    }

    abstract String write( List<Transaction> transactionList); // when ever we see aabstract method it has many forms it implements polymorphism
}
