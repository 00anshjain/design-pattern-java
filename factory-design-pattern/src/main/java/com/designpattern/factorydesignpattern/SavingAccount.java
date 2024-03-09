package com.designpattern.factorydesignpattern;

import java.math.BigDecimal;

public class SavingAccount implements BankAccount {
    private BigDecimal balance;

    public SavingAccount() {
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void depositMoney(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
}
