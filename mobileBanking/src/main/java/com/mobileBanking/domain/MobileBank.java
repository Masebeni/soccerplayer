package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

public class MobileBank {
    private String bankName;
    private String location;

    private MobileBank(){}

    private MobileBank(Builder builder)
    {
        this.bankName = builder.bankName;
        this.location = builder.location;
    }

    public String getBankName() {
        return bankName;
    }

    public String getLocation() {
        return location;
    }

    public void accessATM()
    {
        App.runAtm();
    }

    public static class Builder
    {
        private String bankName;
        private String location;

        public Builder bankName(String bankName)
        {
            this.bankName = bankName;
            return this;
        }

        public Builder location(String location)
        {
            this.location = location;
            return this;
        }

        public Builder copy(MobileBank mobileBank)
        {
            this.bankName = mobileBank.bankName;
            this.location = mobileBank.location;
            return this;
        }

        public MobileBank build()
        {
            return new MobileBank(this);
        }
    }

}
