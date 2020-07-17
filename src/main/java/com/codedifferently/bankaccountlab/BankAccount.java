package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public abstract class BankAccount implements ATM{

    protected final Integer acctNum;
    protected double balance;
    protected double fees;
    protected String name;
    protected LocalDate dateOpened;

    protected BankAccount(Integer acctNum, double balance, double fees, String name,
                          LocalDate dateOpened) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.fees = fees;
        this.name = name;
        this.dateOpened = dateOpened;
    }

    public abstract void setName(String name);

    public abstract Integer getAcctNum();

    public abstract double getBalance();

    public abstract double getFees();

    public abstract String getName();

    // ATM interface methods

    public abstract void deposit(Double money);

    public abstract void withdrawal(Double money);
}
