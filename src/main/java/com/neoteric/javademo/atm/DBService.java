package com.neoteric.javademo.atm;

import java.util.HashMap;
import java.util.Map;

public class DBService {
    Map<String, Card> cardData = new HashMap<>();

    Map<String, Pin> cardPinData = new HashMap<>();

    Map<String, Amount> balanceData = new HashMap<>();


    public DBService(){
        populateData();
        populatePinData();
        populateBalanceData();

    }

    public void populateData(){
        Card card11 = new Card();

        card11.name = "Susheel Reddy";
        card11.number = "2405";
        card11.fromDate = "17-03-2025";
        card11.toDate = "17-03-2030";
        cardData.put("11111", card11);
    }


    public void populatePinData(){
        Pin pin = new Pin();
        pin.pinNumber = "2405";
        pin.cardNumber = "3009";


        cardPinData.put("3009", pin);
    }

    public void populateBalanceData(){
        Amount amount = new Amount();
        amount.amount = 10000;
        amount.currency = "INR";
        balanceData.put("111111", amount);
    }
}
