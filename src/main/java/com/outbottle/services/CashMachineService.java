package com.outbottle.services;


import com.outbottle.models.Account;

public interface CashMachineService {
    boolean checkPin(String pan, String pin);
    Account getAccountInfo(String pan);
    boolean getCash(String pan);
}
