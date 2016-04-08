package com.mobileBanking.services.transaction;


public abstract class TransactionChain {

    public TransactionChain nextTransaction;

    public void setNextTransaction(TransactionChain nextTransaction) {
        this.nextTransaction = nextTransaction;
    }
    public abstract String handleRequest(int request);

}
