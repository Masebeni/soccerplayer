package com.mobileBanking.factories.transaction;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.domain.Transaction;
import com.mobileBanking.services.account.ChooseAccount;
import com.mobileBanking.services.transaction.TransactionChain;
import com.mobileBanking.services.transaction.impl.BalanceEnquiry;
import com.mobileBanking.services.transaction.impl.Withdraw;

public class TransactionFactoryImpl implements TransactionFactory {

    private Transaction transaction = null;

    private static TransactionFactoryImpl transactionFactory = null;

    public static TransactionFactoryImpl getInstance(){
        if(transactionFactory ==null)
            transactionFactory = new TransactionFactoryImpl();
        return transactionFactory;
    }

    public Transaction getTransaction(String transactionType) {

        Account account = ChooseAccount.displayAccountOptions();

        if (transactionType.equalsIgnoreCase("balanceEnquiry")) {
            // need to pass through account object
            transaction = new BalanceEnquiry().getTransaction(account);
        }

        if (transactionType.equalsIgnoreCase("Withdraw")) {
            transaction = new Withdraw().getTransaction(account);
        }
        if (transactionType.equalsIgnoreCase("Prepaid")) {
            transaction = new Withdraw().getTransaction(account);
        }

        return transaction;
    }

    public static String getTransaction(int value){

        TransactionChain chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static TransactionChain setUpChain(){

        TransactionChain balanceEnquiry = new BalanceEnquiry();
        TransactionChain withdraw = new Withdraw();
        balanceEnquiry.setNextTransaction(withdraw);
        return balanceEnquiry;

    }

}

