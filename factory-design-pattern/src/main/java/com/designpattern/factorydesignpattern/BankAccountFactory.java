package com.designpattern.factorydesignpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BankAccountFactory {
    private Map<String, BankAccount> bankAccountsFactory;
    public BankAccountFactory() {
        bankAccountsFactory = new HashMap<>();
        bankAccountsFactory.put("SAVING", new SavingAccount());
        bankAccountsFactory.put("CURRENT", new CurrentAccount());
    }
    public BankAccount getAccount(String accountType) {
        BankAccount bankAccount = bankAccountsFactory.get(accountType);
        if(Objects.isNull(bankAccount)) {
            throw new RuntimeException("Invalid Request to get Bank Account");
        }
        return bankAccount;
    }
}
