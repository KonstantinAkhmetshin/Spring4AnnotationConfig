package com.outbottle.services.impl;

import com.outbottle.models.Account;
import com.outbottle.repository.AccountRepository;
import com.outbottle.services.CashMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashMachineServiceImpl implements CashMachineService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean checkPin(String pin) {
        return false;
    }

    @Override
    public Account getAccountInfo(String pan) {
        return accountRepository.findOne(pan);
    }

    @Override
    public boolean getCash(String pan) {
        return false;
    }
}
