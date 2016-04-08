package com.mobileBanking.services.account.impl;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.factories.account.AccountFactory;

public class Credit implements AccountFactory {
    public Account getAccount(String accountType) {
         Account account = new Account.Builder()
                .accountNumber("1002")
                .accountType("Credit")
                .balance(5000)
                .limit(500)
                .build();
        return account;
    }
}
