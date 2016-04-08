package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

import java.io.Serializable;

public class Transaction implements Serializable{

    private String transactionType;
    private String transactionNumber;

    private Transaction(){}

    private Transaction(Builder builder)
    {
        this.transactionNumber = builder.transactionNumber;
        this.transactionType = builder.transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public static class Builder
    {
        private String transactionType;
        private String transactionNumber;

        public Builder transactionType(String transactionType)
        {
            this.transactionType = transactionType;
            return this;
        }

        public Builder transactionNumber(String transactionNumber)
        {
            this.transactionNumber = transactionNumber;
            return this;
        }

        public Transaction build()
        {
            return new Transaction(this);
        }

    }
}
