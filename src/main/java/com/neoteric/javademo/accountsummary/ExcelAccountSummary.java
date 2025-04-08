package com.neoteric.javademo.accountsummary;

import java.util.Date;
import java.util.List;

public class ExcelAccountSummary extends AccountSummaryService{
    @Override
    String write(List<Transaction> transactionList) {

        System.out.println("Writing data into EXCEL");
        return "accountsummary.excel" + new Date()+ ".excel";
    }
}
