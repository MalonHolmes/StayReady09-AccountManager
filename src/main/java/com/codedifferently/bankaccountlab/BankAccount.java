package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public abstract class BankAccount implements ATM{

    protected final Integer acctNum;
    protected double balance;
    protected double fees;
    protected String name;
    protected int pin;
    protected LocalDate dateOpened;

    protected BankAccount(Integer acctNum, double balance, double fees, String name,
                          int pin, LocalDate dateOpened) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.fees = fees;
        this.name = name;
        this.pin = pin;
        this.dateOpened = dateOpened;
    }

    public abstract void setName(String name);

    public abstract void setPin(int pin);

    public abstract Integer getAcctNum();

    public abstract double getBalance();

    public abstract double getFees();

    public abstract String getName();

    public abstract int getPin();

    // ATM interface methods

    public abstract void deposit(Double money);

    public abstract void withdrawal(Double money);
}
