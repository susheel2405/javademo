package com.neoteric.javademo.bankaccount;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String name;
    private  Address address;
    private Map<String, BankAccount1> accountMap = new HashMap<>();

    public Bank(String name, Address address){
        this.name=name;
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }
    public void addAccount(String accountId, BankAccount1 account){
        accountMap.put(accountId,account);
    }

    public BankAccount1 getAccount(String accountId){
        return accountMap.get(accountId);
    }

}
