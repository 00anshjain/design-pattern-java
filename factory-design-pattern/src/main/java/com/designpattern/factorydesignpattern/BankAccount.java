package com.designpattern.factorydesignpattern;

import java.math.BigDecimal;

public interface BankAccount {
    BigDecimal getBalance();
    void depositMoney(BigDecimal amount);

}
