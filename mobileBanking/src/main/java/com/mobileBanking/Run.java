package com.mobileBanking;

/**
 * Created by Isiphile on 2016/04/03.
 */

import com.mobileBanking.domain.MobileBank;

public class Run {

    public static void main(String[] args) {
        MobileBank mobileBank = new MobileBank.Builder()
                .build();
        mobileBank.accessATM();
    }
}
