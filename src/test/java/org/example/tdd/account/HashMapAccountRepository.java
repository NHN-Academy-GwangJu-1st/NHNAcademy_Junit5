package org.example.tdd.account;

import java.util.HashMap;

public class HashMapAccountRepository implements AccountRepository {
    private final HashMap<Long, Account> source = new HashMap<>();

    @Override
    public void insert(Account account) {
        source.put(account.getId(), account);
    }

    @Override
    public Account findByid(Long id) {
        return source.get(id);
    }

    @Override
    public Account findByUsername(String username) {
        return null;
    }
}
