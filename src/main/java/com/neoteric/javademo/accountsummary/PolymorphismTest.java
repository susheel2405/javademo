package com.neoteric.javademo.accountsummary;

public class PolymorphismTest {

    public static void main(String[] args) {
        AccountSummaryService pdfService = new PDFAccountSummaryService();
       AccountFile accountFile =  pdfService.getAccountSummary("193122010002099");

        System.out.println("download file" + accountFile.getFilename());
    }
}
