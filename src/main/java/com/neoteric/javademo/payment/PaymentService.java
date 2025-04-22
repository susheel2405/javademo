package com.neoteric.javademo.payment;

public class PaymentService {

    private double balance;

    public PaymentService(double initialBalance) {
        this.balance = initialBalance;
    }

    public void makePayment(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(" Insufficient balance. Available: ₹" + balance + ", Required: ₹" + amount);
        }

        balance -= amount;
        System.out.println(" Payment of ₹" + amount + " successful. Remaining Balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
