package com.mobileBanking;

import com.mobileBanking.domain.Transaction;
import com.mobileBanking.factories.transaction.TransactionFactoryImpl;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TestTransaction {

    Transaction transaction;

    @Test
    public void testWithdraw() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(3), null);
    }
    @Test
    public void testPrepaid() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(2), "withdraw");
    }
    @Test
    public void testBalanceEnq() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(1), "balanceEnquiry");
    }

    @Test
    public void testTransaction() throws Exception {
        transaction = new Transaction.Builder()
                .transactionNumber("852")
                .transactionType("741")
                .build();
        Assert.assertEquals(transaction.getTransactionNumber(), "852");
    }

    @Test
    public void testNullness() throws Exception {
        transaction = new Transaction.Builder()
                .transactionNumber("852")
                .build();
        Assert.assertEquals(transaction.getTransactionType(), null);
    }
}
