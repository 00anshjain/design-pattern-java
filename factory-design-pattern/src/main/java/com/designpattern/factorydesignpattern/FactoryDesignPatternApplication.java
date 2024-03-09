package com.designpattern.factorydesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class FactoryDesignPatternApplication {

    public static void main(String[] args) {
        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        BankAccount bankAccount = bankAccountFactory.getAccount("SAVING");
        bankAccount.depositMoney(BigDecimal.valueOf(500));
        System.out.println(bankAccount.getBalance());

        bankAccount = bankAccountFactory.getAccount("CURRENT");
        bankAccount.depositMoney(BigDecimal.valueOf(1000));
        System.out.println(bankAccount.getBalance());

        SpringApplication.run(FactoryDesignPatternApplication.class, args);
    }

}
