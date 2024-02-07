package com.rijai.users.services;

import com.rijai.users.model.Account;
import com.rijai.users.repositry.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAccounts() {
        List<Account> allAccounts = new ArrayList<>();
        accountRepository.findAll().forEach(allAccounts::add);

        return allAccounts;
    }
    @Override
    public Account getAccount(long id) {
        Optional<Account> account = accountRepository.findById(id);

        if(account.isPresent()) return account.get();

        return null;
    }
    @Override
    public Account addAccount(Account account) { return accountRepository.save(account); }
    @Override
    public Account updateAccount(long id, Account account) {
        return accountRepository.save(account);
    }
    @Override
    public void deleteAccount(long id) {
        accountRepository.deleteById(id);
    }
}

