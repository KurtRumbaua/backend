package com.rijai.users.services;

import com.rijai.users.model.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAccounts();
    Account getAccount(long id);
    Account addAccount(Account account);
    Account updateAccount(long id, Account account);
    void deleteAccount(long id);
}
