package com.neoteric.javademo.interestrate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class InterestCalculationMain {
    public static void main(String[] args) {


        // Creates a date formater to convert local date into a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        // Stores today's date.
        LocalDate localDate = LocalDate.now();


        // HashMap Stores different Bank Account objects
        Map<String, BankAccount> accountMap = new HashMap<>();


        // creating customer object
        Customer venkat = new Customer("Venkat Reddy", "venkat@example.com", "9700638369");


        // Creating account type objects
        BankAccount savings = new SavingsAccount(50000, venkat, "Anil Reddy");
        BankAccount fdAccount = new FixedDepositAccount(100000, venkat, "Rajesh Reddy");
        BankAccount ppfAccount = new PPFAccount(200000, venkat, "Karthik Reddy", LocalDate.of(2025, 4, 9));


        // Adding account to customer
        venkat.addAccount(savings);
        venkat.addAccount(fdAccount);
        venkat.addAccount(ppfAccount);


        // accountMap stores each account with it's account number as key
        accountMap.put(savings.getAccountNumber(),savings);
        accountMap.put(fdAccount.getAccountNumber(),fdAccount);
        accountMap.put(ppfAccount.getAccountNumber(), ppfAccount);


        // this gets all sets of account numbers
        for(String accNUmber : accountMap.keySet()){


            //Retrives the accoount object using account number
            BankAccount account = accountMap.get(accNUmber);



            // Prints account number, type, nominee
            account.displayAccountDetails();


            // Prints calculated interests by calling the appropriate implementations of calculateInterestrate based on the account type
            System.out.println("Interest: ₹" + account.calculateInterestRate());

            // Calls getMaturityDAte using today's Date as the start
            System.out.println("Maturity Date (from Today): " + account.getMAturityDate(localDate).format(formatter));

            //checks if current account is PPF Account by comparimg the class name
            if (account.getClass().getSimpleName().equals("PPF Account")){
                System.out.println("Can PPf Account be closed? Yes");
            }
        }

    }


}
