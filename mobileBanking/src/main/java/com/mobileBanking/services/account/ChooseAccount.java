package com.mobileBanking.services.account;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Account;
import com.mobileBanking.factories.account.AccountFactoryImpl;

import java.util.Scanner;

public abstract class ChooseAccount {

    public static Account displayAccountOptions()
    {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        Account account = null;

        System.out.println("Please select an account : \n" + "1  - Cheque\n" + "2  - Credit\n" + "3  - Savings \n");
        option = scanner.nextInt();

        if(option == 1)
            account = new AccountFactoryImpl().getAccount("Cheque");
        else if(option == 2)
            account = new AccountFactoryImpl().getAccount("Credit");
        else if(option == 3)
            account = new AccountFactoryImpl().getAccount("Savings");

        return account;
    }

}
