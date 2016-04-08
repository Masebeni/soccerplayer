package com.mobileBanking.services;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.factories.transaction.TransactionFactoryImpl;


import java.util.Scanner;

public  class TransactionList {

    private Scanner scanner = new Scanner(System.in);
    private String transactionSelection;
    private int opt;

    public void displayMenu() {
        System.out.println("Please select a transaction :\n"+"1   - Balance Enquiry\n" + "2   - Deposit\n" + "3   - Withdraw\n" + "4  - Exit\n");
        System.out.println("Please select an option : ");
        opt = scanner.nextInt();

        if(opt == 4)
            System.exit(0123);

        transactionSelection = TransactionFactoryImpl.getTransaction(opt);
    }

    public void getTransaction()
    {
        new TransactionFactoryImpl().getTransaction(transactionSelection);
    }

}
