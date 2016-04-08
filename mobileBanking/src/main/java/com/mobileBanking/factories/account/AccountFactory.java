package com.mobileBanking.factories.account;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;

public interface AccountFactory {
    Account getAccount(String accountType);
}
