package com.mobileBanking;

import com.mobileBanking.domain.Account;
import com.mobileBanking.factories.account.AccountFactoryImpl;
import com.mobileBanking.services.account.impl.Cheque;
import com.mobileBanking.services.account.impl.Credit;
import com.mobileBanking.services.account.impl.Savings;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAccount {

    Account account;

    @Test
    public void testBuilder() throws Exception {
        account = new Account.Builder()
                .accountType("credit")
                .accountNumber("123")
                .limit(200)
                .balance(300)
                .build();

        Assert.assertEquals(account.getBalance(), 300.0);
    }

    @Test
    public void testSavings() throws Exception {
        account = new AccountFactoryImpl().getAccount("Savings");
        Assert.assertSame(account.getClass(), new Savings().getAccount("savings").getClass());
    }

    @Test
    public void testCredit() throws Exception {
        account = new AccountFactoryImpl().getAccount("credit");
        Assert.assertSame(account.getClass(), new Credit().getAccount("credit").getClass());
    }

    @Test
    public void testCheque() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        Assert.assertSame(account.getClass(), new Cheque().getAccount("credit").getClass());
    }

    @Test
    public void testDebit() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        account.debit(200);
        Assert.assertEquals(account.getBalance(), 9800.0);
    }

    @Test
    public void testCreditMethod() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        account.credit(1000);
        Assert.assertEquals(account.getBalance(), 11000.0);
    }
}
