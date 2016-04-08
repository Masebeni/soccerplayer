package com.mobileBanking.factories.account;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.services.account.impl.Cheque;
import com.mobileBanking.services.account.impl.Credit;
import com.mobileBanking.services.account.impl.Savings;

public class AccountFactoryImpl implements AccountFactory{

    private static AccountFactoryImpl accountFactory = null;
    private Account account;

    public static AccountFactoryImpl getInstance(){
        if(accountFactory == null)
            accountFactory = new AccountFactoryImpl();
        return accountFactory;
    }

    public Account getAccount(String accountType) {
        if(accountType.equalsIgnoreCase("credit"))
            account = new Credit().getAccount("credit");
        if(accountType.equalsIgnoreCase("cheque"))
            account = new Cheque().getAccount("cheque");
        if(accountType.equalsIgnoreCase("Savings"))
            account = new Savings().getAccount("savings");
        return account;
    }
}
