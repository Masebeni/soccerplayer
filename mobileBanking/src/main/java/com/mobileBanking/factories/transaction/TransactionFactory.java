package com.mobileBanking.factories.transaction;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Transaction;

public interface TransactionFactory {
    Transaction getTransaction(String transactionType);
}
