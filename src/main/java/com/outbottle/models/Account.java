package com.outbottle.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Account {
    @Id
    private String pan;
    private String pinCode;
    private int panCounter;
    private BigDecimal balance;

    public Account() {
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getPanCounter() {
        return panCounter;
    }

    public void setPanCounter(int panCounter) {
        this.panCounter = panCounter;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "pan='" + pan + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", panCounter=" + panCounter +
                ", balance=" + balance +
                '}';
    }
}
