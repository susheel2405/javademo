package com.neoteric.javademo.atm;

import java.util.Map;

public class ATMService {
    String name;
    String pinNumber;
    String fromDate;
    String accountnumber;
    String toDate;
    double balance;


    boolean insertCard(Card card){
        DBService dbService = new DBService();
        Map<String, Card> cardDB = dbService.cardData;
        if (cardDB.containsKey(card.number)){
            return true;
        }else {
            return false;
        }
    }
    boolean enterPin(Pin vpin){
        DBService dbService = new DBService();
        Map<String, Pin> pinCardDB = dbService.cardPinData;
        Pin dbPin = pinCardDB.get(vpin.cardNumber);

        if (vpin==dbPin){
            return true;
        }else {
            return false;
        }
    }
    boolean withdraw(Amount inputAmount, Card card){
        DBService dbService = new DBService();
        Map<String, Amount> balanceMap = dbService.balanceData;
        Amount availableamt = balanceMap.get(card.number);
        if (availableamt.amount > inputAmount.amount){
            double totalBalance = availableamt.amount - inputAmount.amount;
            return true;
        }else {
            return false;
        }



    }
}
