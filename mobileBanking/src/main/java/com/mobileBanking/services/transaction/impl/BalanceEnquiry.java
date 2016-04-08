package com.mobileBanking.services.transaction.impl;

import com.mobileBanking.domain.Account;
import com.mobileBanking.domain.Transaction;
import com.mobileBanking.services.transaction.TransactionChain;

public class BalanceEnquiry extends TransactionChain {

    public Transaction getTransaction(Account account) {
        Transaction transaction = new Transaction.Builder()
                .transactionNumber("1")
                .transactionType("balance enquiry")
                .build();

        System.out.println("\nBalance Enquiry\n");
        System.out.println("Account Type : " + account.getAccountType());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance : R" + account.getBalance());
        System.out.println("Limit : R"+ account.getLimit());
        return transaction;
    }

    @Override
    public String handleRequest(int request) {

        if(request == 1) {
            return "balanceEnquiry";
        }
        else{
            if (nextTransaction != null) {
                return nextTransaction.handleRequest(request);
            }
            return null;
        }
    }
}
