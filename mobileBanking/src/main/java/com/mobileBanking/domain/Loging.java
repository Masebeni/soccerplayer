package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.services.TransactionList;

public abstract class Loging {

    private static boolean validateClient(String cardNumber, String pin) {
         String profileNumber = "123";
         String pin1 = "pin";

        return (profileNumber.equals(cardNumber) & pin1.equals(pin));
    }

    public static void isValid(String cardNumber, String pin) {
        if(validateClient(cardNumber, pin)) {
            TransactionList transactionList = new TransactionList();
            transactionList.displayMenu();
            transactionList.getTransaction();
        }
        else
            System.out.println("invalid pin");
    }

}
