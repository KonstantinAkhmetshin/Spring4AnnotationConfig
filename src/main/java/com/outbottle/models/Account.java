package com.outbottle.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Account {
    @Id
    private String panId;
    private String pinCode;
    private int panCounter;
    private BigDecimal balance;

    public Account() {
    }

    public String getPanId() {
        return panId;
    }

    public void setPanId(String panId) {
        this.panId = panId;
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
                "panId='" + panId + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", panCounter=" + panCounter +
                ", balance=" + balance +
                '}';
    }
}
