package com.mobileBanking.services.account.impl;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.factories.account.AccountFactory;

public class Savings implements AccountFactory {
    public Account getAccount(String accountType) {
        Account account = new Account.Builder()
                .accountNumber("1003")
                .accountType("Savings")
                .balance(8000)
                .limit(800)
                .build();
        return account;
    }
}
