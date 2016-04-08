package com.mobileBanking.services.transaction.impl;


import com.mobileBanking.domain.Account;
import com.mobileBanking.domain.Transaction;
import com.mobileBanking.services.transaction.TransactionChain;

import java.util.Scanner;

public class Prepaid extends TransactionChain {

    public Transaction getTransaction(Account account) {
        Transaction transaction = new Transaction.Builder()
                .transactionNumber("3")
                .transactionType("prepaid")
                .build();

        account.debit(performWithdraw());

        System.out.println("\nPrepaid\n");
        System.out.println("Account Type : " + account.getAccountType());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance : R" + account.getBalance());
        System.out.println("Limit : R"+ account.getLimit());

        return transaction;
    }

    public double performWithdraw()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much airtime would you like to buy: ");
        int amount = scanner.nextInt();
        return amount;
    }

    @Override
    public String handleRequest(int request) {

        if(request == 3) {
            return "prepaid";
        }
        else{
            if (nextTransaction != null) {
                return nextTransaction.handleRequest(request);
            }
            return null;
        }
    }
}
