package com.neoteric.javademo.accountsummary;

import java.util.Date;
import java.util.List;

public class PDFAccountSummaryService extends AccountSummaryService{

    @Override
    String write(List<Transaction> transactionList) {

        System.out.println("Writing data into PDF");
        return "accountsummary.pdf" + new Date()+ ".pdf";
    }
}
