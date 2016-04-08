package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

import java.io.Serializable;

public class Account implements Serializable{

    private String accountNumber;
    private String accountType;
    private double balance;
    private double limit;

    private Account(){}

    private Account(Builder builder)
    {
        this.accountNumber = builder.accountNumber;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
        this.limit = builder.limit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public void debit(double amount)
    {
        this.balance = this.balance - amount;
    }

    public void credit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public static class Builder
    {
        private String accountNumber;
        private String accountType;
        private double balance;
        private double limit;

        public Builder accountNumber(String accountNumber)
        {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountType(String accountType)
        {
            this.accountType = accountType;
            return this;
        }

        public Builder balance(double balance)
        {
            this.balance = balance;
            return this;
        }

        public Builder limit(double limit)
        {
            this.limit = limit;
            return this;
        }
        public Account build() {
            return new Account(this);
        }
    }

}
