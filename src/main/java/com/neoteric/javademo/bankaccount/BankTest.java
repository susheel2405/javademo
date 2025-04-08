package com.neoteric.javademo.bankaccount;

public class BankTest {
    public static void main(String[] args) {
        Address customerAddress = new Address("75-1", "Suryapet", "Telangana", 508212);
        Address nomineeAddress = new Address("75-1", "Suryapet", "telangana", 508212);
        Address bankAddress = new Address("Ground Floor Mg road", "Suryapet", "Telangana", 508212);

        Nominee nominee = new Nominee("Venkat reddy", nomineeAddress);
        Customer customer = new Customer("Susheel Reddy", customerAddress, nominee);
        Bank bank = new Bank("Union BAnk", bankAddress);

        BankService service = new BankService();
        BankAccount1 account = service.createAccount("UBIN2009", customer, 6000, bank);

        account.deposit(2000);
        account.withdraw(2500);
        account.withdraw(6000);
        account.printPassbook();



        BankAccount1 retrivedAccount = bank.getAccount("UBIN2009");
        if (retrivedAccount != null){
            System.out.println("Retrived Account Balance: " + retrivedAccount.getBalance() );
        }
    }
}
