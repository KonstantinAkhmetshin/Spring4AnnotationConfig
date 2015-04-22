package com.outbottle.repository.impl;

import com.google.common.collect.ImmutableMap;
import com.outbottle.models.Account;
import com.outbottle.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;


@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Autowired
    private DataSource dataSource;

    @Override
    public Account getByPan(String pan) {
        String query = "select PAN,PIN_CODE, PIN_COUNTER,BALANCE from ACCOUNTS where PAN = :pan";
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        return (Account) jdbcTemplate.queryForObject(query, ImmutableMap.of("pan", pan), new BeanPropertyRowMapper(Account.class));
    }

    @Override
    public void update(Account account) {
        String query = "update ACCOUNTS " +
                "   set PAN = :pan," +
                "       PIN_CODE = :pinCode," +
                "       PIN_COUNTER = :pinCounter," +
                "       BALANCE = :balance" +
                " where PAN = :pan";
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        jdbcTemplate.update(query, ImmutableMap.of("pan", account.getPan(),
                        "pinCode", account.getPinCode(),
                        "pinCounter", account.getPanCounter(),
                        "balance", account.getBalance())
        );

    }
}
