package com.mobileBanking.services.transaction.impl;


import com.mobileBanking.domain.Account;
import com.mobileBanking.domain.Transaction;
import com.mobileBanking.services.transaction.TransactionChain;

import java.util.Scanner;

public class Withdraw extends TransactionChain {

    public Transaction getTransaction(Account account) {
        Transaction transaction = new Transaction.Builder()
                .transactionNumber("2")
                .transactionType("withdraw")
                .build();

        account.debit(performWithdraw());

        System.out.println("\nWithdraw\n");
        System.out.println("Account Type : " + account.getAccountType());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance : R" + account.getBalance());
        System.out.println("Limit : R"+ account.getLimit());

        return transaction;
    }

    public double performWithdraw()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to withdraw");
        int amount = scanner.nextInt();
        return amount;
    }

    @Override
    public String handleRequest(int request) {

        if(request == 2) {
            return "withdraw";
        }
        else{
            if (nextTransaction != null) {
                return nextTransaction.handleRequest(request);
            }
            return null;
        }
    }
}
