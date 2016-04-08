package com.mobileBanking.factories.Client;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.Client;

public interface ClientFactory {
    Client createClient(String cardNumber, String pin);
}
