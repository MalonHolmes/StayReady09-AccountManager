package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public class CheckingAccount extends BankAccount{

    protected CheckingAccount(Integer acctNum, double balance, double fees, String name,
                              int pin, LocalDate dateOpened) {
        super(acctNum, balance, fees, name, pin, dateOpened);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public Integer getAcctNum(){
        return acctNum;
    }

    public double getBalance(){
        return balance;
    }

    public double getFees(){
        return fees;
    }

    public String getName(){
        return name;
    }

    public int getPin(){
        return pin;
    }

    public void deposit(Double money){
        balance += money;
    }

    public void withdrawal(Double money) {
        balance -= money;
    }
}
