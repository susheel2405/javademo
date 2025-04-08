package com.neoteric.javademo.banktransfer;

public class BankTransferService {
    public static boolean transferAmount(String fromAcc, String toAcc, double amount, PaymentType payment) {
        BankAccount from = BankAccount.getAccount(fromAcc);
        BankAccount to = BankAccount.getAccount(toAcc);

        if (from == null) {
            System.out.println(" FROM Account does not exist.");
            return false;
        }

        if (to == null) {
            System.out.println(" TO Account does not exist.");
            return false;
        }

        if (!payment.validateLimit(amount)) {
            System.out.println(" Transfer amount exceeds the " + payment.getPaymentName() + " limit.");
            return false;
        }

        if (!from.hasSufficientBalance(amount)) {
            System.out.println(" Insufficient Balance.");
            return false;
        }

        from.debit(amount);
        to.credit(amount);

        System.out.println("Transferred ₹" + amount + " from " + fromAcc + " to " + toAcc + " via " + payment.getPaymentName());
        return true;
    }
}
