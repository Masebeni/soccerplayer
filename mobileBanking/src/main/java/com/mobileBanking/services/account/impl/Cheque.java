package com.mobileBanking.services.account.impl;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.factories.account.AccountFactory;

public class Cheque implements AccountFactory {

    public Account getAccount(String accountType) {

        Account account = new Account.Builder()
                .accountNumber("1001")
                .accountType("Cheque")
                .balance(10000)
                .limit(1000)
                .build();
        return account;
    }
}
