package com.outbottle.repository;

import com.outbottle.models.Account;


public interface AccountRepository{
    Account getByPan(String pan);
    void update(Account account);
}
