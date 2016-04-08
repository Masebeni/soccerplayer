package com.mobileBanking.factories.Client;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Client;

public class ClientFactoryImpl implements ClientFactory {

    private static ClientFactoryImpl clientFactoryImpl = null;

    public static ClientFactoryImpl getInstance(){
        if(clientFactoryImpl == null)
            clientFactoryImpl = new ClientFactoryImpl();
        return clientFactoryImpl;
    }

    public Client createClient(String cardNumber, String pin)
    {
        Client client = new Client.Builder()
                .profileNumber(cardNumber)
                .cellNumber("078")
                .pin(pin)
                .name("Siya")
                .build();
        return client;
    }
}
