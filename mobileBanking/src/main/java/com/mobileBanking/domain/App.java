package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.factories.Client.ClientFactoryImpl;
import com.mobileBanking.factories.Client.ClientFactory;

import java.util.Scanner;

public abstract class App {

    static Scanner scanner = new Scanner(System.in);
    static ClientFactory clientFactory = new ClientFactoryImpl();

    public static void runAtm() {

            System.out.println("Please enter your profile number: ");
            String cardNumber = scanner.nextLine();

            System.out.println("Please enter your pin: ");
            String pin = scanner.nextLine();

            Client client = clientFactory.createClient(cardNumber, pin);

            Loging.isValid(client.getProfileNumber(), client.getPin());
    }
}
