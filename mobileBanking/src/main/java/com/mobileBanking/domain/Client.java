package com.mobileBanking.domain;

/**
 * Created by Isiphile on 2016/04/03.
 */

import java.io.Serializable;

public class Client implements Serializable{

    private String profileNumber;
    private String cellNumber;
    private String name;
    private String pin;

    private Client(){}

    private Client(Builder builder) {

        this.profileNumber = builder.profileNumber;
        this.cellNumber = builder.cellNumber;
        this.name = builder.name;
        this.pin = builder.pin;
    }
    public String getProfileNumber() {
        return profileNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public static class Builder
    {
        private String profileNumber;
        private String cellNumber;
        private String name;
        private String pin;

        public Builder profileNumber(String value){
            this.profileNumber = value;
            return this;
        }

        public Builder cellNumber(String value){
            this.cellNumber = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder pin(String value){
            this.pin = value;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }

}
