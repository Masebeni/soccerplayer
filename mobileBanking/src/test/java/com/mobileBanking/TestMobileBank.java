package com.mobileBanking;


import com.mobileBanking.domain.MobileBank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMobileBank {

    @Test
    public void testObjectCreation() throws Exception {
        MobileBank mobileBank = new MobileBank.Builder()
                .bankName("nedbank")
                .location("cpt")
                .build();

        Assert.assertEquals(mobileBank.getLocation(), "cpt");
    }

    @Test
    public void testObjectCopy() throws Exception {
        MobileBank mobileBank = new MobileBank.Builder()
                .bankName("nedbank")
                .location("cpt")
                .build();

        MobileBank mobileBankCopy = new MobileBank.Builder()
                .copy(mobileBank)
                .build();

        Assert.assertEquals(mobileBank.getLocation(), mobileBankCopy.getLocation());
    }

    @Test
    public void testObjectChange() throws Exception {
        MobileBank mobileBank = new MobileBank.Builder()
                .bankName("nedbank")
                .location("cpt")
                .build();

        MobileBank mobileBankCopy = new MobileBank.Builder()
                .copy(mobileBank)
                .location("jhb")
                .build();

        Assert.assertEquals(mobileBankCopy.getLocation(), "jhb");
    }
}
