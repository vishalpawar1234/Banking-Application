package com.app.service;

import com.app.entity.Account;

import java.util.Optional;

public interface AccountService {
    Account createAccount(Account account);
    Optional<Account> getAccount(Long id);
    Account deposit(Long id, double amount);
    Account withdraw(Long id, double amount);
}
